package lt.viko.eif.eshopapi.service;

import lt.viko.eif.eshopapi.dto.cartItems.CreateCartItemsDTO;
import lt.viko.eif.eshopapi.dto.cartItems.UpdateCartItemsDTO;
import lt.viko.eif.eshopapi.dto.computer.UpdateComputerDTO;
import lt.viko.eif.eshopapi.model.Cart;
import lt.viko.eif.eshopapi.model.CartItem;
import lt.viko.eif.eshopapi.model.Computer;
import lt.viko.eif.eshopapi.repository.CartItemRepository;
import lt.viko.eif.eshopapi.repository.CartRepository;
import lt.viko.eif.eshopapi.repository.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartItemsService {
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

    public CartItem createCartItem(Long id, CreateCartItemsDTO createCartItemsDTO){
        CartItem cartItem = buildFromDTO(createCartItemsDTO);//provide createCartItemsDto to buildFromDto function
        cartItem.setId(id);

        return cartItemRepository.save(cartItem);
    }

    public CartItem updateCartItem(Long id, UpdateCartItemsDTO updateCartItemsDTO){
        CartItem cartItem = buildFromDTO(updateCartItemsDTO);//provide createCartItemsDto to buildFromDto function
        cartItem.setId(id);

        return cartItemRepository.save(cartItem);
    }
}
