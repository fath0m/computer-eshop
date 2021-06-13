package lt.viko.eif.eshopapi.service;

import lt.viko.eif.eshopapi.dto.motherboard.CreateMotherboardDTO;
import lt.viko.eif.eshopapi.dto.motherboard.UpdateMotherboardDTO;
import lt.viko.eif.eshopapi.model.Manufacturer;
import lt.viko.eif.eshopapi.model.Motherboard;
import lt.viko.eif.eshopapi.repository.ManufacturerRepository;
import lt.viko.eif.eshopapi.repository.MotherboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Represents MotherboardService Object that builds Motherboard
 * from DTO, provides creation and update of Motherboard
 * @author Karolis,Eimantas,Lukas
 */
@Service
public class MotherboardService {

    @Autowired
    MotherboardRepository motherboardRepository;

    @Autowired
    ManufacturerRepository manufacturerRepository;

    private Motherboard buildFromDTO(CreateMotherboardDTO dto){
        Motherboard motherboard = new Motherboard();
        motherboard.getName();
        motherboard.getManufacturer();

        Optional<Manufacturer> manufacturer = manufacturerRepository.findById(dto.getManufacturerId());

        motherboard.setManufacturer(manufacturer.get());

        return motherboard;
    }

    public Motherboard createMontherboard(CreateMotherboardDTO createMotherboardDTO){
        Motherboard motherboard = buildFromDTO(createMotherboardDTO);
        return motherboardRepository.save(motherboard);
    }

    public Motherboard update (Long id, UpdateMotherboardDTO updateMotherboardDTO){
        Motherboard motherboard = buildFromDTO(updateMotherboardDTO);
        motherboard.setId(id);

        return motherboardRepository.save(motherboard);
    }

}
