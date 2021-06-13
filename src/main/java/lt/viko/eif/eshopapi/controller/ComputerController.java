package lt.viko.eif.eshopapi.controller;

import lt.viko.eif.eshopapi.dto.computer.CreateComputerDTO;
import lt.viko.eif.eshopapi.dto.computer.UpdateComputerDTO;
import lt.viko.eif.eshopapi.model.Computer;
import lt.viko.eif.eshopapi.repository.ComputerRepository;
import lt.viko.eif.eshopapi.service.ComputerService;
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
@RequestMapping(value = "/computers", produces = MediaType.APPLICATION_JSON_VALUE)
public class ComputerController {

    @Autowired
    ComputerRepository computerRepository;
    
    @Autowired
    ComputerService computerService;

    /**
     * Get a list of computers
     * @return
     */
    @GetMapping
    public ResponseEntity<CollectionModel<Computer>> getComputers() {
        CollectionModel<Computer> model = CollectionModel.of(computerRepository.findAll());

        final String uriString = ServletUriComponentsBuilder.fromCurrentRequest().build().toUriString();
        model.add(Link.of(uriString, "self"));
        model.add(linkTo(methodOn(ComputerController.class).getComputerById(12L)).withRel("get-one-by-id"));

        return ResponseEntity.ok(model);
    }

    /**
     * Get computer by provide id
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public ResponseEntity<EntityModel<Computer>> getComputerById(@PathVariable(value = "id") long id){
        Optional<Computer> computer = computerRepository.findById(id);

        if(computer.isEmpty())
        {
            return ResponseEntity.notFound().build();
        }

        EntityModel<Computer> model = EntityModel.of(computer.get());
        final String uriString = ServletUriComponentsBuilder.fromCurrentRequest().build().toUriString();
        model.add(Link.of(uriString, "self"));
        model.add(linkTo(methodOn(ComputerController.class).getComputers()).withRel("get-all"));

        return ResponseEntity.ok(model);
    }

    /**
     * Delete computer by provide id
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public ResponseEntity deleteComputerById(@PathVariable long id){
        Optional<Computer> computer = computerRepository.findById(id);

        if (computer.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        computerRepository.delete(computer.get());
        return ResponseEntity.ok().build();
    }

    /**
     * Post(Add) computer
     * @param newComputer
     * @return
     */
    @PostMapping
    public ResponseEntity<EntityModel<Computer>> addComputer(@RequestBody CreateComputerDTO newComputer) {
    	Computer computer = computerService.createComputer(newComputer);
    	
    	if (computer == null) {
    		return ResponseEntity.badRequest().build();
    	}
    	
    	EntityModel<Computer> model = EntityModel.of(computer);
    	model.add(linkTo(methodOn(ComputerController.class).getComputers()).withRel("get-all"));
    	model.add(linkTo(methodOn(ComputerController.class).getComputerById(12L)).withRel("get-one-by-id"));
    	
    	return ResponseEntity.ok(model);
    }

    /**
     * PUT request to route /computers/{id}. Have to provide UpdateComputerDTO
     * @param id
     * @param newComputer
     * @return ResponseEntity<EntityModel<Computer>>
     */
    @PutMapping(value = "/{id}")
    public ResponseEntity<EntityModel<Computer>> updateComputerById(@PathVariable(value = "id") long id, @RequestBody UpdateComputerDTO newComputer) {
        Optional<Computer> computer = computerRepository.findById(id);
        if (computer.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        Computer updatedComputer = computerService.updateComputerById(id, newComputer);

        EntityModel<Computer> model = EntityModel.of(updatedComputer);
        final String uriString = ServletUriComponentsBuilder.fromCurrentRequest().build().toUriString();
        model.add(Link.of(uriString, "self"));
        model.add(linkTo(methodOn(ComputerController.class).getComputerById(updatedComputer.getId())).withRel("get-this-by-id"));
        model.add(linkTo(methodOn(ComputerController.class).getComputers()).withRel("get-all"));

        return ResponseEntity.ok(model);
    }

}
