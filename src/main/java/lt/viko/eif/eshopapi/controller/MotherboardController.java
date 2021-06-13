package lt.viko.eif.eshopapi.controller;

import lt.viko.eif.eshopapi.dto.motherboard.CreateMotherboardDTO;
import lt.viko.eif.eshopapi.dto.motherboard.UpdateMotherboardDTO;
import lt.viko.eif.eshopapi.dto.payment.UpdatePaymentDTO;
import lt.viko.eif.eshopapi.model.Motherboard;
import lt.viko.eif.eshopapi.model.Payment;
import lt.viko.eif.eshopapi.repository.MotherboardRepository;
import lt.viko.eif.eshopapi.service.MotherboardService;
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
@RequestMapping(value = "/motherboards", produces = MediaType.APPLICATION_JSON_VALUE)
public class MotherboardController {
    @Autowired
    MotherboardRepository motherboardRepository;
    @Autowired
    MotherboardService motherboardService;
    /**
     * Get a list of Motherboards objects
     * @return
     */
    @GetMapping
    public ResponseEntity<CollectionModel<Motherboard>> getMotherboards() {
        CollectionModel<Motherboard> model = CollectionModel.of(motherboardRepository.findAll());

        final String uriString = ServletUriComponentsBuilder.fromCurrentRequest().build().toUriString();
        model.add(Link.of(uriString, "self"));
        model.add(linkTo(methodOn(MotherboardController.class).getMotherboardById(12L)).withRel("get-one-by-id"));

        return ResponseEntity.ok(model);
    }

    /**
     * Get Motherboard provide id
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public ResponseEntity<EntityModel<Motherboard>> getMotherboardById(@PathVariable(value = "id") long id){
        Optional<Motherboard> motherboard = motherboardRepository.findById(id);

        if(motherboard.isEmpty())
        {
            return ResponseEntity.notFound().build();
        }

        EntityModel<Motherboard> model = EntityModel.of(motherboard.get());
        final String uriString = ServletUriComponentsBuilder.fromCurrentRequest().build().toUriString();
        model.add(Link.of(uriString, "self"));
        model.add(linkTo(methodOn(MotherboardController.class).getMotherboards()).withRel("get-all"));

        return ResponseEntity.ok(model);
    }

    /**
     * Delete Motherboard by provided id
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public ResponseEntity  deleteMotherboardById(@PathVariable long id){
        Optional<Motherboard> motherboard = motherboardRepository.findById(id);

        if (motherboard.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        motherboardRepository.delete(motherboard.get());
        return ResponseEntity.ok().build();
    }

    /**
     * Post(add) new Motherboard, provide Motherboard object
     * @param newMotherboard
     * @return ResponseEntity<EntityModel<Motherboard>>
     */
    @PostMapping
    public ResponseEntity<EntityModel<Motherboard>> addMotherboard(@RequestBody CreateMotherboardDTO newMotherboard){
        /**
         * calling motherboardService function createMontherboard and providing newMotherboard from request body
         */
        Motherboard motherboard = motherboardService.createMontherboard(newMotherboard);

        if (motherboard == null) {
            return ResponseEntity.badRequest().build();
        }

        EntityModel<Motherboard> model = EntityModel.of(motherboard);
        model.add(linkTo(methodOn(MotherboardController.class).getMotherboards()).withRel("get-all"));
        model.add(linkTo(methodOn(MotherboardController.class).getMotherboardById(12L)).withRel("get-one-by-id"));

        return ResponseEntity.ok(model);
    }

    /**
     * PUT request to route /motherboards/{id}. Have to provide UpdateMotherboardDTO
     * @param id
     * @param newMotherboard
     * @return ResponseEntity<EntityModel<Motherboard>>
     */
    @PutMapping(value = "/{id}")
    public ResponseEntity<EntityModel<Motherboard>> updateMotherboardById(@PathVariable(value = "id") long id, @RequestBody UpdateMotherboardDTO newMotherboard) {
        Optional<Motherboard> motherboard = motherboardRepository.findById(id);

        if (motherboard.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        Motherboard updatedMotherboard = motherboardService.update(id, newMotherboard);

        EntityModel<Motherboard> model = EntityModel.of(updatedMotherboard);
        final String uriString = ServletUriComponentsBuilder.fromCurrentRequest().build().toUriString();
        model.add(Link.of(uriString, "self"));
        model.add(linkTo(methodOn(MotherboardController.class).getMotherboardById(updatedMotherboard.getId())).withRel("get-this-by-id"));
        model.add(linkTo(methodOn(MotherboardController.class).getMotherboards()).withRel("get-all"));

        return ResponseEntity.ok(model);
    }
}
