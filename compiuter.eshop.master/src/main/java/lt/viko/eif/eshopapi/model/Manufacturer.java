package lt.viko.eif.eshopapi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "manufacturers")
public class Manufacturer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String country;
    private String website;

    @JsonBackReference
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "manufacturer")
    private Set<Computer> computers;

    @JsonBackReference
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "manufacturer")
    private Set<GraphicsCard> graphicsCards;

    @JsonBackReference
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "manufacturer")
    private Set<Memory> memories;

    @JsonBackReference
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "manufacturer")
    private Set<Processor> processors;

    @JsonBackReference
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "manufacturer")
    private Set<Storage> storages;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Set<Computer> getComputers() {
        return computers;
    }

    public void setComputers(Set<Computer> computers) {
        this.computers = computers;
    }

    public Set<GraphicsCard> getGraphicsCards() {
        return graphicsCards;
    }

    public void setGraphicsCards(Set<GraphicsCard> graphicsCards) {
        this.graphicsCards = graphicsCards;
    }

    public Set<Memory> getMemories() {
        return memories;
    }

    public void setMemories(Set<Memory> memories) {
        this.memories = memories;
    }

    public Set<Processor> getProcessors() {
        return processors;
    }

    public void setProcessors(Set<Processor> processors) {
        this.processors = processors;
    }

    public Set<Storage> getStorages() {
        return storages;
    }

    public void setStorages(Set<Storage> storages) {
        this.storages = storages;
    }

}
