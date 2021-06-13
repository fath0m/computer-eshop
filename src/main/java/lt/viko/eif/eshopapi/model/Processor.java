package lt.viko.eif.eshopapi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lt.viko.eif.eshopapi.constant.FrequencyUnit;

import javax.persistence.*;
import java.util.Set;

/**
 * Represents Processor object which has ManyToOne connections
 * with other Tables Manufacturer. And OneToMany with computers
 * This class is responsible for getting, setting properties
 * @author Lukas, Eimantas, Jonas, Karolis
 */
@Entity
@Table(name = "processors")
public class Processor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int coreAmount;
    private int threadAmount;
    private double frequency;
    @Enumerated(EnumType.STRING)
    private FrequencyUnit frequencyUnit;
    /**
     * Setting ManyToOne connection with manufacturer
     */
    @JsonManagedReference
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "manufacturer_id")
    private Manufacturer manufacturer;
    /**
     * Setting OneToMany connection with computers
     */
    @JsonBackReference
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "processor", orphanRemoval = true)
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
     * Getter for coreAmount field
     * @return coreAmount
     */
    public int getCoreAmount() {
        return coreAmount;
    }

    /**
     * Setter for coreAmount field
     * @param coreAmount
     */
    public void setCoreAmount(int coreAmount) {
        this.coreAmount = coreAmount;
    }

    /**
     * Getter for threadAmount field
     * @return threadAmount
     */
    public int getThreadAmount() {
        return threadAmount;
    }

    /**
     * Setter for threadAmount field
     * @param threadAmount
     */
    public void setThreadAmount(int threadAmount) {
        this.threadAmount = threadAmount;
    }

    /**
     * Getter for frequency field
     * @return frequency
     */
    public double getFrequency() {
        return frequency;
    }

    /**
     * Setter for frequency field
     * @param frequency
     */
    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    /**
     * Getter for frequencyUnit field
     * @return frequencyUnit
     */
    public FrequencyUnit getFrequencyUnit() {
        return frequencyUnit;
    }

    /**
     * Setter for frequencyUnit field
     * @param frequencyUnit
     */
    public void setFrequencyUnit(FrequencyUnit frequencyUnit) {
        this.frequencyUnit = frequencyUnit;
    }

    /**
     * Getter for manufacturer OBJECT
     * @return manufacturer
     */
    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    /**
     * Setter for manufacturer OBJECT
     * @param manufacturer
     */
    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * Getter for computers OBJECT
     * @return computers
     */
    public Set<Computer> getComputers() {
        return computers;
    }

    /**
     * Getter for manufacturer OBJECT
     * @param computers
     */
    public void setComputers(Set<Computer> computers) {
        this.computers = computers;
    }

}
