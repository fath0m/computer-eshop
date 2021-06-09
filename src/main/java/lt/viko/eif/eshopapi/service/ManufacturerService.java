package lt.viko.eif.eshopapi.service;

import lt.viko.eif.eshopapi.dto.manufacturer.CreateManufacturerDTO;
import lt.viko.eif.eshopapi.dto.manufacturer.UpdateManufacturerDTO;
import lt.viko.eif.eshopapi.model.Manufacturer;
import lt.viko.eif.eshopapi.repository.ManufacturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManufacturerService {
    @Autowired
    ManufacturerRepository manufacturerRepository;

    private Manufacturer buildFromDTO(CreateManufacturerDTO dto){
        Manufacturer manufacturer = new Manufacturer();
        manufacturer.setName(dto.getName());
        manufacturer.setCountry(dto.getCountry());
        manufacturer.setWebsite(dto.getWebsite());

        return manufacturer;
    }

    public Manufacturer createManufacturer(CreateManufacturerDTO createManufacturerDTO){
        Manufacturer manufacturer = buildFromDTO(createManufacturerDTO);
        return manufacturerRepository.save(manufacturer);
    }

    public Manufacturer updateManufacturer(Long id, UpdateManufacturerDTO updateManufacturerDTO){
        Manufacturer manufacturer =buildFromDTO(updateManufacturerDTO);
        manufacturer.setId(id);

        return manufacturerRepository.save(manufacturer);
    }
}
