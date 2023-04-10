package net.javaguides.springboot.service;

import net.javaguides.springboot.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> searchProducts(String query);
    List<Product>searchProductall(String queryAll);

    Product createProduct(Product product);
}
