package lt.viko.eif.eshopapi.dto.cart;

/**
 * This class is responsible for Creating cartDTO
 * This class has isCheckedOut and setCheckedOut that
 * returns the value if its checked out true or false
 * @author Lukas, Eimantas, Karolis
 * version 1.0
 */
public class CreateCartDTO {
    private boolean isCheckedOut;

    public boolean isCheckedOut() { return isCheckedOut; }

    public void setCheckedOut(boolean checkedOut) { isCheckedOut = checkedOut; }
}
