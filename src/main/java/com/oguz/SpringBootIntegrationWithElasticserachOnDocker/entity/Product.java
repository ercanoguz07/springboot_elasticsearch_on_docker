package com.oguz.SpringBootIntegrationWithElasticserachOnDocker.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(indexName = "product_index")
public class Product {
    private int id;
    private String pName;
    private String qty;
    private double price;
}
