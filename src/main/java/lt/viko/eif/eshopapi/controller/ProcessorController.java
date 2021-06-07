package lt.viko.eif.eshopapi.controller;

import lt.viko.eif.eshopapi.model.Processor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/cpu", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProcessorController {
    /**
     * Get a list of Processor objects
     * @return
     */
    @GetMapping
    public String getProcessors() {
        return "Processors";
    }

    /**
     * Get Processor provide id
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public String getProcessorById(@PathVariable(value = "id") long id){
        return "Get Processor by id";
    }

    /**
     * Delete Processor by provided id
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public String deleteProcessorById(@PathVariable long id){
        return "Delete Processor by id";
    }

    /**
     * Post(add) new Processor, provide Processor object
     * @param processor
     * @return
     */
    @PostMapping
    public String addProcessor(@RequestBody Processor processor){
        return "Processor added";
    }

}
