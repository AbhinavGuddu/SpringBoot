# 🚀 My First Spring Boot Project

## 📋 Project Overview

Ye humara pehla Spring Boot project hai jo REST APIs banane ke liye banaya gaya hai. Is project mein basic CRUD operations aur Spring Boot ke fundamentals sikhe gaye hain.

## 🛠️ Technologies Used

- **Java 17+** - Programming Language
- **Spring Boot 3.x** - Framework
- **Spring Web** - REST API development
- **Maven** - Build Tool
- **Embedded Tomcat** - Web Server

## 📁 Project Structure

```
MyFirstProject/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/SpringBoot/MyFirstProject/
│   │   │       ├── controller/          # REST Controllers
│   │   │       │   ├── HelloController.java
│   │   │       │   └── UserController.java
│   │   │       ├── model/               # Data Models
│   │   │       │   └── User.java
│   │   │       ├── service/             # Business Logic
│   │   │       │   └── UserService.java
│   │   │       └── MyFirstProjectApplication.java  # Main Class
│   │   └── resources/
│   │       └── application.properties   # Configuration
│   └── test/                           # Test Files
├── pom.xml                            # Maven Dependencies
└── README.md                          # Project Documentation
```

## 🎯 Features

### 1. Hello World API
- **URL**: `GET /hello`
- **Response**: Simple greeting message
- **Example**: `http://localhost:8080/hello`

### 2. Dynamic Hello API
- **URL**: `GET /hello/{name}`
- **Response**: Personalized greeting
- **Example**: `http://localhost:8080/hello/Abhinav`

### 3. User Management APIs
- **Get All Users**: `GET /api/users`
- **Get User by ID**: `GET /api/users/{id}`
- **Create User**: `POST /api/users`

## 🚀 How to Run

### Prerequisites
- Java 17 or higher installed
- Maven installed (optional - project has Maven wrapper)

### Steps to Run

1. **Clone the Repository**
   ```bash
   git clone https://github.com/AbhinavGuddu/SpringBoot.git
   cd SpringBoot/MyFirstProject
   ```

2. **Run the Application**
   ```bash
   # Using Maven Wrapper (Recommended)
   ./mvnw spring-boot:run
   
   # Or using Maven (if installed)
   mvn spring-boot:run
   ```

3. **Access the Application**
   - Server will start on: `http://localhost:8080`
   - Try the APIs using browser or Postman

## 🧪 Testing the APIs

### 1. Hello APIs (Browser mein test kar sakte hain)

```
GET http://localhost:8080/hello
Response: "Hello Abhinav! Tumhara pehla API ready hai!"

GET http://localhost:8080/hello/Raam
Response: "Hello Raam! Kaise ho?"
```

### 2. User APIs (Postman ya curl use karein)

**Get All Users:**
```bash
curl -X GET http://localhost:8080/api/users
```

**Get User by ID:**
```bash
curl -X GET http://localhost:8080/api/users/1
```

**Create New User:**
```bash
curl -X POST http://localhost:8080/api/users \\
  -H "Content-Type: application/json" \\
  -d '{
    "name": "Naya User",
    "email": "naya@example.com"
  }'
```

## 📚 Learning Points

### 1. Spring Boot Annotations
- `@SpringBootApplication` - Main application class
- `@RestController` - REST API controller
- `@Service` - Business logic layer
- `@GetMapping`, `@PostMapping` - HTTP method mapping
- `@PathVariable` - URL parameter extraction
- `@RequestBody` - JSON request body parsing
- `@Autowired` - Dependency injection

### 2. Project Architecture
- **Controller Layer** - HTTP requests handle karta hai
- **Service Layer** - Business logic contain karta hai
- **Model Layer** - Data structure define karta hai

### 3. REST API Concepts
- HTTP Methods (GET, POST, PUT, DELETE)
- Path Variables aur Request Parameters
- JSON Request/Response handling
- Status Codes aur Error Handling

## 🔧 Configuration

### application.properties
- Server port configuration
- Database settings (future use)
- Logging configuration
- Application-specific properties

## 🚀 Next Steps

1. **Database Integration**
   - H2 Database add karein
   - JPA/Hibernate use karein
   - Real database operations

2. **Advanced Features**
   - Input validation
   - Exception handling
   - Security (Spring Security)
   - Unit testing

3. **Deployment**
   - Docker containerization
   - Cloud deployment (AWS, Heroku)
   - CI/CD pipeline

## 🤝 Contributing

Agar koi improvements ya suggestions hain to feel free to contribute!

## 📞 Contact

- **Developer**: Abhinav
- **GitHub**: [AbhinavGuddu](https://github.com/AbhinavGuddu)
- **Project**: [SpringBoot Repository](https://github.com/AbhinavGuddu/SpringBoot)

---

**Happy Coding! 🎉**

> "Pehla kadam sabse mushkil hota hai, but tumne kar liya! Ab aage badho aur explore karo Spring Boot ki duniya!" 🚀