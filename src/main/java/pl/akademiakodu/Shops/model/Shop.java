package pl.akademiakodu.Shops.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Entity
public class Shop {

    @Id                                                         // javax pakiet
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // w bazie danych mamy kolumnę name i adres
    private String name;
    private String address;

    //to pole nie jest tworzone jako kolumna w bazie danych
    @Transient
    private String description;

    @Override
    public String toString() {
        return getName() + " " + getAddress();
    }
    @OneToMany(mappedBy = "shop")
    private List<Comment> comments = new ArrayList<>();



}
