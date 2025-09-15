package com.SpringBoot.MyFirstProject.controller;

// Spring Boot ke annotations import kar rahe hain
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController - Ye humara pehla REST Controller hai
 * 
 * @RestController annotation:
 * - Ye class ko REST API controller banata hai
 * - Automatically JSON response return karta hai
 * - @Controller + @ResponseBody ka combination hai
 * 
 * Purpose: Simple Hello World APIs banane ke liye
 */
@RestController
public class HelloController {

    /**
     * Simple Hello API
     * 
     * @GetMapping("/hello"):
     * - HTTP GET request handle karta hai
     * - URL: http://localhost:8080/hello
     * - Response: Plain text string
     * 
     * @return String message
     */
    @GetMapping("/hello")
    public String hello() {
        // Simple greeting message return kar rahe hain
        return "Hello Abhinav! Tumhara pehla API ready hai!";
    }

    /**
     * Dynamic Hello API with Path Variable
     * 
     * @GetMapping("/hello/{name}"):
     * - URL mein {name} ek path variable hai
     * - Example: http://localhost:8080/hello/Raam
     * 
     * @PathVariable String name:
     * - URL se name parameter extract karta hai
     * - Automatically method parameter mein pass ho jata hai
     * 
     * @param name - URL se aane wala name parameter
     * @return Personalized greeting message
     */
    @GetMapping("/hello/{name}")
    public String helloWithName(@PathVariable String name) {
        // Dynamic message with user's name
        return "Hello " + name + "! Kaise ho?";
    }
}