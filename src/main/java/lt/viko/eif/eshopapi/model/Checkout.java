package lt.viko.eif.eshopapi.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lt.viko.eif.eshopapi.constant.Currency;

import javax.persistence.*;

@Entity
@Table(name = "checkouts")
public class Checkout {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String Firstname;
    private String Lastname;
    private String DeliveryAddress;
    private String DeliveryCity;
    private String DeliveryCountry;
    private boolean IsPaidOut;

    @Enumerated(EnumType.STRING)
    private Currency currency;

    @JsonManagedReference
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    private Cart cart;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() { return Firstname; }

    public void setFirstname(String firstname) { Firstname = firstname; }

    public String getLastname() { return Lastname; }

    public void setLastname(String lastname) { Lastname = lastname; }

    public String getDeliveryAddress() {
        return DeliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        DeliveryAddress = deliveryAddress;
    }

    public String getDeliveryCity() {
        return DeliveryCity;
    }

    public void setDeliveryCity(String deliveryCity) {
        DeliveryCity = deliveryCity;
    }

    public String getDeliveryCountry() {
        return DeliveryCountry;
    }

    public void setDeliveryCountry(String deliveryCountry) {
        DeliveryCountry = deliveryCountry;
    }

    public boolean isPaidOut() {
        return IsPaidOut;
    }

    public void setPaidOut(boolean paidOut) {
        IsPaidOut = paidOut;
    }

    public Currency getCurrency() { return currency; }

    public void setCurrency(Currency currency) { this.currency = currency; }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
