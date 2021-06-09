package lt.viko.eif.eshopapi.dto.motherboard;

public class CreateMotherboardDTO {

    private String name;
    private Long manufacturerId;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Long getManufacturerId() { return manufacturerId; }
    public void setManufacturerId(Long manufacturerId) { this.manufacturerId = manufacturerId; }
}
