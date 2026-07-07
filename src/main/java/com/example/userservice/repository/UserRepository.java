package com.example.userservice.repository;

import com.example.userservice.model.User;
import java.util.*;

public class UserRepository {

    private final Map<Long, User> users = new HashMap<>();
    private Long idCounter = 1L;

    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }

    public User save(User user) {
        user.setId(idCounter++);
        users.put(user.getId(), user);
        return user;
    }

    public Optional<User> findById(Long id) {
        return Optional.ofNullable(users.get(id));
    }

    public User update(Long id, User user) {
        user.setId(id);
        users.put(id, user);
        return user;
    }

    public void delete(Long id) {
        users.remove(id);
    }
}
