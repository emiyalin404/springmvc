package net.javaguides.springboot.controller;

import net.javaguides.springboot.entity.Product;
import net.javaguides.springboot.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/VueTest/AddProduct")
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/QueryProduct")
    public ResponseEntity<List<Product>>searchProducts(@RequestParam("query") String query){
        return ResponseEntity.ok(productService.searchProducts(query));
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return  productService.createProduct(product);
    }
}