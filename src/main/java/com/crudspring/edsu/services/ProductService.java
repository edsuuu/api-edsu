package com.crudspring.edsu.services;

import com.crudspring.edsu.entities.Product;
import com.crudspring.edsu.entities.User;
import com.crudspring.edsu.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired //injecao de dependencia
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj =  productRepository.findById(id);
        return obj.get();
    }
}
