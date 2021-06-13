package lt.viko.eif.eshopapi.dto.cart;

/**
 * Dto for creating cart and check if its checked
 */
public class CreateCartDTO {
    private boolean isCheckedOut;

    public boolean isCheckedOut() { return isCheckedOut; }

    public void setCheckedOut(boolean checkedOut) { isCheckedOut = checkedOut; }
}
