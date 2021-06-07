package lt.viko.eif.eshopapi.controller;

import lt.viko.eif.eshopapi.model.Computer;
import lt.viko.eif.eshopapi.model.GraphicsCard;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/gpu", produces = MediaType.APPLICATION_JSON_VALUE)
public class GraphicCardController {
    /**
     * Get a list of Graphic cards
     * @return
     */
    @GetMapping
    public String getGraphicCards() {
        return "GPUs";
    }

    /**
     * Get Graphic card by provide id
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public String getGraphicCardById(@PathVariable(value = "id") long id){
        return "GPU by id";
    }

    /**
     * Delete Graphic card by provide id
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public String deleteGraphicCardById(@PathVariable long id){
        return "Delete by id";
    }

    /**
     * Post(add) new Graphic card, provide Graphic card object
     * @param gpu
     * @return
     */
    @PostMapping
    public String addGraphicCard(@RequestBody GraphicsCard gpu){
        return "GPU added";
    }
}
