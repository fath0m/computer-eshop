package lt.viko.eif.eshopapi.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/memory", produces = MediaType.APPLICATION_JSON_VALUE)
public class MemoryController {
    /**
     * Get a list of Memory objects
     * @return
     */
    @GetMapping
    public String getMemorys() {
        return "Memorys";
    }

    /**
     * Get Memory by provide id
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public String getMemoryById(@PathVariable(value = "id") long id){
        return "Get Memory by id";
    }

    /**
     * Delete Memory by provide id
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public String deleteMemoryById(@PathVariable long id){
        return "Delete Memory by id";
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
