package net.javaguides.springboot.repository;

import net.javaguides.springboot.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface ProductRepository extends JpaRepository <Product,Long> {
@Query("SELECT p FROM Product p WHERE "+
"p.ITEM_NO LIKE CONCAT('%' ,:query, '%')" +
 "AND p.ITEM_NAME LIKE CONCAT( '%', :query, '%')")
    List<Product> searchProducts(String query);

//    @Query(value = "SELECT * FROM Product p WHERE "+
//            "p.name LIKE CONCAT('%' ,:query, '%')" +
//            "Or p.description LIKE CONCAT( '%', :query, '%')",nativeQuery = true)
//    List<Product> searchProductsSQL(String query);
}