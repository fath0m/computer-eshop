package lt.viko.eif.eshopapi.service;

import lt.viko.eif.eshopapi.dto.payment.CreatePaymentDTO;
import lt.viko.eif.eshopapi.dto.payment.UpdatePaymentDTO;
import lt.viko.eif.eshopapi.model.CartItem;
import lt.viko.eif.eshopapi.model.Checkout;
import lt.viko.eif.eshopapi.model.Computer;
import lt.viko.eif.eshopapi.model.Payment;
import lt.viko.eif.eshopapi.repository.CartItemRepository;
import lt.viko.eif.eshopapi.repository.CheckoutRepository;
import lt.viko.eif.eshopapi.repository.ComputerRepository;
import lt.viko.eif.eshopapi.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    @Autowired
    CheckoutRepository checkoutRepository;

    @Autowired
    CartItemRepository cartItemRepository;

    @Autowired
    ComputerRepository computerRepository;

    private Payment buildFromDTO(CreatePaymentDTO dto){
        Payment payment = new Payment();
        payment.setAmountPaid(dto.getAmountPaid());
        payment.setPaidAt(dto.getPaidAt());

        Optional<Checkout> checkout = checkoutRepository.findById(dto.getCheckOutId());

        payment.setCheckout(checkout.get());

        return payment;
    }

    private boolean isPaymentValid(Payment payment) {
        // Cant pay twice
        if (payment.getCheckout().isPaidOut()) {
            return false;
        }

        return true;
    }

    public Payment createPayment(CreatePaymentDTO createPaymentDTO){
        Payment payment = buildFromDTO(createPaymentDTO);

        if (!isPaymentValid(payment)) {
            return null;
        }

        payment = paymentRepository.save(payment);
        
        if (payment != null) {
            Checkout checkout = payment.getCheckout();
            checkout.setPaidOut(true);

            checkoutRepository.save(checkout);

            // Deduct computer stock quantities
            var cartItems = cartItemRepository.findAllByCart(checkout.getCart());

            for (CartItem cartItem: cartItems) {
                Computer computer = cartItem.getComputer();
                computer.setStockQuantity((int) (computer.getStockQuantity() - cartItem.getQuantity()));
                computerRepository.save(computer);
            }
        }

        return payment;
    }

    public Payment updatePaymentId(Long id, UpdatePaymentDTO updatePaymentDTO){
        Payment payment = buildFromDTO(updatePaymentDTO);
        payment.setId(id);

        return paymentRepository.save(payment);
    }
}
