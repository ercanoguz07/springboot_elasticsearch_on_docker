package com.oguz.SpringBootIntegrationWithElasticserachOnDocker.service;

import com.oguz.SpringBootIntegrationWithElasticserachOnDocker.entity.Product;
import com.oguz.SpringBootIntegrationWithElasticserachOnDocker.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;

    public Iterable<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public Product insertProduct(Product product) {
        return productRepo.save(product);
    }
}
