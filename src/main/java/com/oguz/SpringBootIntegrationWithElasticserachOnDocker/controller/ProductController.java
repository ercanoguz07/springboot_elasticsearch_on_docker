package com.oguz.SpringBootIntegrationWithElasticserachOnDocker.controller;

import com.oguz.SpringBootIntegrationWithElasticserachOnDocker.entity.Product;
import com.oguz.SpringBootIntegrationWithElasticserachOnDocker.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public Iterable<Product> getAllProducctsProducts(){
        return productService.getAllProducts();
    }

    @PostMapping("/insert")
    public Product insertProduct(@RequestBody  Product product){
        return productService.insertProduct(product);
    }

}
