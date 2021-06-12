package lt.viko.eif.eshopapi.service;

import lt.viko.eif.eshopapi.dto.payment.CreatePaymentDTO;
import lt.viko.eif.eshopapi.dto.payment.UpdatePaymentDTO;
import lt.viko.eif.eshopapi.model.Checkout;
import lt.viko.eif.eshopapi.model.Payment;
import lt.viko.eif.eshopapi.repository.CheckoutRepository;
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

    private Payment buildFromDTO(CreatePaymentDTO dto){
        Payment payment = new Payment();
        payment.setAmountPaid(dto.getAmountPaid());
        payment.setPaidAt(dto.getPaidAt());

        Optional<Checkout> checkout = checkoutRepository.findById(dto.getCheckOutId());

        payment.setCheckout(checkout.get());

        return payment;
    }

    public Payment createPayment(CreatePaymentDTO createPaymentDTO){
        Payment payment = buildFromDTO(createPaymentDTO);
        payment = paymentRepository.save(payment);
        
        if (payment != null) {
            Checkout checkout = payment.getCheckout();
            checkout.setPaidOut(true);

            checkoutRepository.save(checkout);
        }

        return payment;
    }

    public Payment updatePaymentId(Long id, UpdatePaymentDTO updatePaymentDTO){
        Payment payment = buildFromDTO(updatePaymentDTO);
        payment.setId(id);

        return paymentRepository.save(payment);
    }
}
