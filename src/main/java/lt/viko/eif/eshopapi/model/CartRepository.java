package lt.viko.eif.eshopapi.repository;

import lt.viko.eif.eshopapi.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Long> {
}
