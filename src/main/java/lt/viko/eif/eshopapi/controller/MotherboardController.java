package lt.viko.eif.eshopapi.controller;

import lt.viko.eif.eshopapi.model.Motherboard;
import lt.viko.eif.eshopapi.model.Processor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/motherboard", produces = MediaType.APPLICATION_JSON_VALUE)
public class MotherboardController {
    /**
     * Get a list of Motherboards objects
     * @return
     */
    @GetMapping
    public String getMotherboards() {
        return "Processors";
    }

    /**
     * Get Motherboard provide id
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public String getMotherboardById(@PathVariable(value = "id") long id){
        return "Get Motherboard by id";
    }

    /**
     * Delete Motherboard by provided id
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public String deleteMotherboardById(@PathVariable long id){
        return "Delete Motherboard by id";
    }

    /**
     * Post(add) new Motherboard, provide Motherboard object
     * @param motherboard
     * @return
     */
    @PostMapping
    public String addMotherboard(@RequestBody Motherboard motherboard){
        return "Motherboard added";
    }
}
