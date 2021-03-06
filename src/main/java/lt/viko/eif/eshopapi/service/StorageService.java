package lt.viko.eif.eshopapi.service;

import lt.viko.eif.eshopapi.dto.storage.CreateStorageDTO;
import lt.viko.eif.eshopapi.dto.storage.UpdateStorageDTO;
import lt.viko.eif.eshopapi.model.Manufacturer;
import lt.viko.eif.eshopapi.model.Storage;
import lt.viko.eif.eshopapi.repository.ManufacturerRepository;
import lt.viko.eif.eshopapi.repository.StorageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Represents StorageService Object that builds Storage
 * from DTO, provides creation and update of Storage
 * @author Karolis,Eimantas,Lukas
 * version 1.0
 */
@Service
public class StorageService {
    @Autowired
    StorageRepository storageRepository;
    @Autowired
    ManufacturerRepository manufacturerRepository;

    private Storage buildFromDTO(CreateStorageDTO dto){
        Storage storage = new Storage();
        storage.setName(dto.getName());
        storage.setAmount(dto.getAmount());
        storage.setAmountUnit(dto.getAmountUnit());
        storage.setStorageType(dto.getStorageType());

        //Relationships
        Optional<Manufacturer> manufacturer = manufacturerRepository.findById(dto.getManufacturerId());

        storage.setManufacturer(manufacturer.get());

        return storage;
    }

    public Storage createStorage(CreateStorageDTO createStorageDTO){
        Storage storage = buildFromDTO(createStorageDTO);
        return storageRepository.save(storage);
    }

    public Storage updateStorage(Long id, UpdateStorageDTO updateStorageDTO)
    {
        Storage storage = buildFromDTO(updateStorageDTO);
        storage.setId(id);

        return storageRepository.save(storage);
    }
}
