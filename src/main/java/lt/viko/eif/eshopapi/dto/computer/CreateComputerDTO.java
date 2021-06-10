package lt.viko.eif.eshopapi.dto.computer;

import lt.viko.eif.eshopapi.constant.Currency;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class CreateComputerDTO {

	private String name;
    private double price;
	@Enumerated(EnumType.STRING)
    private Currency currency;
    private int stockQuantity;
    private Long manufacturerId;
    private Long processorId;
    private Long graphicsCardId;
    private Long memoryId;
    private Long storageId;
    private Long motherboardId;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public int getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}
	
	public Long getManufacturerId() {
		return manufacturerId;
	}
	
	public void setManufacturerId(Long manufacturerId) {
		this.manufacturerId = manufacturerId;
	}
	
	public Long getProcessorId() {
		return processorId;
	}
	
	public void setProcessorId(Long processorId) {
		this.processorId = processorId;
	}
	
	public Long getGraphicsCardId() {
		return graphicsCardId;
	}
	
	public void setGraphicsCardId(Long graphicsCardId) {
		this.graphicsCardId = graphicsCardId;
	}
	
	public Long getMemoryId() {
		return memoryId;
	}
	
	public void setMemoryId(Long memoryId) {
		this.memoryId = memoryId;
	}
	
	public Long getStorageId() {
		return storageId;
	}
	
	public void setStorageId(Long storageId) {
		this.storageId = storageId;
	}
	
	public Long getMotherboardId() {
		return motherboardId;
	}
	
	public void setMotherboardId(Long motherboardId) {
		this.motherboardId = motherboardId;
	}
	
}
