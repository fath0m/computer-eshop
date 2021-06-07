package lt.viko.eif.eshopapi.controller;

import lt.viko.eif.eshopapi.model.GraphicsCard;
import lt.viko.eif.eshopapi.model.Manufacturer;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/manufacturer", produces = MediaType.APPLICATION_JSON_VALUE)
public class ManufacturerController {
    /**
     * Get a list of Manufacturer objects
     * @return
     */
    @GetMapping
    public String getManufacturers() {
        return "Manufacturers";
    }

    /**
     * Get Manufacturer by provide id
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public String getManufacturerById(@PathVariable(value = "id") long id){
        return "Manufacturer by id";
    }

    /**
     * Delete Manufacturer by provide id
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public String deleteManufacturerById(@PathVariable long id){
        return "Delete Manufacturer by id";
    }

    /**
     * Post(add) new Graphic card, provide Graphic card object
     * @param manufacturer
     * @return
     */
    @PostMapping
    public String addManufacturerCard(@RequestBody Manufacturer manufacturer){
        return "Manufacturer added";
    }
}
