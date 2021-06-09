package lt.viko.eif.eshopapi.dto.cart;

public class CreateCartDTO {
    private boolean isCheckedOut;

    public boolean isCheckedOut() { return isCheckedOut; }

    public void setCheckedOut(boolean checkedOut) { isCheckedOut = checkedOut; }
}
