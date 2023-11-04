package com.nguyenz.demo.serivce;

import com.nguyenz.demo.model.Category;
import com.nguyenz.demo.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    public Category getById(int id) {
        return categoryRepository.findById(id).orElse(null);
    }
}
