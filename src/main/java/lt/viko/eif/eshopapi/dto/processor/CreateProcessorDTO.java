package lt.viko.eif.eshopapi.dto.processor;

import lt.viko.eif.eshopapi.constant.FrequencyUnit;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * Contains database variables and foreing keys
 * and contains those variable getters and setters
 * @author Lukas, Eimantas, Karolis
 * version 1.0
 */
public class CreateProcessorDTO {

    private String name;
    private int coreAmount;
    private int threadAmount;
    private double frequency;
    @Enumerated(EnumType.STRING)
    private FrequencyUnit frequencyUnit;
    private Long manufacturerId;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getCoreAmount() { return coreAmount; }

    public void setCoreAmount(int coreAmount) { this.coreAmount = coreAmount; }

    public int getThreadAmount() { return threadAmount; }

    public void setThreadAmount(int threadAmount) { this.threadAmount = threadAmount; }

    public double getFrequency() { return frequency; }

    public void setFrequency(double frequency) { this.frequency = frequency; }

    public FrequencyUnit getFrequencyUnit() {
        return frequencyUnit;
    }

    public void setFrequencyUnit(FrequencyUnit frequencyUnit) {
        this.frequencyUnit = frequencyUnit;
    }

    public Long getManufacturerId() { return manufacturerId; }

    public void setManufacturerId(Long manufacturerId) { this.manufacturerId = manufacturerId; }
}
