package com.SpringBoot.MyFirstProject.model;

/**
 * User Model Class - Data Transfer Object (DTO)
 * 
 * Purpose:
 * - User ki information store karne ke liye
 * - Database table ka representation (future mein JPA ke saath)
 * - JSON serialization/deserialization ke liye
 * 
 * POJO (Plain Old Java Object):
 * - Simple Java class with private fields
 * - Public getters and setters
 * - Default constructor
 * - Parameterized constructor
 */
public class User {
    
    // Private fields - Encapsulation ke liye
    private Long id;        // Unique identifier for user
    private String name;    // User ka naam
    private String email;   // User ka email address

    /**
     * Default Constructor
     * 
     * Purpose:
     * - Object creation ke liye
     * - JSON deserialization ke liye required
     * - Spring Boot automatically use karta hai
     */
    public User() {
        // Empty constructor - Spring Boot requirement
    }

    /**
     * Parameterized Constructor
     * 
     * Purpose:
     * - Object creation with initial values
     * - Testing aur data initialization ke liye useful
     * 
     * @param id - User ka unique ID
     * @param name - User ka naam
     * @param email - User ka email
     */
    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getter and Setter Methods
    // JSON serialization/deserialization ke liye required
    
    /**
     * ID Getter - ID retrieve karne ke liye
     * @return User ka unique ID
     */
    public Long getId() { 
        return id; 
    }
    
    /**
     * ID Setter - ID set karne ke liye
     * @param id - New ID value
     */
    public void setId(Long id) { 
        this.id = id; 
    }

    /**
     * Name Getter - Name retrieve karne ke liye
     * @return User ka naam
     */
    public String getName() { 
        return name; 
    }
    
    /**
     * Name Setter - Name set karne ke liye
     * @param name - New name value
     */
    public void setName(String name) { 
        this.name = name; 
    }

    /**
     * Email Getter - Email retrieve karne ke liye
     * @return User ka email
     */
    public String getEmail() { 
        return email; 
    }
    
    /**
     * Email Setter - Email set karne ke liye
     * @param email - New email value
     */
    public void setEmail(String email) { 
        this.email = email; 
    }
    
    /**
     * toString Method - Object ko string representation mein convert karta hai
     * Debugging aur logging ke liye useful
     * 
     * @return String representation of User object
     */
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}