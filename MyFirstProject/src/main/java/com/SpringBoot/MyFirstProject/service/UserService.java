package com.SpringBoot.MyFirstProject.service;

// Required imports
import com.SpringBoot.MyFirstProject.model.User;  // User model class
import org.springframework.stereotype.Service;     // Service annotation
import java.util.*;                               // Collections framework

/**
 * UserService - Business Logic Layer
 * 
 * @Service annotation:
 * - Ye class ko Spring Service component banata hai
 * - Business logic handle karta hai
 * - Controller aur Data layer ke beech bridge ka kaam karta hai
 * - Spring container mein automatically register ho jata hai
 * 
 * Purpose:
 * - User related business operations
 * - Data manipulation and validation
 * - Future mein database operations add kar sakte hain
 */
@Service
public class UserService {
    
    // In-memory data storage (Database ki jagah temporarily)
    private List<User> users = new ArrayList<>();
    
    // Auto-increment ID generator
    private Long nextId = 1L;

    /**
     * Constructor - Service initialization
     * 
     * Purpose:
     * - Service create hone pe automatically call hota hai
     * - Sample data initialize karta hai
     * - Testing ke liye dummy users add karta hai
     */
    public UserService() {
        // Sample users add kar rahe hain for testing
        users.add(new User(nextId++, "Raam", "raam@example.com"));
        users.add(new User(nextId++, "Shyam", "shyam@example.com"));
        users.add(new User(nextId++, "Abhinav", "abhinav@example.com"));
        
        System.out.println("💾 UserService initialized with " + users.size() + " sample users");
    }

    /**
     * Get All Users - Saare users return karta hai
     * 
     * Business Logic:
     * - Currently in-memory list return kar raha hai
     * - Future mein database query ho sakti hai
     * - Pagination aur filtering add kar sakte hain
     * 
     * @return List<User> - Saare users ka list
     */
    public List<User> getAllUsers() {
        System.out.println("📋 Fetching all users. Total count: " + users.size());
        return users;
    }

    /**
     * Get User by ID - Specific user ID se user dhundta hai
     * 
     * Java 8 Stream API use kar rahe hain:
     * - users.stream() - List ko stream mein convert karta hai
     * - .filter() - Condition ke basis pe filter karta hai
     * - .findFirst() - Pehla match return karta hai
     * - .orElse(null) - Agar nahi mila to null return karta hai
     * 
     * @param id - User ka unique identifier
     * @return User object ya null if not found
     */
    public User getUserById(Long id) {
        System.out.println("🔍 Searching for user with ID: " + id);
        
        User foundUser = users.stream()
                .filter(user -> user.getId().equals(id))  // ID match karta hai?
                .findFirst()                              // Pehla match le lo
                .orElse(null);                           // Nahi mila to null
        
        if (foundUser != null) {
            System.out.println("✅ User found: " + foundUser.getName());
        } else {
            System.out.println("❌ User not found with ID: " + id);
        }
        
        return foundUser;
    }

    /**
     * Create New User - Naya user create karta hai
     * 
     * Business Logic:
     * - Auto-increment ID assign karta hai
     * - User ko list mein add karta hai
     * - Created user return karta hai
     * 
     * Future Enhancements:
     * - Email validation add kar sakte hain
     * - Duplicate email check kar sakte hain
     * - Database mein save kar sakte hain
     * 
     * @param user - New user data (without ID)
     * @return Created user with generated ID
     */
    public User createUser(User user) {
        // Auto-increment ID assign kar rahe hain
        user.setId(nextId++);
        
        // User ko list mein add kar rahe hain
        users.add(user);
        
        System.out.println("✨ New user created: " + user.getName() + " with ID: " + user.getId());
        System.out.println("📊 Total users now: " + users.size());
        
        return user;
    }
    
    /**
     * Get Total User Count - Debugging ke liye
     * 
     * @return Total number of users
     */
    public int getTotalUsers() {
        return users.size();
    }
}