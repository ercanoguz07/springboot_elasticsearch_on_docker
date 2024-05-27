package com.oguz.SpringBootIntegrationWithElasticserachOnDocker.repo;

import com.oguz.SpringBootIntegrationWithElasticserachOnDocker.entity.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends ElasticsearchRepository<Product,Integer> {
}
