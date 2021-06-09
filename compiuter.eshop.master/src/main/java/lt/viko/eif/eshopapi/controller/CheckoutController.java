package lt.viko.eif.eshopapi.controller;

import lt.viko.eif.eshopapi.model.Checkout;
import lt.viko.eif.eshopapi.repository.CheckoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.awt.*;
import java.util.Optional;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilderDslKt.withRel;

@RestController
@RequestMapping(value = "/checkouts", produces = MediaType.APPLICATION_JSON_VALUE)
public class CheckoutController {

    @Autowired
    CheckoutRepository checkoutRepository;

    /**
     * Get a list of Checkouts
     * @return
     */
    @GetMapping
    public ResponseEntity<CollectionModel<Checkout>> getCheckout(){
        CollectionModel<Checkout> model = CollectionModel.of(checkoutRepository.findAll());

        final String uriString = ServletUriComponentsBuilder.fromCurrentRequest().build().toUriString();
        model.add(Link.of(uriString,"self"));
        model.add(linkTo(methodOn(CheckoutController.class).getCheckoutById(12L)).withRel("get-one-by-id"));

        return ResponseEntity.ok(model);
    }

    /**
     * Get Checkouts by id
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public ResponseEntity<EntityModel<Checkout>> getCheckoutById(@PathVariable(value = "id") long id){
        Optional<Checkout> checkout = checkoutRepository.findById(id);

        if(checkout.isEmpty()){
            return ResponseEntity.notFound().build();
        }

        EntityModel<Checkout> model = EntityModel.of(checkout.get());
        final String uriString = ServletUriComponentsBuilder.fromCurrentRequest().build().toUriString();
        model.add(Link.of(uriString, "self"));
        model.add(linkTo(methodOn(CheckoutController.class).getCheckout()).withRel("get-all"));

        return ResponseEntity.ok(model);
    }

    /**
     * Delete checkout with given id
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public ResponseEntity deleteCheckoutById(@PathVariable long id){
        Optional<Checkout> checkout = checkoutRepository.findById(id);

        if(checkout.isEmpty()){
            return ResponseEntity.notFound().build();
        }

        checkoutRepository.delete(checkout.get());
        return ResponseEntity.ok().build();
    }

    /**
     * Post new Checkout, provide Checkout object
     * @param checkout
     * @return
     */
    @PostMapping
    public String addCheckout(@RequestBody Checkout checkout){
        return "Checkout added: ";
    }

}
