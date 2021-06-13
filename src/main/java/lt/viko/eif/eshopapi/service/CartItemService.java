package lt.viko.eif.eshopapi.service;

import lt.viko.eif.eshopapi.dto.cartItems.CreateCartItemsDTO;
import lt.viko.eif.eshopapi.dto.cartItems.UpdateCartItemsDTO;
import lt.viko.eif.eshopapi.model.Cart;
import lt.viko.eif.eshopapi.model.CartItem;
import lt.viko.eif.eshopapi.model.Computer;
import lt.viko.eif.eshopapi.repository.CartItemRepository;
import lt.viko.eif.eshopapi.repository.CartRepository;
import lt.viko.eif.eshopapi.repository.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Represents CartItemService Object that builds CartItem
 * from DTO, check if Cart Item is Valid, provides creation
 * and update of CartItem
 * @author Karolis,Eimantas,Lukas,Jonas
 * version 1.0
 */
@Service
public class CartItemService {
    /**
     * Adding repositories that we will need
     */
    @Autowired
    CartItemRepository cartItemRepository;
    @Autowired
    CartRepository cartRepository;
    @Autowired
    ComputerRepository computerRepository;

    private CartItem buildFromDTO(CreateCartItemsDTO dto){
        CartItem cartItem = new CartItem();
        cartItem.setQuantity(dto.getQuantity());

        //Relationships
        Optional<Cart> cart = cartRepository.findById(dto.getCartId());
        Optional<Computer> computer = computerRepository.findById(dto.getComputerId());

        cartItem.setCart(cart.get());
        cartItem.setComputer(computer.get());

        //RETURN CartItem object
        return cartItem;
    }

    private boolean isCartItemValid(CartItem cartItem) {
        if (cartItem.getQuantity() < 1) {
            return false;
        }

        if (cartItem.getQuantity() > cartItem.getComputer().getStockQuantity()) {
            return false;
        }

        // Do not allow adding additional items in to the cart once it is fully checked out
        if (cartItem.getCart().isCheckedOut()) {
            return false;
        }

        return true;
    }

    public CartItem createCartItem(CreateCartItemsDTO createCartItemsDTO){
        CartItem cartItem = buildFromDTO(createCartItemsDTO);//provide createCartItemsDto to buildFromDto function

        if (!isCartItemValid(cartItem)) {
            return null;
        }

        return cartItemRepository.save(cartItem);
    }

    public CartItem updateCartItem(Long id, UpdateCartItemsDTO updateCartItemsDTO){
        CartItem cartItem = buildFromDTO(updateCartItemsDTO);//provide createCartItemsDto to buildFromDto function
        cartItem.setId(id);

        if (!isCartItemValid(cartItem)) {
            return null;
        }

        return cartItemRepository.save(cartItem);
    }
}
