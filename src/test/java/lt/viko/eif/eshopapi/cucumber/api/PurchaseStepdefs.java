package lt.viko.eif.eshopapi.cucumber.api;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import lt.viko.eif.eshopapi.controller.*;
import lt.viko.eif.eshopapi.dto.cart.CreateCartDTO;
import lt.viko.eif.eshopapi.dto.cartItems.CreateCartItemsDTO;
import lt.viko.eif.eshopapi.dto.checkout.CreateCheckoutDTO;
import lt.viko.eif.eshopapi.dto.payment.CreatePaymentDTO;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PurchaseStepdefs {

    private Long computerId;
    private Long cartId;
    private Long checkoutId;

    @Autowired
    CartController cartController;

    @Autowired
    CartItemController cartItemController;

    @Autowired
    CheckoutController checkoutController;

    @Autowired
    PaymentController paymentController;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        HttpServletRequest httpServletRequestMock = new MockHttpServletRequest();
        ServletRequestAttributes servletRequestAttributes = new ServletRequestAttributes(httpServletRequestMock);
        RequestContextHolder.setRequestAttributes(servletRequestAttributes);
    }

    @Given("user chose a computer")
    public void userChoseAComputer() {
        computerId = 20L;
    }

    @And("a cart was created")
    public void aCartWasCreated() {
        CreateCartDTO dto = new CreateCartDTO();
        dto.setCheckedOut(false);

        var response = cartController.addCart(dto);
        assertEquals(response.getStatusCode(), HttpStatus.OK);

        cartId = response.getBody().getContent().getId();
    }

    @And("computer is added to the cart")
    public void computerIsAddedToTheCart() {
        CreateCartItemsDTO dto = new CreateCartItemsDTO();
        System.out.println("cartId");
        System.out.println(cartId);
        dto.setCartId(cartId);
        dto.setComputerId(computerId);
        dto.setQuantity(1L);

        var response = cartItemController.addCartItem(dto);
        assertEquals(response.getStatusCode(), HttpStatus.OK);
    }

    @And("checkout is made")
    public void checkoutIsMade() {
        CreateCheckoutDTO dto = new CreateCheckoutDTO();
        dto.setCardId(cartId);
        dto.setFirstName("Test");
        dto.setLastName("Test 2");
        dto.setDeliveryAddress("Test g. 1");
        dto.setDeliveryCity("Vilnius");
        dto.setDeliveryCountry("Lithuania");

        var response = checkoutController.addCheckout(dto);
        assertEquals(response.getStatusCode(), HttpStatus.OK);

        checkoutId = response.getBody().getContent().getId();
    }

    @And("payment is made")
    public void paymentIsMade() {
        CreatePaymentDTO dto = new CreatePaymentDTO();
        dto.setAmountPaid(555);
        dto.setCheckOutId(checkoutId);

        var response = paymentController.addPayment(dto);
        assertEquals(response.getStatusCode(), HttpStatus.OK);
    }

    @Then("payment was successful")
    public void paymentWasSuccessful() {
    }
}
