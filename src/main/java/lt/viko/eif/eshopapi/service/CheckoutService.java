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
        checkout.getFirstname();
        checkout.getLastname();
        checkout.getDeliveryAddress();
        checkout.getDeliveryCity();
        checkout.getDeliveryCountry();
        checkout.getisPaidOut();

        Optional<Cart> cart = cartRepository.findById(dto.getCardId());

        checkout.setCart(cart.get());

        return checkout;
    }

    public Checkout createCheackout(CreateCheckoutDTO createCheckoutDTO){
        Checkout checkout = buildFromDTO(createCheckoutDTO);
        return checkoutRepository.save(checkout);
    }

    public Checkout updateCheackoutById(Long id, UpdateCheckoutDTO updateCheckoutDTO){
        Checkout checkout = buildFromDTO(updateCheckoutDTO);
        checkout.setId(id);

        return checkoutRepository.save(checkout);
    }

}
