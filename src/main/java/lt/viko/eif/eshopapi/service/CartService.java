package lt.viko.eif.eshopapi.service;

import lt.viko.eif.eshopapi.dto.cart.CreateCartDTO;
import lt.viko.eif.eshopapi.dto.cart.UpdateCartDTO;
import lt.viko.eif.eshopapi.model.Cart;
import lt.viko.eif.eshopapi.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Represents CartService Object that builds Cart
 * from DTO,provides creation and update of Cart
 * @author Karolis,Eimantas,Lukas
 * version 1.0
 */
@Service
public class CartService {
    @Autowired
    CartRepository cartRepository;

    private Cart buildFromDTO(CreateCartDTO dto){
        Cart cart = new Cart();
        cart.setCheckedOut(dto.isCheckedOut());

        return cart;
    }

    public Cart createCart(CreateCartDTO createCartDTO){
        Cart cart = buildFromDTO(createCartDTO);

        return cartRepository.save(cart);
    }

    public Cart updateCart(Long id, UpdateCartDTO updateCartDTO){
        Cart cart = buildFromDTO(updateCartDTO);
        cart.setId(id);

        return cartRepository.save(cart);
    }
}
