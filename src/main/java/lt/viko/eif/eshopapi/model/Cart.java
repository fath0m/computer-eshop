package lt.viko.eif.eshopapi.model;

import javax.persistence.*;

/**
 * Represents Cart object which has id, isCheckedOut properties
 * This class is responsible for getting, setting above mentioned properties
 * @author Karolis, Eimantas, Lukas, Jonas
 * version 1.0
 */
@Entity
@Table(name = "carts")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private boolean isCheckedOut;

    /**
     * Getter for cart Id
     * @return id
     */
    public Long getId() { return id; }

    /**
     * Setter for cart Id
     * @param id
     */
    public void setId(Long id) { this.id = id; }

    /**
     * Getter for is item checked out
     * @return isCheckedOut (true or false)
     */
    public boolean isCheckedOut() { return isCheckedOut; }

    /**
     * Setter for checkedOut
     * @param checkedOut
     */
    public void setCheckedOut(boolean checkedOut) { isCheckedOut = checkedOut; }
}
