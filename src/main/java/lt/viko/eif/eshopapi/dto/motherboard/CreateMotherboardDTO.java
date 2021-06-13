package lt.viko.eif.eshopapi.dto.motherboard;

/**
 * Contains database variables and foreing keys
 * and contains those variable getters and setters
 * @author Lukas, Eimantas, Jonas, Karolis
 * version 1.0
 */
public class CreateMotherboardDTO {

    private String name;
    private Long manufacturerId;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Long getManufacturerId() { return manufacturerId; }
    public void setManufacturerId(Long manufacturerId) { this.manufacturerId = manufacturerId; }
}
