package lt.viko.eif.eshopapi.controller;

import lt.viko.eif.eshopapi.dto.processor.CreateProcessorDTO;
import lt.viko.eif.eshopapi.dto.processor.UpdateProcessorDTO;
import lt.viko.eif.eshopapi.model.Processor;
import lt.viko.eif.eshopapi.repository.ProcessorRepository;
import lt.viko.eif.eshopapi.service.ProcessorService;
import org.apache.tomcat.jni.Proc;
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
@RequestMapping(value = "/processors", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProcessorController {
    @Autowired
    ProcessorRepository processorRepository;
    @Autowired
    ProcessorService processorService;
    /**
     * Get a list of Processor objects
     * @return
     */
    @GetMapping
    public ResponseEntity<CollectionModel<Processor>> getProcessors() {
        CollectionModel<Processor> model = CollectionModel.of(processorRepository.findAll());

        final String uriString = ServletUriComponentsBuilder.fromCurrentRequest().build().toUriString();
        model.add(Link.of(uriString, "self"));
        model.add(linkTo(methodOn(ProcessorController.class).getProcessorById(12L)).withRel("get-one-by-id"));

        return ResponseEntity.ok(model);
    }

    /**
     * Get Processor provide id
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public ResponseEntity<EntityModel<Processor>> getProcessorById(@PathVariable(value = "id") long id){
        Optional<Processor> processor = processorRepository.findById(id);

        if(processor.isEmpty())
        {
            return ResponseEntity.notFound().build();
        }

        EntityModel<Processor> model = EntityModel.of(processor.get());
        final String uriString = ServletUriComponentsBuilder.fromCurrentRequest().build().toUriString();
        model.add(Link.of(uriString, "self"));
        model.add(linkTo(methodOn(ProcessorController.class).getProcessors()).withRel("get-all"));

        return ResponseEntity.ok(model);
    }

    /**
     * Delete Processor by provided id
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public ResponseEntity  deleteProcessorById(@PathVariable long id){
        Optional<Processor> processor = processorRepository.findById(id);
        if (processor.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        processorRepository.delete(processor.get());
        return ResponseEntity.ok().build();
    }

    /**
     * Post(add) new Processor, provide Processor object
     * @param newProcessor
     * @return ResponseEntity<EntityModel<Processor>>
     */
    @PostMapping
    public ResponseEntity<EntityModel<Processor>> addProcessor(@RequestBody CreateProcessorDTO newProcessor){
        /**
         * calling processorService function createProcessor and providing newProcessor from request body
         */
        Processor processor = processorService.createProcessor(newProcessor);

        if (processor == null) {
            return ResponseEntity.notFound().build();
        }

        EntityModel<Processor> model = EntityModel.of(processor);
        model.add(linkTo(methodOn(ProcessorController.class).getProcessors()).withRel("get-all"));
        model.add(linkTo(methodOn(ProcessorController.class).getProcessorById(12L)).withRel("get-one-by-id"));

        return ResponseEntity.ok(model);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<EntityModel<Processor>> updateProcessorById(@PathVariable(value = "id") long id, @RequestBody UpdateProcessorDTO newProcessor) {
        Optional<Processor> processor = processorRepository.findById(id);

        if (processor.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        Processor updatedProcessor = processorService.updateProcessor(id, newProcessor);

        EntityModel<Processor> model = EntityModel.of(updatedProcessor);
        final String uriString = ServletUriComponentsBuilder.fromCurrentRequest().build().toUriString();
        model.add(Link.of(uriString, "self"));
        model.add(linkTo(methodOn(ProcessorController.class).getProcessorById(updatedProcessor.getId())).withRel("get-this-by-id"));
        model.add(linkTo(methodOn(ProcessorController.class).getProcessors()).withRel("get-all"));

        return ResponseEntity.ok(model);
    }





}
