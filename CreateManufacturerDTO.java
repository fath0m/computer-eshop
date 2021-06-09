package lt.viko.eif.eshopapi.dto.manufacturer;

/**
 * DTO manufacturer
 */
public class CreateManufacturerDTO {

    private String name;
    private String counntry;
    private String website;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCounntry() {
        return counntry;
    }

    public void setCounntry(String counntry) {
        this.counntry = counntry;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
