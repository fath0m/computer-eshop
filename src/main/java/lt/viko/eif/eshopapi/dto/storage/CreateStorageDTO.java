package lt.viko.eif.eshopapi.dto.storage;

import lt.viko.eif.eshopapi.constant.SizeUnit;
import lt.viko.eif.eshopapi.constant.StorageType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * Contains database variables and foreing keys
 * and contains those variable getters and setters
 * @author Lukas, Eimantas, Karolis
 * version 1.0
 */
public class CreateStorageDTO {
    private String name;
    private double amount;
    @Enumerated(EnumType.STRING)
    private SizeUnit amountUnit;
    @Enumerated(EnumType.STRING)
    private StorageType storageType;
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

    public SizeUnit getAmountUnit() {
        return amountUnit;
    }

    public void setAmountUnit(SizeUnit amountUnit) {
        this.amountUnit = amountUnit;
    }

    public StorageType getStorageType() {
        return storageType;
    }

    public void setStorageType(StorageType storageType) {
        this.storageType = storageType;
    }

    public Long getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(Long manufacturerId) {
        this.manufacturerId = manufacturerId;
    }
}
