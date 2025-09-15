# 🧪 API Testing Guide

## 📋 Overview

Is guide mein humne saare APIs ko test karne ke different methods explain kiye hain. Beginners ke liye step-by-step instructions diye gaye hain.

## 🚀 Starting the Application

Pehle application start karo:

```bash
# Method 1: Maven Wrapper (Recommended)
./mvnw spring-boot:run

# Method 2: Maven (if installed)
mvn spring-boot:run

# Method 3: IDE se run karo
# MyFirstProjectApplication.java file open karo aur Run button press karo
```

**Success Message:**
```
🚀 Spring Boot Application Successfully Started!
📍 Server running on: http://localhost:8080
🔗 Try: http://localhost:8080/hello
```

## 🌐 Testing Methods

### 1. Browser Testing (Sabse Easy)

Browser mein directly URL type karo:

```
http://localhost:8080/hello
http://localhost:8080/hello/YourName
http://localhost:8080/api/users
http://localhost:8080/api/users/1
```

**Note:** Browser sirf GET requests kar sakta hai, POST requests ke liye Postman ya curl use karo.

### 2. Postman Testing (Recommended)

#### Setup:
1. Postman download karo: https://www.postman.com/downloads/
2. Install karo aur open karo
3. New Collection banao: "Spring Boot APIs"

#### Test Cases:

**1. Hello World API**
```
Method: GET
URL: http://localhost:8080/hello
Expected Response: "Hello Abhinav! Tumhara pehla API ready hai!"
```

**2. Dynamic Hello API**
```
Method: GET
URL: http://localhost:8080/hello/Raam
Expected Response: "Hello Raam! Kaise ho?"
```

**3. Get All Users**
```
Method: GET
URL: http://localhost:8080/api/users
Expected Response: 
[
  {
    "id": 1,
    "name": "Raam",
    "email": "raam@example.com"
  },
  {
    "id": 2,
    "name": "Shyam", 
    "email": "shyam@example.com"
  },
  {
    "id": 3,
    "name": "Abhinav",
    "email": "abhinav@example.com"
  }
]
```

**4. Get User by ID**
```
Method: GET
URL: http://localhost:8080/api/users/1
Expected Response:
{
  "id": 1,
  "name": "Raam",
  "email": "raam@example.com"
}
```

**5. Create New User**
```
Method: POST
URL: http://localhost:8080/api/users
Headers: 
  Content-Type: application/json
Body (raw JSON):
{
  "name": "Naya User",
  "email": "naya@example.com"
}

Expected Response:
{
  "id": 4,
  "name": "Naya User",
  "email": "naya@example.com"
}
```

### 3. cURL Testing (Command Line)

Terminal/Command Prompt mein ye commands run karo:

**1. Hello APIs:**
```bash
# Simple Hello
curl http://localhost:8080/hello

# Dynamic Hello
curl http://localhost:8080/hello/Abhinav
```

**2. User APIs:**
```bash
# Get All Users
curl -X GET http://localhost:8080/api/users

# Get User by ID
curl -X GET http://localhost:8080/api/users/1

# Create New User
curl -X POST http://localhost:8080/api/users \
  -H "Content-Type: application/json" \
  -d '{
    "name": "Curl User",
    "email": "curl@example.com"
  }'
```

### 4. VS Code REST Client Extension

VS Code mein REST Client extension install karo aur `.http` file banao:

**api-tests.http:**
```http
### Hello World API
GET http://localhost:8080/hello

### Dynamic Hello API  
GET http://localhost:8080/hello/Abhinav

### Get All Users
GET http://localhost:8080/api/users

### Get User by ID
GET http://localhost:8080/api/users/1

### Create New User
POST http://localhost:8080/api/users
Content-Type: application/json

{
  "name": "REST Client User",
  "email": "rest@example.com"
}
```

## 🔍 Expected Responses

### Success Responses:

**Hello APIs:**
- Status Code: `200 OK`
- Content-Type: `text/plain`
- Body: String message

**User APIs:**
- Status Code: `200 OK` (GET), `200 OK` (POST)
- Content-Type: `application/json`
- Body: JSON object/array

### Error Scenarios:

**User Not Found:**
```
GET http://localhost:8080/api/users/999
Response: null (or 404 in future)
```

**Invalid JSON:**
```
POST http://localhost:8080/api/users
Body: { invalid json }
Response: 400 Bad Request
```

## 🐛 Troubleshooting

### Common Issues:

**1. Connection Refused**
```
Error: Connection refused
Solution: Application start nahi hui hai, pehle start karo
```

**2. Port Already in Use**
```
Error: Port 8080 is already in use
Solution: 
- Dusra application band karo jo port 8080 use kar raha hai
- Ya application.properties mein port change karo: server.port=8081
```

**3. 404 Not Found**
```
Error: 404 Not Found
Solution: URL check karo, spelling mistakes ho sakte hain
```

**4. 400 Bad Request**
```
Error: 400 Bad Request (POST requests mein)
Solution: 
- JSON format check karo
- Content-Type header add karo
- Request body valid hai ya nahi check karo
```

## 📊 Testing Checklist

### ✅ Basic Testing:
- [ ] Application successfully start ho rahi hai
- [ ] Hello API working hai
- [ ] Dynamic Hello API working hai
- [ ] Get All Users API working hai
- [ ] Get User by ID API working hai
- [ ] Create User API working hai

### ✅ Advanced Testing:
- [ ] Invalid user ID test kiya
- [ ] Empty request body test kiya
- [ ] Invalid JSON format test kiya
- [ ] Large user name test kiya
- [ ] Special characters in name test kiye

### ✅ Performance Testing:
- [ ] Multiple requests quickly send kiye
- [ ] Response time check kiya
- [ ] Memory usage monitor kiya

## 🎯 Next Steps

1. **Error Handling Add Karo:**
   - Custom exception classes
   - Global exception handler
   - Proper HTTP status codes

2. **Validation Add Karo:**
   - Input validation
   - Email format validation
   - Required field validation

3. **Database Integration:**
   - H2 database add karo
   - JPA entities banao
   - Real CRUD operations

4. **Security Add Karo:**
   - Authentication
   - Authorization
   - CORS configuration

## 📞 Help & Support

Agar koi issue aa rahi hai to:

1. **Console Logs Check Karo:** Application ke logs mein error messages dekho
2. **Network Tab Check Karo:** Browser ke developer tools mein network requests dekho
3. **Postman Console Check Karo:** Request/response details dekho
4. **Stack Overflow Search Karo:** Similar issues ke solutions dekho

---

**Happy Testing! 🎉**

> "Testing is not about finding bugs, it's about building confidence in your code!" 🚀