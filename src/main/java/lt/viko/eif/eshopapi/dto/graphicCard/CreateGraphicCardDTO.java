package lt.viko.eif.eshopapi.dto.graphicCard;

public class CreateGraphicCardDTO {
    private String name;
    private Long manufacturer_id;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Long getManufacturer_id() { return manufacturer_id; }

    public void setManufacturer_id(Long manufacturer_id) { this.manufacturer_id = manufacturer_id; }
}
