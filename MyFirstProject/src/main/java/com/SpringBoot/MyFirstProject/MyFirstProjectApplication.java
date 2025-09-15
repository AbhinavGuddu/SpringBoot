package com.SpringBoot.MyFirstProject;

// Spring Boot ke core classes import kar rahe hain
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * MyFirstProjectApplication - Ye humara main application class hai
 * 
 * @SpringBootApplication annotation:
 * - Ye 3 annotations ka combination hai:
 *   1. @Configuration - Configuration class banata hai
 *   2. @EnableAutoConfiguration - Auto-configuration enable karta hai
 *   3. @ComponentScan - Components scan karta hai
 * 
 * @ComponentScan:
 * - Specified package mein components dhundta hai
 * - Controllers, Services, Repositories ko automatically detect karta hai
 * - Base package: "com.SpringBoot.MyFirstProject"
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.SpringBoot.MyFirstProject")
public class MyFirstProjectApplication {

	/**
	 * Main method - Application ka entry point
	 * 
	 * SpringApplication.run():
	 * - Spring Boot application start karta hai
	 * - Embedded Tomcat server launch karta hai
	 * - Default port: 8080
	 * - Auto-configuration setup karta hai
	 * 
	 * @param args - Command line arguments
	 */
	public static void main(String[] args) {
		// Spring Boot application start kar rahe hain
		SpringApplication.run(MyFirstProjectApplication.class, args);
		
		// Console mein confirmation message
		System.out.println("🚀 Spring Boot Application Successfully Started!");
		System.out.println("📍 Server running on: http://localhost:8080");
		System.out.println("🔗 Try: http://localhost:8080/hello");
	}
}
