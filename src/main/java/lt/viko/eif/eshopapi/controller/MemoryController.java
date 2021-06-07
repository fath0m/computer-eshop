package lt.viko.eif.eshopapi.controller;

import lt.viko.eif.eshopapi.model.Memory;
import lt.viko.eif.eshopapi.repository.MemoryRepository;
import org.apache.coyote.Response;
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
@RequestMapping(value = "/memory", produces = MediaType.APPLICATION_JSON_VALUE)
public class MemoryController {
    @Autowired
    MemoryRepository memoryRepository;
    /**
     * Get a list of Memory objects
     * @return
     */
    @GetMapping
    public ResponseEntity<CollectionModel<Memory>> getMemories() {
        CollectionModel<Memory> model = CollectionModel.of(memoryRepository.findAll());

        final String uriString = ServletUriComponentsBuilder.fromCurrentRequest().build().toUriString();
        model.add(Link.of(uriString, "self"));
        model.add(linkTo(methodOn(MemoryController.class).getMemoryById(12L)).withRel("get-one-by-id"));

        return ResponseEntity.ok(model);
    }

    /**
     * Get Memory by provide id
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public ResponseEntity<EntityModel<Memory>> getMemoryById(@PathVariable(value = "id") long id){
        Optional<Memory> memory = memoryRepository.findById(id);

        if(memory.isEmpty())
        {
            return ResponseEntity.notFound().build();
        }

        EntityModel<Memory> model = EntityModel.of(memory.get());
        final String uriString = ServletUriComponentsBuilder.fromCurrentRequest().build().toUriString();
        model.add(Link.of(uriString, "self"));
        model.add(linkTo(methodOn(MemoryController.class).getMemories()).withRel("get-all"));

        return ResponseEntity.ok(model);
    }

    /**
     * Delete Memory by provide id
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public ResponseEntity deleteMemoryById(@PathVariable long id){
        Optional<Memory> memory = memoryRepository.findById(id);

        if (memory.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        memoryRepository.delete(memory.get());
        return ResponseEntity.ok().build();
    }

    /**
     * Post(add) new Memory, provide Memory object
     * @param memory
     * @return
     */
    @PostMapping
    public String addManufacturerCard(@RequestBody MemoryController memory){
        return "Memory added";
    }
}
