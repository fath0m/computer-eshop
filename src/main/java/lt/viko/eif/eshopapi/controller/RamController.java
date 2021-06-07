package lt.viko.eif.eshopapi.controller;

import lt.viko.eif.eshopapi.model.Ram;
import lt.viko.eif.eshopapi.repository.RamRepository;
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
@RequestMapping(value = "/rams", produces = MediaType.APPLICATION_JSON_VALUE)
public class RamController {
    @Autowired
    RamRepository ramRepository;
    /**
     * Get a list of Ram objects
     * @return
     */
    @GetMapping
    public ResponseEntity<CollectionModel<Ram>> getRam() {
        CollectionModel<Ram> model = CollectionModel.of(ramRepository.findAll());

        final String uriString = ServletUriComponentsBuilder.fromCurrentRequest().build().toUriString();
        model.add(Link.of(uriString, "self"));
        model.add(linkTo(methodOn(RamController.class).getRamById(12L)).withRel("get-one-by-id"));

        return ResponseEntity.ok(model);
    }

    /**
     * Get Ram provide id
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public ResponseEntity<EntityModel<Ram>> getRamById(@PathVariable(value = "id") long id){
        Optional<Ram> ram = ramRepository.findById(id);
        if(ram.isEmpty())
        {
            return ResponseEntity.notFound().build();
        }

        EntityModel<Ram> model = EntityModel.of(ram.get());
        final String uriString = ServletUriComponentsBuilder.fromCurrentRequest().build().toUriString();
        model.add(Link.of(uriString, "self"));
        model.add(linkTo(methodOn(RamController.class).getRam()).withRel("get-all"));

        return ResponseEntity.ok(model);
    }

    /**
     * Delete Ram by provided id
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public ResponseEntity deleteRamById(@PathVariable long id){
        Optional<Ram> ram = ramRepository.findById(id);
        if (ram.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        ramRepository.delete(ram.get());
        return ResponseEntity.ok().build();
    }

    /**
     * Post(add) new Ram, provide Ram object
     * @param ram
     * @return
     */
    @PostMapping
    public String addRam(@RequestBody Ram ram){
        return "Ram added";
    }
}
