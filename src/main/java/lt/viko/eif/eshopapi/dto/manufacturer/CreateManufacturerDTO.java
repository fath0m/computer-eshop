package lt.viko.eif.eshopapi.dto.manufacturer;

/**
 * DTO manufacturer
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
