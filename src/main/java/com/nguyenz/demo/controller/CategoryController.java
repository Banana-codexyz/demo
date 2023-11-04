package com.nguyenz.demo.controller;

import com.nguyenz.demo.model.Category;
import com.nguyenz.demo.serivce.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping("/getAll")
    public List<Category> getAll() {
        return categoryService.getAll();
    }

    @GetMapping("/getById/{id}")
    public Category getById(@PathVariable int id) {
        return categoryService.getById(id);
    }
}
