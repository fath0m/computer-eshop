package lt.viko.eif.eshopapi.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/computers", produces = MediaType.APPLICATION_JSON_VALUE)
public class ComputerController {

    // Placeholder
    @GetMapping(value = "/")
    public String getComputers() {
        return "Computers";
    }

}
