package lt.viko.eif.eshopapi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

/**
 * Represents Manufacturer object which has OneToMany connections
 * with other Tables computers,graphicsCards,memories,processors,storages
 * This class is responsible for getting, setting properties
 * @author Lukas, Eimantas, Karolis
 */
@Entity
@Table(name = "manufacturers")
public class Manufacturer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String country;
    private String website;
    /**
     * Setting OneToMany connection with computers
     */
    @JsonBackReference
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "manufacturer", orphanRemoval = true)
    private Set<Computer> computers;
    /**
     * Setting OneToMany connection with graphicsCards
     */
    @JsonBackReference
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "manufacturer", orphanRemoval = true)
    private Set<GraphicsCard> graphicsCards;
    /**
     * Setting OneToMany connection with memories
     */
    @JsonBackReference
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "manufacturer", orphanRemoval = true)
    private Set<Memory> memories;
    /**
     * Setting OneToMany connection with processors
     */
    @JsonBackReference
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "manufacturer", orphanRemoval = true)
    private Set<Processor> processors;
    /**
     * Setting OneToMany connection with storages
     */
    @JsonBackReference
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "manufacturer", orphanRemoval = true)
    private Set<Storage> storages;

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
     * Getter for country field
     * @return country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Setter for country field
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Getter for website field
     * @return website
     */
    public String getWebsite() {
        return website;
    }

    /**
     * Setter for website field
     * @param website
     */
    public void setWebsite(String website) {
        this.website = website;
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

    /**
     * Getter for graphicsCards object
     * @return graphicsCards
     */
    public Set<GraphicsCard> getGraphicsCards() {
        return graphicsCards;
    }

    /**
     * Setter for graphicsCards object
     * @param graphicsCards
     */
    public void setGraphicsCards(Set<GraphicsCard> graphicsCards) {
        this.graphicsCards = graphicsCards;
    }

    /**
     * Getter for memories object
     * @return memories
     */
    public Set<Memory> getMemories() {
        return memories;
    }

    /**
     * Setter for memories object
     * @param memories
     */
    public void setMemories(Set<Memory> memories) {
        this.memories = memories;
    }

    /**
     * Getter for processors object
     * @return processors
     */
    public Set<Processor> getProcessors() {
        return processors;
    }

    /**
     * Setter for processors object
     * @param processors
     */
    public void setProcessors(Set<Processor> processors) {
        this.processors = processors;
    }

    /**
     * Getter for storages object
     * @return storages
     */
    public Set<Storage> getStorages() {
        return storages;
    }

    /**
     * Getter for storages object
     * @param storages
     */
    public void setStorages(Set<Storage> storages) {
        this.storages = storages;
    }

}
