package lt.viko.eif.eshopapi.service;

import lt.viko.eif.eshopapi.dto.graphicCard.CreateGraphicCardDTO;
import lt.viko.eif.eshopapi.dto.graphicCard.UpdateGraphicsCardDTO;
import lt.viko.eif.eshopapi.model.GraphicsCard;
import lt.viko.eif.eshopapi.model.Manufacturer;
import lt.viko.eif.eshopapi.repository.GraphicsCardRepository;
import lt.viko.eif.eshopapi.repository.ManufacturerRepository;
import org.hibernate.graph.Graph;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GraphicCardService {
    @Autowired
    GraphicsCardRepository graphicsCardRepository;
    @Autowired
    ManufacturerRepository manufacturerRepository;

    private GraphicsCard buildFromDTO(CreateGraphicCardDTO dto){
        GraphicsCard graphicsCard = new GraphicsCard();
        graphicsCard.setName(dto.getName());

        Optional<Manufacturer> manufacturer = manufacturerRepository.findById(dto.getManufacturer_id());
        graphicsCard.setManufacturer(manufacturer.get());

        return graphicsCard;
    }

    public GraphicsCard createGraphicsCard(CreateGraphicCardDTO createGraphicCardDTO){
        GraphicsCard graphicsCard = buildFromDTO(createGraphicCardDTO);
        return graphicsCardRepository.save(graphicsCard);
    }

    public GraphicsCard updateGraphicsCard(Long id, UpdateGraphicsCardDTO updateGraphicsCardDTO){
        GraphicsCard graphicsCard = buildFromDTO(updateGraphicsCardDTO);
        graphicsCard.setId(id);

        return graphicsCardRepository.save(graphicsCard);
    }
}
