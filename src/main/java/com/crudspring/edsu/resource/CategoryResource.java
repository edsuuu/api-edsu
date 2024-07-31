package com.crudspring.edsu.resource;

import com.crudspring.edsu.entities.Category;
import com.crudspring.edsu.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryResource {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> lista = categoryService.findAll();
        return ResponseEntity.ok().body(lista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id) {
        Category obj = categoryService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
