package lt.viko.eif.eshopapi.controller;

import lt.viko.eif.eshopapi.dto.cart.CreateCartDTO;
import lt.viko.eif.eshopapi.model.Cart;
import lt.viko.eif.eshopapi.repository.CartRepository;
import lt.viko.eif.eshopapi.service.CartService;
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
@RequestMapping(value=" /carts", produces = MediaType.APPLICATION_JSON_VALUE)
public class CartController {

    @Autowired
    CartRepository cartRepository;

    @Autowired
    CartService cartService;
    /**
     * Get a list of Cart Objects
     * @return
     */

    @GetMapping
    public ResponseEntity<CollectionModel<Cart>> getCarts(){
        CollectionModel<Cart> model = CollectionModel.of(cartRepository.findAll());

        final String uriString = ServletUriComponentsBuilder.fromCurrentRequest().build().toUriString();
        model.add(Link.of(uriString, "self"));
        model.add(linkTo(methodOn(CartController.class).getCartById(12L)).withRel("get-one-by-id"));

        return ResponseEntity.ok(model);
    }

    /**
     * Get Cart by given id
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public ResponseEntity<EntityModel<Cart>> getCartById(@PathVariable(value = "id") long id){
        Optional<Cart> cart = cartRepository.findById(id);

        if(cart.isEmpty())
            return ResponseEntity.notFound().build();

        EntityModel<Cart> model = EntityModel.of(cart.get());
        final String uriString = ServletUriComponentsBuilder.fromCurrentRequest().build().toUriString();
        model.add(Link.of(uriString, "self"));
        model.add(linkTo(methodOn(CartController.class).getCarts()).withRel("get-all"));

        return ResponseEntity.ok(model);
    }

    /**
     * Delete Cart by given id
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public ResponseEntity deleteCartById(@PathVariable long id){
        Optional<Cart> model = cartRepository.findById(id);

        if(model.isEmpty())
            return ResponseEntity.notFound().build();

        cartRepository.delete(model.get());
        return ResponseEntity.ok().build();
    }

    /**
     * Post new Cart , provide cart  object
     * @param cart
     * @return
     */
    @PostMapping
    public ResponseEntity<EntityModel<Cart>> addCart(@RequestBody CreateCartDTO newCart){
    Cart cart = cartService.createCart(newCart);

    if(cart == null){
        return ResponseEntity.badRequest().build();
    }

    EntityModel<Cart> model = EntityModel.of(cart);
    model.add(linkTo(methodOn(CartController.class).getCarts()).withRel("get-all"));
    model.add(linkTo(methodOn(CartController.class).getCartById(12L)).withRel("get-one-by-id"));

    return ResponseEntity.ok(model);
    }
}
