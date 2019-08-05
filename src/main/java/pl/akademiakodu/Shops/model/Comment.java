package pl.akademiakodu.Shops.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@NoArgsConstructor
@Data
@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;
    private boolean cheap;
    private Double price;

    @OneToOne                               // sprawia ze bedzie tworzony klucz obcy o
    private Shop shop;                      //nazwie shop_id ktory bedzie odnosil sie do tabeli shop

    @Override
    public String toString(){
        return description;
    }


}
