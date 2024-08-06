package com.example.dao;

import com.example.model.User;

import java.util.ArrayList;
import java.util.List;

public interface UserMapper {

    List<User> getAllUsers();
    User getUserById(int id);
    void addUser(User user);

    // Default implementation for demonstration
    class InMemoryUserMapper implements UserMapper {
        private final List<User> users = new ArrayList<>();

        public InMemoryUserMapper() {
            // Adding some default users
            users.add(new User(1, "John Doe", "john@example.com"));
            users.add(new User(2, "Jane Smith", "jane@example.com"));
        }

        @Override
        public List<User> getAllUsers() {
            return new ArrayList<>(users);
        }

        @Override
        public User getUserById(int id) {
            return users.stream().filter(user -> user.getId() == id).findFirst().orElse(null);
        }

        @Override
        public void addUser(User user) {
            users.add(user);
        }
    }
}

