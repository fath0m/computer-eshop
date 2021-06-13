package lt.viko.eif.eshopapi.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.sql.Date;

/**
 * Represents Payment object which has ManyToOne connections
 * with other Tables Checkout.
 * This class is responsible for getting, setting properties
 * @author Lukas, Eimantas, Jonas, Karolis
 */
@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /**
     * Setting OneToMany connection with checkout
     */
    @JsonManagedReference
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "checkout_id", nullable = false)
    private Checkout checkout;

    private double amountPaid;
    private Date paidAt;

    /**
     * Getter for id field
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * Setter for id field
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for checkout object
     * @return checkout
     */
    public Checkout getCheckout() {
        return checkout;
    }

    /**
     * Setter for checkout object
     * @param checkout
     */
    public void setCheckout(Checkout checkout) {
        this.checkout = checkout;
    }

    /**
     * Getter for amountPaid field
     * @return amountPaid
     */
    public double getAmountPaid() {
        return amountPaid;
    }

    /**
     * Setter for amountPaid field
     * @param amountPaid
     */
    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    /**
     * Getter for paidAt field
     * @return paidAt
     */
    public Date getPaidAt() {
        return paidAt;
    }

    /**
     * Setter for paidAt field
     * @param paidAt
     */
    public void setPaidAt(Date paidAt) {
        this.paidAt = paidAt;
    }
}
