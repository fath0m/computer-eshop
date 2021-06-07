package lt.viko.eif.eshopapi.controller;

import lt.viko.eif.eshopapi.model.Ram;
import lt.viko.eif.eshopapi.model.Storage;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/rams", produces = MediaType.APPLICATION_JSON_VALUE)
public class RamController {
    /**
     * Get a list of Ram objects
     * @return
     */
    @GetMapping
    public String getRam() {
        return "Rams";
    }

    /**
     * Get Ram provide id
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public String getRamById(@PathVariable(value = "id") long id){
        return "Get Ram by id";
    }

    /**
     * Delete Ram by provided id
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public String deleteRamById(@PathVariable long id){
        return "Delete Ram by id";
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
