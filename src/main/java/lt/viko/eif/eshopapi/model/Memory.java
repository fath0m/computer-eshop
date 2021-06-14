package lt.viko.eif.eshopapi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lt.viko.eif.eshopapi.constant.SizeUnit;

import javax.persistence.*;
import java.util.Set;

/**
 * Represents Memory object which has ManyToOne connections
 * with other Tables Motherboard and OneToMany connection with computers.
 * This class is responsible for getting, setting properties
 * @author Lukas, Eimantas, Karolis
 */
@Entity
@Table(name = "memories")
public class Memory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private double amount;
    @Enumerated(EnumType.STRING)
    private SizeUnit amountUnit;
    /**
     * Setting ManyToOne connection with manufacturer
     */
    @JsonManagedReference
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "manufacturer_id", nullable = false)
    private Manufacturer manufacturer;
    /**
     * Setting OneToMany connection with computers
     */
    @JsonBackReference
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "memory", cascade = CascadeType.ALL)
    private Set<Computer> computers;

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
     * Getter for name field
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name field
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for amount field
     * @return amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Setter for amount field
     * @param amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Getter for amountUnit field
     * @return amountUnit
     */
    public SizeUnit getAmountUnit() {
        return amountUnit;
    }

    /**
     * Setter for amountUnit field
     * @param amountUnit
     */
    public void setAmountUnit(SizeUnit amountUnit) {
        this.amountUnit = amountUnit;
    }

    /**
     * Getter for manufacturer object
     * @return manufacturer
     */
    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    /**
     * Setter for manufacturer object
     * @param manufacturer
     */
    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * Getter for computers object
     * @return computers
     */
    public Set<Computer> getComputers() {
        return computers;
    }

    /**
     * Setter for computers object
     * @param computers
     */
    public void setComputers(Set<Computer> computers) {
        this.computers = computers;
    }

}
