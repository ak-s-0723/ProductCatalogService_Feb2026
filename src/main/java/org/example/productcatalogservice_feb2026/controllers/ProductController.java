package org.example.productcatalogservice_feb2026.controllers;

import org.example.productcatalogservice_feb2026.models.Product;
import org.springframework.web.bind.annotation.*;

@RestController   //Because I want spring to create bean(singleton object) of ProductController
public class ProductController {


    //To Get Product Details By Id
    @GetMapping("/products/{id}")  //Variables are specified in braces
    public Product getProductById(@PathVariable("id") Long productId) {
        throw new RuntimeException("bad request");
//        Product product = new Product();
//        product.setId(productId);
//        return product;
    }


    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product) {
        if(product.getId() == null) {
            throw new RuntimeException("id not found");
        }

        return product;
    }

//www.google.com/products/100

}


//ControllerA       ServiceA             RepoA
//
//                                       RepoB
// ControllerB     ServiceB             ---
//                                      ---
//                ServiceC
//                                       ---
//  ---
//
//                ServiceD
//   ---
//
//
//  ---