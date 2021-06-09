package lt.viko.eif.eshopapi.model;

import javax.persistence.*;

@Entity
@Table(name = "carts")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private boolean isCheckedOut;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public boolean isCheckedOut() { return isCheckedOut; }

    public void setCheckedOut(boolean checkedOut) { isCheckedOut = checkedOut; }
}
