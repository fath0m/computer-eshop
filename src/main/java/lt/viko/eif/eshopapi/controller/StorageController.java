package lt.viko.eif.eshopapi.controller;

import lt.viko.eif.eshopapi.dto.storage.CreateStorageDTO;
import lt.viko.eif.eshopapi.dto.storage.UpdateStorageDTO;
import lt.viko.eif.eshopapi.model.Storage;
import lt.viko.eif.eshopapi.repository.StorageRepository;
import lt.viko.eif.eshopapi.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.Optional;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping(value = "/storages", produces = MediaType.APPLICATION_JSON_VALUE)
public class StorageController {
    @Autowired
    StorageRepository storageRepository;
    @Autowired
    StorageService storageService;
    /**
     * Get a list of Storage objects
     * @return
     */
    @GetMapping
    public ResponseEntity<CollectionModel<Storage>> getStorages() {
        CollectionModel<Storage> model = CollectionModel.of(storageRepository.findAll());

        final String uriString = ServletUriComponentsBuilder.fromCurrentRequest().build().toUriString();
        model.add(Link.of(uriString, "self"));
        model.add(linkTo(methodOn(StorageController.class).getStorageById(12L)).withRel("get-one-by-id"));

        return ResponseEntity.ok(model);
    }

    /**
     * Get Storage provide id
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public ResponseEntity<EntityModel<Storage>> getStorageById(@PathVariable(value = "id") long id){
        Optional<Storage> storage = storageRepository.findById(id);

        if(storage.isEmpty())
        {
            return ResponseEntity.notFound().build();
        }

        EntityModel<Storage> model = EntityModel.of(storage.get());
        final String uriString = ServletUriComponentsBuilder.fromCurrentRequest().build().toUriString();
        model.add(Link.of(uriString, "self"));
        model.add(linkTo(methodOn(StorageController.class).getStorages()).withRel("get-all"));

        return ResponseEntity.ok(model);
    }

    /**
     * Delete Storage by provided id
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public ResponseEntity  deleteStorageById(@PathVariable long id){
        Optional<Storage> storage = storageRepository.findById(id);

        if (storage.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        storageRepository.delete(storage.get());
        return ResponseEntity.ok().build();
    }

    /**
     * Post(add) new Storage, provide Storage object
     * @param newStorage
     * @return ResponseEntity<EntityModel<Storage>>
     */
    @PostMapping
    public ResponseEntity<EntityModel<Storage>> addStorage(@RequestBody CreateStorageDTO newStorage){
        /**
         * calling storageService function createStorage and providing newStorage from request body
         */
        Storage storage = storageService.createStorage(newStorage);

        if(storage == null){
            return ResponseEntity.badRequest().build();
        }

        EntityModel<Storage> model = EntityModel.of(storage);
        model.add(linkTo(methodOn(StorageController.class).getStorages()).withRel("get-all"));
        model.add(linkTo(methodOn(StorageController.class).getStorageById(12L)).withRel("get-one-by-id"));

        return ResponseEntity.ok(model);
    }

    /**
     * PUT request to route /storages/{id}. Have to provide UpdateStorageDTO
     * @param newStorage
     * @param id
     * @return ResponseEntity<EntityModel<Storage>>
     */
    @PutMapping(value="/{id}")
    public ResponseEntity<EntityModel<Storage>> updateStorageById(@RequestBody UpdateStorageDTO newStorage, @PathVariable(value= "id") long id){

        Optional<Storage> storage = storageRepository.findById(id);

        if(storage.isEmpty())
            return ResponseEntity.notFound().build();

        Storage updateStorage = storageService.updateStorage(id, newStorage);

        EntityModel<Storage> model = EntityModel.of(updateStorage);
        final String uriString = ServletUriComponentsBuilder.fromCurrentRequest().build().toUriString();
        model.add(Link.of(uriString, "self"));
        model.add(linkTo(methodOn(StorageController.class).getStorageById(updateStorage.getId())).withRel("get-this-by-id"));
        model.add(linkTo(methodOn(StorageController.class).getStorages()).withRel("get-all"));

        return ResponseEntity.ok(model);
    }
}
