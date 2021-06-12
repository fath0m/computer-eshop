package lt.viko.eif.eshopapi.service;

import lt.viko.eif.eshopapi.dto.checkout.CreateCheckoutDTO;
import lt.viko.eif.eshopapi.dto.checkout.UpdateCheckoutDTO;
import lt.viko.eif.eshopapi.model.Cart;
import lt.viko.eif.eshopapi.model.Checkout;
import lt.viko.eif.eshopapi.repository.CartRepository;
import lt.viko.eif.eshopapi.repository.CheckoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CheckoutService {

    @Autowired
    CheckoutRepository checkoutRepository;

    @Autowired
    CartRepository cartRepository;

    private Checkout buildFromDTO(CreateCheckoutDTO dto){
        Checkout checkout = new Checkout();
        checkout.setFirstName(dto.getFirstName());
        checkout.setLastName(dto.getLastName());
        checkout.setDeliveryAddress(dto.getDeliveryAddress());
        checkout.setDeliveryCity(dto.getDeliveryCity());
        checkout.setDeliveryCountry(dto.getDeliveryCountry());
        checkout.setPaidOut(dto.isPaidOut());

        Optional<Cart> cart = cartRepository.findById(dto.getCardId());
        checkout.setCart(cart.get());

        return checkout;
    }

    private boolean isCheckoutValid(Checkout checkout) {
        // Cart is already checked out, can't have multiple checkouts
        if (checkout.getCart().isCheckedOut()) {
            return false;
        }

        return true;
    }

    public Checkout createCheckout(CreateCheckoutDTO createCheckoutDTO){
        Checkout checkout = buildFromDTO(createCheckoutDTO);

        if (!isCheckoutValid(checkout)) {
            return null;
        }

        checkout = checkoutRepository.save(checkout);

        // Mark cart as check out on success
        if (checkout != null) {
            Cart cart = checkout.getCart();
            cart.setCheckedOut(true);
            cartRepository.save(cart);
        }

        return checkout;
    }

    public Checkout updateCheckoutById(Long id, UpdateCheckoutDTO updateCheckoutDTO){
        Checkout checkout = buildFromDTO(updateCheckoutDTO);
        checkout.setId(id);

        return checkoutRepository.save(checkout);
    }

}
