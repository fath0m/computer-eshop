package lt.viko.eif.eshopapi.controller;

import lt.viko.eif.eshopapi.model.Computer;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/computers", produces = MediaType.APPLICATION_JSON_VALUE)
public class ComputerController {

    /**
     * Get a list of computers
     * @return
     */
    @GetMapping
    public String getComputers() {
        return "Computers";
    }

    /**
     * Get computer by provide id
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public String getComputerById(@PathVariable(value = "id") long id){
        return "Computer by id";
    }

    /**
     * Delete computer by provide id
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public String deleteComputerById(@PathVariable long id){
        return "Delete by id";
    }

    /**
     * Post(Add) computer
     * @param computer
     * @return
     */
    @PostMapping
    public String addComputer(@RequestBody Computer computer){
        return "Car added";
    }

}
