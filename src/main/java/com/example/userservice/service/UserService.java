package com.example.userservice.service;

import com.example.userservice.model.User;
import com.example.userservice.repository.UserRepository;
import java.util.*;

public class UserService {

    private final UserRepository repo = new UserRepository();

    public List<User> getAllUsers() {
        return repo.findAll();
    }

    public User createUser(User user) {
        return repo.save(user);
    }

    public User getUser(Long id) {
        return repo.findById(id).orElse(null);
    }

    public User updateUser(Long id, User user) {
        return repo.update(id, user);
    }

    public void deleteUser(Long id) {
        repo.delete(id);
    }
}
