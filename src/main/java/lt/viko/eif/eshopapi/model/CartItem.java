package lt.viko.eif.eshopapi.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

/**
 * Represents CartItem object which has ManyToOne connections
 * with Computer and Cart tables
 * This class is responsible for getting, setting properties
 * @author Karolis, Eimantas, Lukas, Jonas
 * version 1.0
 */
@Entity
@Table(name = "cart_items")
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * Setting ManyToOne connection with computer through computer_id
     */
    @JsonManagedReference
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "computer_id", nullable = false)
    private Computer computer;
    /**
     * Setting ManyToOne connection with cart through cart_id
     */
    @JsonManagedReference
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "cart_id", nullable = false)
    private Cart cart;

    private Long quantity;

    /**
     * Getter for CartItem id
     * @return id
     */
    public Long getId() { return id; }

    /**
     * Setter for CartItem id
     * @param id
     */
    public void setId(Long id) { this.id = id; }

    /**
     * Getter for computer Object
     * @return computer
     */
    public Computer getComputer() { return computer; }

    /**
     * Setter for computer Object
     * @param computer
     */
    public void setComputer(Computer computer) { this.computer = computer; }

    /**
     * Getter for Cart Object
     * @return cart
     */
    public Cart getCart() { return cart; }

    /**
     * Setter for Cart Object
     * @param cart
     */
    public void setCart(Cart cart) { this.cart = cart; }

    /**
     * Getter for quantity
     * @return quantity
     */
    public Long getQuantity() { return quantity; }

    /**
     * Setter for quantity
     * @param quantity
     */
    public void setQuantity(Long quantity) { this.quantity = quantity; }
}
