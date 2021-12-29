package com.Alkemy.Disney.repository;

import com.Alkemy.Disney.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {


    List<User> findAll();
    Boolean existsByEmail(String email);
    Boolean existsByCvu(String cvu);
    Boolean existsByWallet(String wallet);
    User findByEmail(String email);
    User findById(int id );
}