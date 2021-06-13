package lt.viko.eif.eshopapi.service;

import lt.viko.eif.eshopapi.dto.processor.CreateProcessorDTO;
import lt.viko.eif.eshopapi.dto.processor.UpdateProcessorDTO;
import lt.viko.eif.eshopapi.model.Manufacturer;
import lt.viko.eif.eshopapi.model.Processor;
import lt.viko.eif.eshopapi.repository.ManufacturerRepository;
import lt.viko.eif.eshopapi.repository.ProcessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Represents ProcessorService Object that builds Processor
 * from DTO, provides creation and update of Processor
 * @author Karolis,Eimantas,Lukas
 * version 1.0
 */
@Service
public class ProcessorService {
    @Autowired
    ProcessorRepository processorRepository;
    @Autowired
    ManufacturerRepository manufacturerRepository;

    private Processor buildFromDTO(CreateProcessorDTO dto){
        Processor processor = new Processor();
        processor.setName(dto.getName());
        processor.setCoreAmount(dto.getCoreAmount());
        processor.setThreadAmount(dto.getThreadAmount());
        processor.setFrequency(dto.getFrequency());
        processor.setFrequencyUnit(dto.getFrequencyUnit());

        //Relationships
        Optional<Manufacturer> manufacturer = manufacturerRepository.findById(dto.getManufacturerId());

        processor.setManufacturer(manufacturer.get());

        return processor;
    }

    public Processor createProcessor(CreateProcessorDTO createProcessorDTO){
        Processor processor = buildFromDTO(createProcessorDTO);
        return processorRepository.save(processor);
    }

    public Processor updateProcessor(Long id, UpdateProcessorDTO updateProcessorDTO){

        Processor processor = buildFromDTO(updateProcessorDTO);
        processor.setId(id);

        return processorRepository.save(processor);
    }
}
