package lt.viko.eif.eshopapi.controller;

import lt.viko.eif.eshopapi.model.Payment;
import lt.viko.eif.eshopapi.repository.PaymentRepository;
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
@RequestMapping(value ="/payments", produces = MediaType.APPLICATION_JSON_VALUE)
public class PaymentController {
    @Autowired
    PaymentRepository paymentRepository;

    /**
     * Get a list of payment objects
     * @return
     */
    @GetMapping
    public ResponseEntity<CollectionModel<Payment>> getPayments(){
        CollectionModel<Payment> model = CollectionModel.of(paymentRepository.findAll());

        final String uriString = ServletUriComponentsBuilder.fromCurrentRequest().build().toUriString();
        model.add(Link.of(uriString, "self"));
        model.add(linkTo(methodOn(PaymentController.class).getPaymentById(12L)).withRel("get-one-by-id"));

        return ResponseEntity.ok(model);
    }

    /**
     * Get payment of given ID
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public ResponseEntity<EntityModel<Payment>> getPaymentById(@PathVariable(value = "id") long id){
        Optional<Payment> payment = paymentRepository.findById(id);

        if(payment.isEmpty())
            return ResponseEntity.notFound().build();

        EntityModel<Payment> model = EntityModel.of(payment.get());
        final String uriString =ServletUriComponentsBuilder.fromCurrentRequest().build().toUriString();
        model.add(Link.of(uriString,"self"));
        model.add(linkTo(methodOn(PaymentController.class).getPayments()).withRel("get-all"));

        return ResponseEntity.ok(model);
    }

    /**
     * Delete payment of given id
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public ResponseEntity deletePaymentById(@PathVariable long id){
        Optional<Payment> payment = paymentRepository.findById(id);

        if(payment.isEmpty())
            return ResponseEntity.notFound().build();

        paymentRepository.delete(payment.get());
        return ResponseEntity.ok().build();
    }

    /**
     * Post payment, provide payment object
     * @param payment
     * @return
     */
    @PostMapping
    public String addPayment(@RequestBody PaymentController payment) { return "Payment added";}
}
