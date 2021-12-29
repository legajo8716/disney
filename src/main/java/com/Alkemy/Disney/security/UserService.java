package com.Alkemy.Disney.security;

import com.Alkemy.Disney.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    private List<String> errors = new ArrayList<>();

    @Transactional
    public String save(User model) {

            model.setPassword(passwordEncoder.encode(model.getPassword()));

            repository.save(model);
            return "Usuario registrado con exito";


    }







    public boolean existsUser(String username) {
        return repository.existsUser(username);
    }

    public User findByUsername(String username) {
       return  repository.findByUsername(username);
    }
}