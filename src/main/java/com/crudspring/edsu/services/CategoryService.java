package com.crudspring.edsu.services;

import com.crudspring.edsu.entities.Category;
import com.crudspring.edsu.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired //injecao de dependencia
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj =  categoryRepository.findById(id);
        return obj.get();
    }
}
