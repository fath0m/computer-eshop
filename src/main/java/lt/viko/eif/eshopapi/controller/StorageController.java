package lt.viko.eif.eshopapi.controller;

import lt.viko.eif.eshopapi.model.Storage;
import lt.viko.eif.eshopapi.repository.StorageRepository;
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
@RequestMapping(value = "/storage", produces = MediaType.APPLICATION_JSON_VALUE)
public class StorageController {
    @Autowired
    StorageRepository storageRepository;
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
     * @param storage
     * @return
     */
    @PostMapping
    public String addProcessor(@RequestBody Storage storage){
        return "Storage added";
    }
}
