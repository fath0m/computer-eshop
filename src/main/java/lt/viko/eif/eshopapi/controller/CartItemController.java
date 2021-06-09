package lt.viko.eif.eshopapi.controller;

import lt.viko.eif.eshopapi.dto.cart.CreateCartDTO;
import lt.viko.eif.eshopapi.dto.cartItems.CreateCartItemsDTO;
import lt.viko.eif.eshopapi.model.Cart;
import lt.viko.eif.eshopapi.model.CartItem;
import lt.viko.eif.eshopapi.model.Checkout;
import lt.viko.eif.eshopapi.repository.CartItemRepository;
import lt.viko.eif.eshopapi.service.CartItemsService;
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
@RequestMapping(value = "/cartItems", produces = MediaType.APPLICATION_JSON_VALUE)
public class CartItemController {
    @Autowired
    CartItemRepository cartItemRepository;

    @Autowired
    CartItemsService cartItemsService;
    /**
     * Get cart items
     * @return
     */
    @GetMapping
    public ResponseEntity<CollectionModel<CartItem>> getCartItems(){
    CollectionModel<CartItem> model = CollectionModel.of(cartItemRepository.findAll());

    final String uriString = ServletUriComponentsBuilder.fromCurrentRequest().build().toUriString();
        model.add(Link.of(uriString,"self"));
        model.add(linkTo(methodOn(CartItemController.class).getCartItemsById(12L)).withRel("get-one-by-id"));

        return ResponseEntity.ok(model);
}

    /**
     * Get cart item by id
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public ResponseEntity<EntityModel<CartItem>> getCartItemsById(@PathVariable(value = "id") long id){
        Optional<CartItem> cartItem = cartItemRepository.findById(id);

        if(cartItem.isEmpty()){
            return ResponseEntity.notFound().build();
        }

        EntityModel<CartItem> model = EntityModel.of(cartItem.get());
        final String uriString = ServletUriComponentsBuilder.fromCurrentRequest().build().toUriString();
        model.add(Link.of(uriString, "self"));
        model.add(linkTo(methodOn(CartItemController.class).getCartItems()).withRel("get-all"));

        return ResponseEntity.ok(model);
    }

    /**
     * Delete cart item with given id
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public ResponseEntity deleteCartItemById(@PathVariable long id){
        Optional<CartItem> cartItem = cartItemRepository.findById(id);

        if(cartItem.isEmpty()){
            return ResponseEntity.notFound().build();
        }

        cartItemRepository.delete(cartItem.get());
        return ResponseEntity.ok().build();
    }

    /**
     * Post new Cart item, provide cart item object
     * @param newCartItems
     * @return
     */
    @PostMapping
    public ResponseEntity<EntityModel<CartItem>> addCartItem(@RequestBody CreateCartItemsDTO newCartItems) {
        CartItem cartItem = cartItemsService.createCartItem(newCartItems);

        if(cartItem == null){
            return ResponseEntity.badRequest().build();
        }
        EntityModel<CartItem> model = EntityModel.of(cartItem);
        model.add(linkTo(methodOn(CartItemController.class).getCartItems()).withRel("get-all"));
        model.add(linkTo(methodOn(CartItemController.class).getCartItemsById(12L)).withRel("get-one-by-id"));

        return ResponseEntity.ok(model);
    }

}
