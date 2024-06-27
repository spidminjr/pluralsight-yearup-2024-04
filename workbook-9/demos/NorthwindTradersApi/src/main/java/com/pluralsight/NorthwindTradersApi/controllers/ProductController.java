package com.pluralsight.NorthwindTradersApi.controllers;

import com.pluralsight.NorthwindTradersApi.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;


@RestController
public class ProductController
{
    private List<Product> productList = new ArrayList<>();

    public ProductController()
    {
        productList.add(new Product(1,"Product A", 1, 10.0));
        productList.add(new Product(2,"Product B", 1, 15.0));
        productList.add(new Product(3,"Product C", 2, 20.0));
        productList.add(new Product(4,"Product D", 2, 25.0));
    }

    @GetMapping("/products")
    public List<Product> getAllProducts()
    {
        return productList;
    }

    @GetMapping("/products/{id}")
    public Product getProductbyId(@PathVariable int id)
    {
        return productList.stream()
                .filter(product -> product.getProductId() == id)
                .findFirst()
                .orElse(null);
    }
}
