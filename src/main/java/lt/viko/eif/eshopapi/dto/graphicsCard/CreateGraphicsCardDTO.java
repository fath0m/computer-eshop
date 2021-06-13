package lt.viko.eif.eshopapi.dto.graphicsCard;

/**
 * Stores database variables and foreing keys
 * this class contains those variable getters and setters
 * @author Lukas, Eimantas, Karolis
 * version 1.0
 */
public class CreateGraphicsCardDTO {
    private String name;
    private Long manufacturer_id;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Long getManufacturer_id() { return manufacturer_id; }

    public void setManufacturer_id(Long manufacturer_id) { this.manufacturer_id = manufacturer_id; }
}
