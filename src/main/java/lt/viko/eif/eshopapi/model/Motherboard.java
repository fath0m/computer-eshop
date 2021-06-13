package lt.viko.eif.eshopapi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

/**
 * Represents Motherboard object which has ManyToOne connections
 * with other Tables Motherboard and OneToMany connection with computers.
 * This class is responsible for getting, setting properties
 * @author Lukas, Eimantas, Karolis
 */
@Entity
@Table(name = "motherboards")
public class Motherboard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    /**
     * Setting ManyToOne connection with manufacturer
     */
    @JsonManagedReference
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name="manufacturer_id", nullable = false)
    private Manufacturer manufacturer;
    /**
     * Setting OneToMany connection with computers
     */
    @JsonBackReference
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "storage", orphanRemoval = true)
    private Set<Computer> computers;

    /**
     * Getter for id field
     * @return id
     */
    public Long getId() { return id; }

    /**
     * Setter for id field
     * @param id
     */
    public void setId(Long id) { this.id = id; }

    /**
     * Getter for name field
     * @return name
     */
    public String getName() { return name; }

    /**
     * Setter for name field
     * @param name
     */
    public void setName(String name) { this.name = name; }

    /**
     * Getter for manufacturer object
     * @return manufacturer
     */
    public Manufacturer getManufacturer() { return manufacturer; }

    /**
     * Setter for manufacturer object
     * @param manufacturer
     */
    public void setManufacturer(Manufacturer manufacturer) { this.manufacturer = manufacturer; }

    /**
     * Getter for computers object
     * @return
     */
    public Set<Computer> getComputers() { return computers; }

    /**
     * Setter for computers object
     * @param computers
     */
    public void setComputers(Set<Computer> computers) { this.computers = computers; }
}
