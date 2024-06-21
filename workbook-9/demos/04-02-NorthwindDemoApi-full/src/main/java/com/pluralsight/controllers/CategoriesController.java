package com.pluralsight.controllers;

// all requests related to Categories will
// be handled by THIS controller

import com.pluralsight.models.Category;
import com.pluralsight.services.CategoriesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoriesController
{
    private CategoriesDao categoriesDao;

    @Autowired
    public CategoriesController(CategoriesDao categoriesDao)
    {
        this.categoriesDao = categoriesDao;
    }

    @GetMapping("")
    public List<Category> getAllCategories()
    {
        return categoriesDao.getAll();
    }

    @GetMapping("{id}")
    public Category getById(@PathVariable int id)
    {
        return categoriesDao.getById(id);
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public Category addCategory(@RequestBody Category category)
    {
        return categoriesDao.add(category);
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@PathVariable int id, @RequestBody Category category)
    {
        categoriesDao.update(id, category);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id)
    {
        categoriesDao.delete(id);
    }
}
