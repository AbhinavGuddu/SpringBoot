package com.SpringBoot.MyFirstProject.service;

import com.SpringBoot.MyFirstProject.model.User;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class UserService {
    private List<User> users = new ArrayList<>();
    private Long nextId = 1L;

    public UserService() {
        users.add(new User(nextId++, "Raam", "raam@example.com"));
        users.add(new User(nextId++, "Shyam", "shyam@example.com"));
    }

    public List<User> getAllUsers() {
        return users;
    }

    public User getUserById(Long id) {
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public User createUser(User user) {
        user.setId(nextId++);
        users.add(user);
        return user;
    }
}