package lt.viko.eif.eshopapi.dto.checkout;

public class UpdateCheckoutDTO extends CreateCheckoutDTO {

    private boolean isPaidOut;

    public boolean isPaidOut() {
        return isPaidOut;
    }

    public void setPaidOut(boolean paidOut) {
        isPaidOut = paidOut;
    }

}
