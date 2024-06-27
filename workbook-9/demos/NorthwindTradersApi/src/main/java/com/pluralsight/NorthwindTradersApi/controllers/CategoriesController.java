package com.pluralsight.NorthwindTradersApi.controllers;


import com.pluralsight.NorthwindTradersApi.models.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoriesController
{
    private List<Category> categoryList = new ArrayList<>();

    public CategoriesController()
    {
        categoryList.add(new Category(1, "Category A"));
        categoryList.add(new Category(2, "Category B"));
    }

    @GetMapping("/categories")
    public List<Category> getAllCategories()
    {
        return categoryList;
    }

    @GetMapping("/categories/{id}")
    public Category getCategoryById(@PathVariable int id)
    {
        return categoryList.stream()
                .filter(category -> category.getCategoryId() == id)
                .findFirst()
                .orElse(null);
    }
}
