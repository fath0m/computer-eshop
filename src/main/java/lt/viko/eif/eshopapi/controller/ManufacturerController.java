package lt.viko.eif.eshopapi.controller;


import lt.viko.eif.eshopapi.dto.manufacturer.CreateManufacturerDTO;
import lt.viko.eif.eshopapi.model.Manufacturer;
import lt.viko.eif.eshopapi.repository.ManufacturerRepository;
import lt.viko.eif.eshopapi.service.ManufacturerService;
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
@RequestMapping(value = "/manufacturers", produces = MediaType.APPLICATION_JSON_VALUE)
public class ManufacturerController {

    @Autowired
    ManufacturerRepository manufacturerRepository;

    @Autowired
    ManufacturerService manufacturerService;
    /**
     * Get a list of Manufacturer objects
     * @return
     */
    @GetMapping
    public ResponseEntity<CollectionModel<Manufacturer>> getManufacturers() {

        CollectionModel<Manufacturer> model = CollectionModel.of(manufacturerRepository.findAll());

        final String uriString = ServletUriComponentsBuilder.fromCurrentRequest().build().toUriString();
        model.add(Link.of(uriString, "self"));
        model.add(linkTo(methodOn(ManufacturerController.class).getManufacturerById(12L)).withRel("get-one-by-id"));

        return ResponseEntity.ok(model);
    }

    /**
     * Get Manufacturer by provide id
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public ResponseEntity<EntityModel<Manufacturer>> getManufacturerById(@PathVariable(value = "id") long id){
        Optional<Manufacturer> manufacturer = manufacturerRepository.findById(id);
        if(manufacturer.isEmpty())
        {
            return ResponseEntity.notFound().build();
        }

        EntityModel<Manufacturer> model = EntityModel.of(manufacturer.get());
        final String uriString = ServletUriComponentsBuilder.fromCurrentRequest().build().toUriString();
        model.add(Link.of(uriString, "self"));
        model.add(linkTo(methodOn(ManufacturerController.class).getManufacturers()).withRel("get-all"));

        return ResponseEntity.ok(model);
    }

    /**
     * Delete Manufacturer by provide id
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public ResponseEntity deleteManufacturerById(@PathVariable long id){
        Optional<Manufacturer> manufacturer = manufacturerRepository.findById(id);
        if (manufacturer.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        manufacturerRepository.delete(manufacturer.get());
        return ResponseEntity.ok().build();
    }

    /**
     * Post(add) new Graphic card, provide Graphic card object
     * @param newManufacturer
     * @return ResponseEntity<EntityModel<Manufacturer>>
     */
    @PostMapping
    public ResponseEntity<EntityModel<Manufacturer>> addManufacturer(@RequestBody CreateManufacturerDTO newManufacturer){
        Manufacturer manufacturer = manufacturerService.createManufacturer(newManufacturer);

        if(manufacturer == null)
            return ResponseEntity.notFound().build();

        EntityModel<Manufacturer> model = EntityModel.of(manufacturer);
        model.add(linkTo(methodOn(ManufacturerController.class).getManufacturers()).withRel("get-all"));
        model.add(linkTo(methodOn(ManufacturerController.class).getManufacturerById(12L)).withRel("get-one-by-id"));

        return ResponseEntity.ok(model);
    }
}
