package lt.viko.eif.eshopapi.dto.cartItems;

/**
 * This class stores database id's
 * and stores those id's setters and getters
 * @author Lukas, Eimantas, Karolis
 * version 1.0
 */
public class CreateCartItemsDTO {
    private Long computerId;
    private Long cartId;
    private Long quantity;

    public Long getComputerId() {
        return computerId;
    }

    public void setComputerId(Long computerId) {
        this.computerId = computerId;
    }

    public Long getCartId() {
        return cartId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
}
