package lt.viko.eif.eshopapi.dto.manufacturer;

/**
 * Stores database variables
 * this class contains those variable getters and setters
 * @author Lukas, Eimantas, Karolis
 * version 1.0
 */
public class CreateManufacturerDTO {

    private String name;
    private String country;
    private String website;

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
}
