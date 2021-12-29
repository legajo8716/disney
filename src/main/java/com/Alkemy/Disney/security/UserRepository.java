package com.Alkemy.Disney.security;

import com.Alkemy.Disney.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
    public User findById(int id) ;

    User findByUsername(String username);

    boolean existsUser(String username);

    void save(User model);
}
