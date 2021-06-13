package lt.viko.eif.eshopapi.controller;

import lt.viko.eif.eshopapi.dto.payment.CreatePaymentDTO;
import lt.viko.eif.eshopapi.dto.payment.UpdatePaymentDTO;
import lt.viko.eif.eshopapi.dto.processor.UpdateProcessorDTO;
import lt.viko.eif.eshopapi.model.Payment;
import lt.viko.eif.eshopapi.model.Processor;
import lt.viko.eif.eshopapi.repository.PaymentRepository;
import lt.viko.eif.eshopapi.service.PaymentService;
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
    @Autowired
    PaymentService paymentService;

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
     * @param newPayment
     * @return ResponseEntity<EntityModel<Payment>>
     */
    @PostMapping
    public ResponseEntity<EntityModel<Payment>> addPayment(@RequestBody CreatePaymentDTO newPayment) {
        /**
         * calling paymentService function createPayment and providing newPayment from request body
         */
        Payment payment = paymentService.createPayment(newPayment);

        if (payment == null) {
            return ResponseEntity.badRequest().build();
        }

        EntityModel<Payment> model = EntityModel.of(payment);
        model.add(linkTo(methodOn(PaymentController.class).getPayments()).withRel("get-all"));
        model.add(linkTo(methodOn(PaymentController.class).getPaymentById(12L)).withRel("get-one-by-id"));

        return ResponseEntity.ok(model);
    }

    /**
     * PUT request to route /payments/{id}. Have to provide UpdatePaymentDTO
     * @param id
     * @param newPayment
     * @return ResponseEntity<EntityModel<Payment>>
     */
    @PutMapping(value = "/{id}")
    public ResponseEntity<EntityModel<Payment>> updatePaymentById(@PathVariable(value = "id") long id, @RequestBody UpdatePaymentDTO newPayment) {
        Optional<Payment> payment = paymentRepository.findById(id);

        if (payment.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        Payment updatedPayment = paymentService.updatePaymentId(id, newPayment);

        EntityModel<Payment> model = EntityModel.of(updatedPayment);
        final String uriString = ServletUriComponentsBuilder.fromCurrentRequest().build().toUriString();
        model.add(Link.of(uriString, "self"));
        model.add(linkTo(methodOn(PaymentController.class).getPaymentById(updatedPayment.getId())).withRel("get-this-by-id"));
        model.add(linkTo(methodOn(PaymentController.class).getPayments()).withRel("get-all"));

        return ResponseEntity.ok(model);
    }

}
