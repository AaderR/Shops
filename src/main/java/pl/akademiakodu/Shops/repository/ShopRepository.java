package pl.akademiakodu.Shops.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import pl.akademiakodu.Shops.model.Shop;

import java.util.List;

public interface ShopRepository extends CrudRepository<Shop,Integer> {


    @Query(value = "SELECT * FROM shop s WHERE LOWER(s.name) =  LOWER(:name)",
            nativeQuery = true)
    List<Shop> findShopsByName(@Param("name") String name);


}
