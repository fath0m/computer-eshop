package lt.viko.eif.eshopapi.repository;

import lt.viko.eif.eshopapi.model.CartItem;
import org.springframework.data.repository.CrudRepository;

public interface CartItemRepository extends CrudRepository<CartItem,Long> {

}
