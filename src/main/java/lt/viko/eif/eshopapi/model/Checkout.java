package lt.viko.eif.eshopapi.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lt.viko.eif.eshopapi.constant.Currency;

import javax.persistence.*;

/**
 * Represents CheckOut object which has ManyToOne connection
 * with Cart table
 * This class is responsible for getting, setting properties
 * @author Karolis, Lukas, Eimantas, Jonas
 */
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

    /**
     * Currency constant
     */
    @Enumerated(EnumType.STRING)
    private Currency currency;
    /**
     * Setting ManyToOne connection with Cart
     */
    @JsonManagedReference
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    private Cart cart;

    /**
     * Getter for Checkout id
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * Setter for Checkout id
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter to get first name
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter to set first name
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter to get last name
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter to set last name
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter to get delivery address
     * @return deliveryAddress
     */
    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    /**
     * Setter to set delivery address
     * @param deliveryAddress
     */
    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    /**
     * Getter to get delivery city
     * @return deliveryCity
     */
    public String getDeliveryCity() {
        return deliveryCity;
    }

    /**
     * Setter to set delivery city
     * @param deliveryCity
     */
    public void setDeliveryCity(String deliveryCity) {
        this.deliveryCity = deliveryCity;
    }

    /**
     * Getter to get delivery country
     * @return deliveryCountry
     */
    public String getDeliveryCountry() {
        return deliveryCountry;
    }

    /**
     * Setter to set delivery country
     * @param deliveryCountry
     */
    public void setDeliveryCountry(String deliveryCountry) {
        this.deliveryCountry = deliveryCountry;
    }

    /**
     * Getter to get is paid out
     * @return isPaidOut
     */
    public boolean isPaidOut() {
        return isPaidOut;
    }

    /**
     * Setter to set is paid out
     * @param paidOut
     */
    public void setPaidOut(boolean paidOut) {
        isPaidOut = paidOut;
    }

    /**
     * Getter to get currency
     * @return currency
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * Setter to set currency
     * @param currency
     */
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    /**
     * Getter to get cart
     * @return cart
     */
    public Cart getCart() {
        return cart;
    }

    /**
     * Setter to set cart
     * @param cart
     */
    public void setCart(Cart cart) {
        this.cart = cart;
    }
    
}
