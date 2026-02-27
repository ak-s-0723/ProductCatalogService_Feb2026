package org.example.productcatalogservice_feb2026.repos;

import org.example.productcatalogservice_feb2026.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//@Repository
public interface ProductRepo extends JpaRepository<Product,Long> {
        Optional<Product> findById(Long id);

        List<Product> findAll();

        Product save(Product product);

        void deleteById(Long id);

        List<Product> findProductByPriceBetween(Double low, Double high);

       // List<Product> findAllOrderByPrice(); WRONG SYNTAX
        List<Product> findAllByOrderByPrice();

        //ToDo : Run Custom Queries via Jpa
}
