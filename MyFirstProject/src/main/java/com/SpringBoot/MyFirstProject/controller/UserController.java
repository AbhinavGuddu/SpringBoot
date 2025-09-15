package com.SpringBoot.MyFirstProject.controller;

// Required imports
import com.SpringBoot.MyFirstProject.model.User;        // User model class
import com.SpringBoot.MyFirstProject.service.UserService; // User service class
import org.springframework.beans.factory.annotation.Autowired; // Dependency injection
import org.springframework.web.bind.annotation.*;        // REST annotations
import java.util.List;                                  // List interface

/**
 * UserController - Advanced REST Controller for User Management
 * 
 * @RestController:
 * - REST API controller banata hai
 * - JSON response automatically return karta hai
 * 
 * @RequestMapping("/api/users"):
 * - Base URL path set karta hai
 * - Saare methods ka URL /api/users se start hoga
 * - Example: /api/users, /api/users/1, etc.
 */
@RestController
@RequestMapping("/api/users")
public class UserController {

    /**
     * Dependency Injection using @Autowired
     * 
     * @Autowired:
     * - Spring automatically UserService ka instance inject karta hai
     * - Manual object creation ki zarurat nahi
     * - Loose coupling maintain karta hai
     */
    @Autowired
    private UserService userService;

    /**
     * Get All Users API
     * 
     * @GetMapping (without path):
     * - Base URL pe GET request handle karta hai
     * - URL: GET http://localhost:8080/api/users
     * - Response: JSON array of all users
     * 
     * @return List<User> - Saare users ka list
     */
    @GetMapping
    public List<User> getAllUsers() {
        // Service layer se saare users fetch kar rahe hain
        return userService.getAllUsers();
    }

    /**
     * Get User by ID API
     * 
     * @GetMapping("/{id}"):
     * - Dynamic URL with path variable
     * - URL: GET http://localhost:8080/api/users/1
     * 
     * @PathVariable Long id:
     * - URL se id parameter extract karta hai
     * - Automatically Long type mein convert ho jata hai
     * 
     * @param id - User ka unique identifier
     * @return User object ya null if not found
     */
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        // Specific user ID se user fetch kar rahe hain
        return userService.getUserById(id);
    }

    /**
     * Create New User API
     * 
     * @PostMapping:
     * - POST request handle karta hai (data creation ke liye)
     * - URL: POST http://localhost:8080/api/users
     * 
     * @RequestBody User user:
     * - Request body se JSON data extract karta hai
     * - Automatically User object mein convert ho jata hai
     * - Content-Type: application/json expected
     * 
     * @param user - New user data from request body
     * @return Created user with generated ID
     */
    @PostMapping
    public User createUser(@RequestBody User user) {
        // Service layer se new user create kar rahe hain
        return userService.createUser(user);
    }
}