package ra.academy.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Zipcode {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String name ;
    @OneToOne
    @JoinColumn(name = "city_id")
    private City city;

    @OneToMany(mappedBy = "zipcode")
    private List<Author> authors;

}
