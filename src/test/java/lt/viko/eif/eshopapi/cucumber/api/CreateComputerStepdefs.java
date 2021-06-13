package lt.viko.eif.eshopapi.cucumber.api;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lt.viko.eif.eshopapi.constant.Currency;
import lt.viko.eif.eshopapi.controller.ComputerController;
import lt.viko.eif.eshopapi.dto.computer.CreateComputerDTO;
import lt.viko.eif.eshopapi.model.Computer;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CreateComputerStepdefs {

    private CreateComputerDTO createComputerDTO;
    private ResponseEntity<EntityModel<Computer>> createdComputer;

    @Autowired
    private ComputerController computerController;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        HttpServletRequest httpServletRequestMock = new MockHttpServletRequest();
        ServletRequestAttributes servletRequestAttributes = new ServletRequestAttributes(httpServletRequestMock);
        RequestContextHolder.setRequestAttributes(servletRequestAttributes);
    }

    @Given("user wants to create a new computer")
    public void userWantsToCreateANewComputer() {
        createComputerDTO = new CreateComputerDTO();
        createComputerDTO.setName("TEST PC");
        createComputerDTO.setPrice(99.99D);
        createComputerDTO.setCurrency(Currency.EUR);
        createComputerDTO.setStockQuantity(555);
        createComputerDTO.setManufacturerId(1L);
        createComputerDTO.setProcessorId(10L);
        createComputerDTO.setGraphicsCardId(12L);
        createComputerDTO.setMemoryId(15L);
        createComputerDTO.setStorageId(19L);
        createComputerDTO.setMotherboardId(16L);
    }

    @When("user submits a post request")
    public void userSubmitsAPostRequest() {
        createdComputer = computerController.addComputer(createComputerDTO);
    }

    @Then("computer is created")
    public void computerIsCreated() {
        assertEquals(createdComputer.getStatusCode(), HttpStatus.OK);
    }
}
