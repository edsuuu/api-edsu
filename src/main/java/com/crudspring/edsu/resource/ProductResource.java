package com.crudspring.edsu.resource;

import com.crudspring.edsu.entities.Product;
import com.crudspring.edsu.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProductResource {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> lista = productService.findAll();
        return ResponseEntity.ok().body(lista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Product obj = productService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
