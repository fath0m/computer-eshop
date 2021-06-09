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
    private String firstName;
    private String lastName;
    private String deliveryAddress;
    private String deliveryCity;
    private String deliveryCountry;
    private boolean isPaidOut;

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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryCity() {
        return deliveryCity;
    }

    public void setDeliveryCity(String deliveryCity) {
        this.deliveryCity = deliveryCity;
    }

    public String getDeliveryCountry() {
        return deliveryCountry;
    }

    public void setDeliveryCountry(String deliveryCountry) {
        this.deliveryCountry = deliveryCountry;
    }

    public boolean isPaidOut() {
        return isPaidOut;
    }

    public void setPaidOut(boolean paidOut) {
        isPaidOut = paidOut;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
    
}
