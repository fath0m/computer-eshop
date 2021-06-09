package lt.viko.eif.eshopapi.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonManagedReference
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "checkout_id", nullable = false)
    private Checkout checkout;

    private double amountPaid;
    private Date paid_at;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Checkout getCheckout() { return checkout; }

    public void setCheckout(Checkout checkout) { this.checkout = checkout; }

    public double getAmountPaid() { return amountPaid; }

    public void setAmountPaid(double amountPaid) { this.amountPaid = amountPaid; }

    public Date getPaid_at() { return paid_at; }

    public void setPaid_at(Date paid_at) { this.paid_at = paid_at; }
}
