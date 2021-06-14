package lt.viko.eif.eshopapi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

/**
 * Represents GraphicsCard object which has ManyToOne connection
 * with Manufacturer and has OneToMany connection with computer
 * This class is responsible for getting, setting properties
 * @author Karolis, Eimantas, Lukas, Jonas
 * version 1.0
 */
@Entity
@Table(name = "graphics_card")
public class GraphicsCard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    /**
     * Setting ManyToOne connection with manufacturer
     */
    @JsonManagedReference
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "manufacturer_id", nullable = false)
    private Manufacturer manufacturer;

    /**
     * Setting OneToMany connection with computer
     */
    @JsonBackReference
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "graphicsCard", cascade = CascadeType.ALL)
    private Set<Computer> computers;

    /**
     * Getter to get id
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * Setter to set id
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter to get name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter to set name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter to get manufacturer object
     * @return manufacturer
     */
    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    /**
     * Setter to set manufacturer object
     * @param manufacturer
     */
    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * Getter to get computer object
     * @return
     */
    public Set<Computer> getComputers() {
        return computers;
    }

    /**
     * Setter to set computer object
     * @param computers
     */
    public void setComputers(Set<Computer> computers) {
        this.computers = computers;
    }

}
