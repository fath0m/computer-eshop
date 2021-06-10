package lt.viko.eif.eshopapi.database;

import lt.viko.eif.eshopapi.constant.Currency;
import lt.viko.eif.eshopapi.constant.FrequencyUnit;
import lt.viko.eif.eshopapi.constant.SizeUnit;
import lt.viko.eif.eshopapi.model.*;
import lt.viko.eif.eshopapi.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Initialize database with predefined data.
 *
 * @author Jonas
 */
@Component
public class Seed {

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

    public void execute() {
        // Manufacturers
        var manufacturer1 = new Manufacturer();
        manufacturer1.setName("Dell");
        manufacturer1.setCountry("USA");
        manufacturer1.setWebsite("www.dell.com");

        var manufacturer2 = new Manufacturer();
        manufacturer2.setName("Nvidia");
        manufacturer2.setCountry("USA");
        manufacturer2.setWebsite("www.nvidia.com");

        var manufacturer3 = new Manufacturer();
        manufacturer3.setName("Intel");
        manufacturer3.setCountry("USA");
        manufacturer3.setWebsite("www.intel.com");

        var manufacturer4 = new Manufacturer();
        manufacturer4.setName("AMD");
        manufacturer4.setCountry("USA");
        manufacturer4.setWebsite("www.amd.com");

        var manufacturer5 = new Manufacturer();
        manufacturer5.setName("Samsung");
        manufacturer5.setCountry("South Korea");
        manufacturer5.setWebsite("www.samsung.com");

        var manufacturer6 = new Manufacturer();
        manufacturer6.setName("HP");
        manufacturer6.setCountry("USA");
        manufacturer6.setWebsite("www.hp.com");

        var manufacturer7 = new Manufacturer();
        manufacturer7.setName("Kingston");
        manufacturer7.setCountry("USA");
        manufacturer7.setWebsite("www.kingston.com");

        var manufacturer8 = new Manufacturer();
        manufacturer8.setName("MSI");
        manufacturer8.setCountry("USA");
        manufacturer8.setWebsite("www.msi.com");

        var manufacturer9 = new Manufacturer();
        manufacturer9.setName("ASRock");
        manufacturer9.setCountry("USA");
        manufacturer9.setWebsite("www.asrock.com");

        manufacturerRepository.save(manufacturer1);
        manufacturerRepository.save(manufacturer2);
        manufacturerRepository.save(manufacturer3);
        manufacturerRepository.save(manufacturer4);
        manufacturerRepository.save(manufacturer5);
        manufacturerRepository.save(manufacturer6);
        manufacturerRepository.save(manufacturer7);
        manufacturerRepository.save(manufacturer8);
        manufacturerRepository.save(manufacturer9);

        // Processors
        var processor1 = new Processor();
        processor1.setManufacturer(manufacturer3);
        processor1.setName("I5-5300");
        processor1.setCoreAmount(4);
        processor1.setThreadAmount(8);
        processor1.setFrequency(4.5D);
        processor1.setFrequencyUnit(FrequencyUnit.GIGAHERTZ);

        var processor2 = new Processor();
        processor2.setManufacturer(manufacturer4);
        processor2.setName("Ryzen 4400G");
        processor2.setCoreAmount(8);
        processor2.setThreadAmount(8);
        processor2.setFrequency(3.9D);
        processor2.setFrequencyUnit(FrequencyUnit.GIGAHERTZ);

        processorRepository.save(processor1);
        processorRepository.save(processor2);

        // Graphics cards
        var grahpicsCard1 = new GraphicsCard();
        grahpicsCard1.setName("GTX 1650");
        grahpicsCard1.setManufacturer(manufacturer2);

        var grahpicsCard2 = new GraphicsCard();
        grahpicsCard2.setName("RX 550");
        grahpicsCard2.setManufacturer(manufacturer4);

        graphicsCardRepository.save(grahpicsCard1);
        graphicsCardRepository.save(grahpicsCard2);

        // Memories
        var memory1 = new Memory();
        memory1.setName("DDR3 SODIMM");
        memory1.setManufacturer(manufacturer5);
        memory1.setAmount(4096);
        memory1.setAmountUnit(SizeUnit.MEGABYTE);

        var memory2 = new Memory();
        memory2.setName("DDR4 SODIMM");
        memory2.setManufacturer(manufacturer7);
        memory2.setAmount(8192);
        memory2.setAmountUnit(SizeUnit.MEGABYTE);

        memoryRepository.save(memory1);
        memoryRepository.save(memory2);

        // Motherboards
        var motherboard1 = new Motherboard();
        motherboard1.setName("BXA-88H");
        motherboard1.setManufacturer(manufacturer9);

        var motherboard2 = new Motherboard();
        motherboard2.setName("ZBD-DD2");
        motherboard2.setManufacturer(manufacturer8);

        motherboardRepository.save(motherboard1);
        motherboardRepository.save(motherboard2);

        // Storages
        var storage1 = new Storage();
        storage1.setName("Baracuda 7300 RPM");
        storage1.setAmount(1024);
        storage1.setAmountUnit(SizeUnit.GIGABYTE);
        storage1.setManufacturer(manufacturer7);

        var storage2 = new Storage();
        storage2.setName("EVO 880");
        storage2.setAmount(256);
        storage2.setAmountUnit(SizeUnit.GIGABYTE);
        storage2.setManufacturer(manufacturer7);

        storageRepository.save(storage1);
        storageRepository.save(storage2);

        // Computers
        var computer1 = new Computer();
        computer1.setName("Optiplex 7750H");
        computer1.setPrice(1099.99D);
        computer1.setCurrency(Currency.EUR);
        computer1.setStockQuantity(3);
        computer1.setManufacturer(manufacturer1);
        computer1.setProcessor(processor1);
        computer1.setGraphicsCard(grahpicsCard1);
        computer1.setMemory(memory2);
        computer1.setStorage(storage2);
        computer1.setMotherboard(motherboard1);

        var computer2 = new Computer();
        computer2.setName("Spectre 11B");
        computer2.setPrice(999.99D);
        computer2.setCurrency(Currency.EUR);
        computer2.setStockQuantity(10);
        computer2.setManufacturer(manufacturer6);
        computer2.setProcessor(processor2);
        computer2.setGraphicsCard(grahpicsCard2);
        computer2.setMemory(memory2);
        computer2.setStorage(storage1);
        computer2.setMotherboard(motherboard2);

        computerRepository.save(computer1);
        computerRepository.save(computer2);

        System.out.println("DATABASE SEEDED");
    }

    /**
     * Launch on Spring boot startup.
     */
    @EventListener(ApplicationReadyEvent.class)
    public void seedDatabaseAfterStartup() {
        execute();
    }

}
