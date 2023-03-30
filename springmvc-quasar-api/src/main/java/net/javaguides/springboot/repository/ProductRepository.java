package net.javaguides.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import net.javaguides.springboot.entity.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

    @Query("SELECT p FROM Product p WHERE " +
            "p.ITEM_NAME LIKE CONCAT('%',:query, '%')" +
            "Or p.PRICE LIKE CONCAT('%', :query, '%')")
    List<Product> searchProducts(String query);

}
