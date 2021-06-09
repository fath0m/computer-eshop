package lt.viko.eif.eshopapi.repository;

import lt.viko.eif.eshopapi.model.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Long> {
}
