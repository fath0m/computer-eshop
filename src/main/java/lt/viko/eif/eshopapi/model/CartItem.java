package lt.viko.eif.eshopapi.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
@Table(name = "cart_items")
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonManagedReference
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "computer_id", nullable = false)
    private Computer computer;

    @JsonManagedReference
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "cart_id", nullable = false)
    private Cart cart;

    private Long quantity;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Computer getComputer() { return computer; }

    public void setComputer(Computer computer) { this.computer = computer; }

    public Cart getCart() { return cart; }

    public void setCart(Cart cart) { this.cart = cart; }

    public Long getQuantity() { return quantity; }

    public void setQuantity(Long quantity) { this.quantity = quantity; }
}
