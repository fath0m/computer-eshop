package lt.viko.eif.eshopapi.dto.checkout;

/**
 * DTO checkout
 */
public class CreateCheckoutDTO {

    private String Firstname;
    private String Lastname;
    private String DeliveryAddress;
    private String DeliveryCity;
    private String DeliveryCountry;
    private boolean IsPaidOut;
    private Long cardId;

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getDeliveryAddress() {
        return DeliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        DeliveryAddress = deliveryAddress;
    }

    public String getDeliveryCity() {
        return DeliveryCity;
    }

    public void setDeliveryCity(String deliveryCity) {
        DeliveryCity = deliveryCity;
    }

    public String getDeliveryCountry() {
        return DeliveryCountry;
    }

    public void setDeliveryCountry(String deliveryCountry) {
        DeliveryCountry = deliveryCountry;
    }

    public boolean isPaidOut() {
        return IsPaidOut;
    }

    public void setPaidOut(boolean paidOut) {
        IsPaidOut = paidOut;
    }

    public Long getCardId() {
        return cardId;
    }

    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }
}
