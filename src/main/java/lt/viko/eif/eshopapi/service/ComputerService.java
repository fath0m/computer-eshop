package lt.viko.eif.eshopapi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lt.viko.eif.eshopapi.dto.computer.UpdateComputerDTO;
import lt.viko.eif.eshopapi.model.Computer;
import lt.viko.eif.eshopapi.model.GraphicsCard;
import lt.viko.eif.eshopapi.model.Manufacturer;
import lt.viko.eif.eshopapi.model.Memory;
import lt.viko.eif.eshopapi.model.Motherboard;
import lt.viko.eif.eshopapi.model.Processor;
import lt.viko.eif.eshopapi.model.Storage;
import lt.viko.eif.eshopapi.repository.ComputerRepository;
import lt.viko.eif.eshopapi.repository.GraphicsCardRepository;
import lt.viko.eif.eshopapi.repository.ManufacturerRepository;
import lt.viko.eif.eshopapi.repository.MemoryRepository;
import lt.viko.eif.eshopapi.repository.MotherboardRepository;
import lt.viko.eif.eshopapi.repository.ProcessorRepository;
import lt.viko.eif.eshopapi.repository.StorageRepository;

@Service
public class ComputerService {
	
	@Autowired
	ComputerRepository computerRepository;
	
	@Autowired
	GraphicsCardRepository graphicsCardRepository;
	
	@Autowired
	ManufacturerRepository manufacturerRepository;
	
	@Autowired
	MemoryRepository memoryRepository;
	
	@Autowired
	MotherboardRepository motherboardRepository;
	
	@Autowired
	ProcessorRepository processorRepository;
	
	@Autowired
	StorageRepository storageRepository;
	
	private Computer buildFromDTO(CreateComputerDTO dto) {
		Computer computer = new Computer();
		computer.setName(dto.getName());
		computer.setPrice(dto.getPrice());
		
		// Relationships
		Optional<Manufacturer> manufacturer = manufacturerRepository.findById(dto.getManufacturerId());
		Optional<Processor> processor = processorRepository.findById(dto.getProcessorId());
		Optional<GraphicsCard> graphicsCard = graphicsCardRepository.findById(dto.getGraphicsCardId());
		Optional<Memory> memory = memoryRepository.findById(dto.getMemoryId());
		Optional<Storage> storage = storageRepository.findById(dto.getStorageId());
		Optional<Motherboard> motherboard = motherboardRepository.findById(dto.getMotherboardId());
		
		computer.setManufacturer(manufacturer.get());
		computer.setProcessor(processor.get());
		computer.setGraphicsCard(graphicsCard.get());
		computer.setMemory(memory.get());
		computer.setStorage(storage.get());
		computer.setMotherboard(motherboard.get());
		
		return computer;
	}
	
	public Computer createComputer(CreateComputerDTO createComputerDTO) {
		Computer computer = buildFromDTO(createComputerDTO);
		return computerRepository.save(computer);
	}
	
	public Computer updateComputerById(Long id, UpdateComputerDTO updateComputerDTO) {
		Computer computer = buildFromDTO(updateComputerDTO);
		computer.setId(id);
		
		return computerRepository.save(computer);
	}

}
