package lt.viko.eif.eshopapi.controller;

import lt.viko.eif.eshopapi.dto.graphicsCard.CreateGraphicsCardDTO;
import lt.viko.eif.eshopapi.model.GraphicsCard;
import lt.viko.eif.eshopapi.repository.GraphicsCardRepository;
import lt.viko.eif.eshopapi.service.GraphicsCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.Optional;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping(value = "/graphicsCards", produces = MediaType.APPLICATION_JSON_VALUE)
public class GraphicsCardController {
    @Autowired
    GraphicsCardRepository gpuRepository;
    @Autowired
    GraphicsCardService graphicsCardService;
    /**
     * Get a list of Graphic cards
     * @return ResponseEntity<CollectionModel<GraphicsCard>>
     */
    @GetMapping
    public ResponseEntity<CollectionModel<GraphicsCard>> getGraphicsCards() {
        CollectionModel<GraphicsCard> model = CollectionModel.of(gpuRepository.findAll());

        final String uriString = ServletUriComponentsBuilder.fromCurrentRequest().build().toUriString();
        model.add(Link.of(uriString, "self"));
        model.add(linkTo(methodOn(GraphicsCardController.class).getGraphicsCardById(12L)).withRel("get-one-by-id"));

        return ResponseEntity.ok(model);
    }

    /**
     * Get Graphic card by provide id
     * @param id
     * @return EntityModel<GraphicsCard>
     */
    @GetMapping("/{id}")
    public ResponseEntity<EntityModel<GraphicsCard>> getGraphicsCardById(@PathVariable(value = "id") long id){
        Optional<GraphicsCard> gpu = gpuRepository.findById(id);

        if(gpu.isEmpty())
        {
            return ResponseEntity.notFound().build();
        }
        EntityModel<GraphicsCard> model = EntityModel.of(gpu.get());
        final String uriString = ServletUriComponentsBuilder.fromCurrentRequest().build().toUriString();
        model.add(Link.of(uriString, "self"));
        model.add(linkTo(methodOn(GraphicsCardController.class).getGraphicsCards()).withRel("get-all"));

        return ResponseEntity.ok(model);
    }

    /**
     * Delete Graphic card by provide id
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public ResponseEntity deleteGraphicsCardById(@PathVariable long id){
        Optional<GraphicsCard> gpu = gpuRepository.findById(id);

        if (gpu.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        gpuRepository.delete(gpu.get());
        return ResponseEntity.ok().build();
    }

    /**
     * Post(add) new Graphic card, provide Graphic card object
     * @param newGraphicCard
     * @return ResponseEntity<EntityModel<GraphicsCard>>
     */
    @PostMapping
    public ResponseEntity<EntityModel<GraphicsCard>> addGraphicsCard(@RequestBody CreateGraphicsCardDTO newGraphicCard){
        /**
         * calling graphicCardService function createGraphicsCard and providing newGraphicCard from request body
         */
        GraphicsCard graphicsCard = graphicsCardService.createGraphicsCard(newGraphicCard);
        if (graphicsCard == null) {
            return ResponseEntity.notFound().build();
        }

        EntityModel<GraphicsCard> model = EntityModel.of(graphicsCard);
        model.add(linkTo(methodOn(GraphicsCardController.class).getGraphicsCards()).withRel("get-all"));
        model.add(linkTo(methodOn(GraphicsCardController.class).getGraphicsCardById(12L)).withRel("get-one-by-id"));

        return ResponseEntity.ok(model);
    }
}