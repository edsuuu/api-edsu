package com.crudspring.edsu.services;

import com.crudspring.edsu.entities.User;
import com.crudspring.edsu.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired //injecao de dependencia
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj =  userRepository.findById(id);
        return obj.get();
    }
}
