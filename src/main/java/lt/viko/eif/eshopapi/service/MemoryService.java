package lt.viko.eif.eshopapi.service;

import lt.viko.eif.eshopapi.dto.memory.CreateMemoryDTO;
import lt.viko.eif.eshopapi.dto.memory.UpdateMemoryDTO;
import lt.viko.eif.eshopapi.model.Manufacturer;
import lt.viko.eif.eshopapi.model.Memory;
import lt.viko.eif.eshopapi.repository.ManufacturerRepository;
import lt.viko.eif.eshopapi.repository.MemoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Represents MemoryService Object that builds Memory
 * from DTO, provides creation and update of Memory
 * @author Karolis,Eimantas,Lukas
 */
@Service
public class MemoryService {
    @Autowired
    MemoryRepository memoryRepository;
    @Autowired
    ManufacturerRepository manufacturerRepository;

    //function buildFromDTO
    private Memory buildFromDTO(CreateMemoryDTO dto){
        Memory memory = new Memory();
        memory.setName(dto.getName());
        memory.setAmount(dto.getAmount());

        //Relationships
        Optional<Manufacturer> manufacturer = manufacturerRepository.findById(dto.getManufacturerId());

        memory.setManufacturer(manufacturer.get());

        return memory;
    }

    public Memory createMemory(CreateMemoryDTO createMemoryDTO){
        Memory memory = buildFromDTO(createMemoryDTO);
        return memoryRepository.save(memory);
    }

    public Memory updateMemoryById(Long id, UpdateMemoryDTO updateMemoryDTO){
        Memory memory = buildFromDTO(updateMemoryDTO);
        memory.setId(id);
        return memoryRepository.save(memory);
    }
}
