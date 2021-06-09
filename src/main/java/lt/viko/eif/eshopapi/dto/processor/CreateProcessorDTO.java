package lt.viko.eif.eshopapi.dto.processor;

public class CreateProcessorDTO {

    private String name;
    private int coreAmount;
    private int threadAmount;
    private double frequency;
    private Long manufacturerId;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getCoreAmount() { return coreAmount; }

    public void setCoreAmount(int coreAmount) { this.coreAmount = coreAmount; }

    public int getThreadAmount() { return threadAmount; }

    public void setThreadAmount(int threadAmount) { this.threadAmount = threadAmount; }

    public double getFrequency() { return frequency; }

    public void setFrequency(double frequency) { this.frequency = frequency; }

    public Long getManufacturerId() { return manufacturerId; }

    public void setManufacturerId(Long manufacturerId) { this.manufacturerId = manufacturerId; }
}
