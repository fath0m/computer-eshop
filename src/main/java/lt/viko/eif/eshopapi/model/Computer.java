package lt.viko.eif.eshopapi.model;

import javax.persistence.*;

@Entity
@Table(name = "computers")
public class Computer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

}
