package net.javaguides.springboot.controller;

import jakarta.annotation.Resource;
import net.javaguides.springboot.entity.Product;
import net.javaguides.springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/VueTestApi/api/VueTest/AddProduct")
public class ProductController {
    @Resource
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/search")
    public ResponseEntity<List<Product>> searchProducts(@RequestParam("query") String query){
        return ResponseEntity.ok(productService.searchProducts(query));
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }
}