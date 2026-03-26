package org.example.productcatalogservice_feb2026.repos;

import org.example.productcatalogservice_feb2026.models.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductRepoTest {

    @Autowired
    private ProductRepo productRepo;

    //@Test
    @Transactional //ToDo for Anurag : In Unit Testing classes
    public void testQueries() {
        List<Product> productList =
                productRepo.findAllByOrderByPrice();
        System.out.println(productList.get(0).getPrice());
    }


}