package lt.viko.eif.eshopapi.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lt.viko.eif.eshopapi.constant.Currency;

import javax.persistence.*;

/**
 * Represents Computers object which has ManyToOne connections
 * with other Tables Manufacturer, GraphicsCard ...
 * This class is responsible for getting, setting properties
 * @author Lukas, Eimantas, Jonas, Karolis
 * version 1.0
 */
@Entity
@Table(name = "computers")
public class Computer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private double price;
    @Enumerated(EnumType.STRING)
    private Currency currency;
    private int stockQuantity;
    /**
     * Setting ManyToOne connection with manufacturer
     */
    @JsonManagedReference
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "manufacturer_id", nullable = false)
    private Manufacturer manufacturer;
    /**
     * Setting ManyToOne connection with processor
     */
    @JsonManagedReference
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "processor_id")
    private Processor processor;
    /**
     * Setting ManyToOne connection with graphicsCard
     */
    @JsonManagedReference
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "graphics_card_id")
    private GraphicsCard graphicsCard;
    /**
     * Setting ManyToOne connection with memory
     */
    @JsonManagedReference
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "memory_id")
    private Memory memory;
    /**
     * Setting ManyToOne connection with storage
     */
    @JsonManagedReference
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "storage_id")
    private Storage storage;
    /**
     * Setting ManyToOne connection with motherboard
     */
    @JsonManagedReference
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name="motherboard_id")
    private Motherboard motherboard;

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
     * Getter for price field
     * @return
     */
    public double getPrice() {
        return price;
    }

    /**
     * Setter for price field
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Getter for currency field
     * @return currency
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * Setter for currency field
     * @param currency
     */
    public void setCurrency(Currency currency) {
        this.currency = currency;
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
     * Getter for processor object
     * @return processor
     */
    public Processor getProcessor() {
        return processor;
    }

    /**
     * Setter for processor object
     * @param processor
     */
    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    /**
     * Getter for graphicsCard object
     * @return graphicsCard
     */
    public GraphicsCard getGraphicsCard() {
        return graphicsCard;
    }

    /**
     * Setter for graphicsCard object
     * @param graphicsCard
     */
    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    /**
     * Getter for memory object
     * @return memory
     */
    public Memory getMemory() {
        return memory;
    }

    /**
     * Setter for memory object
     * @param memory
     */
    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    /**
     * Getter for storage object
     * @return storage
     */
    public Storage getStorage() {
        return storage;
    }

    /**
     * Setter for memory object
     * @param storage
     */
    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    /**
     * Getter for motherboard object
     * @return motherboard
     */
    public Motherboard getMotherboard() { return motherboard; }

    /**
     * Setter for motherboard object
     * @param motherboard
     */
    public void setMotherboard(Motherboard motherboard) { this.motherboard = motherboard; }

    /**
     * Getter for stockQuantity field
     * @return stockQuantity
     */
    public int getStockQuantity() {
        return stockQuantity;
    }

    /**
     * Setter for stockQuantity field
     * @param stockQuantity
     */
    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

}
