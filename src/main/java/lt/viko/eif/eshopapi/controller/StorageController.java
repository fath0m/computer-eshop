package lt.viko.eif.eshopapi.controller;

import lt.viko.eif.eshopapi.model.Processor;
import lt.viko.eif.eshopapi.model.Storage;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/storage", produces = MediaType.APPLICATION_JSON_VALUE)
public class StorageController {
    /**
     * Get a list of Storage objects
     * @return
     */
    @GetMapping
    public String getStorages() {
        return "Storages";
    }

    /**
     * Get Storage provide id
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public String getStorageById(@PathVariable(value = "id") long id){
        return "Get Storage by id";
    }

    /**
     * Delete Storage by provided id
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public String deleteStorageById(@PathVariable long id){
        return "Delete Storage by id";
    }

    /**
     * Post(add) new Storage, provide Storage object
     * @param storage
     * @return
     */
    @PostMapping
    public String addProcessor(@RequestBody Storage storage){
        return "Storage added";
    }
}
