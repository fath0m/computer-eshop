package lt.viko.eif.eshopapi.dto.memory;

/**
 * Contains database variables and foreing keys
 * and contains those variable getters and setters
 * @author Lukas, Eimantas, Karolis
 * version 1.0
 */
public class CreateMemoryDTO {
    private String name;
    private double amount;
    private Long manufacturerId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Long getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(Long manufacturerId) {
        this.manufacturerId = manufacturerId;
    }
}
