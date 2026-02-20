package org.example.productcatalogservice_feb2026.services;

import org.example.productcatalogservice_feb2026.models.Product;

public interface IProductService {

    Product getProductById(Long id);

    Product replaceProduct(Long id, Product product);
}
