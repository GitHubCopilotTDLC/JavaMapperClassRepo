package com.example.app;

import com.example.dao.UserMapper;
import com.example.model.User;

public class App {

    public static void main(String[] args) {
        // Instantiate the UserMapper implementation
        UserMapper userMapper = new UserMapper.InMemoryUserMapper();

        // Add a new user
        User newUser = new User(3, "Alice Johnson", "alice@example.com");
        userMapper.addUser(newUser);

        // Print all users
        System.out.println("All users:");
        userMapper.getAllUsers().forEach(System.out::println);

        // Get user by ID
        System.out.println("User with ID 1:");
        System.out.println(userMapper.getUserById(1));
    }
}

