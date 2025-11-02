# Postmantest - Spring Boot REST API

A simple REST API endpoint designed for testing with Postman, demonstrating basic REST controller functionality.

## 📋 Description

This minimal project provides a simple REST endpoint that returns a greeting message. It's perfect for testing API tools like Postman or learning the basics of REST controllers in Spring Boot.

## 🔧 Dependencies

- **Spring Web** - For REST API functionality
- **Spring Boot Starter** - Core Spring Boot features

## 🏗️ Project Structure

```
Postmantest/
├── src/main/java/com/example/demo/
│   ├── PostmantestApplication.java  - Main application class
│   └── Demo.java                    - REST controller
```

## 🚀 Running the Project

1. Navigate to the project directory:
   ```bash
   cd Postmantest
   ```

2. Run the application:
   ```bash
   mvn spring-boot:run
   ```

3. The API will be available at:
   ```
   http://localhost:8080
   ```

## 📡 API Endpoints

- **GET /** - Returns a greeting message
  - Response: `"hello"` (plain text)

## 🎯 Testing with Postman

1. Open Postman
2. Create a new GET request
3. Enter URL: `http://localhost:8080`
4. Send the request
5. You should receive `"hello"` as the response

## 💡 Key Features

- Simple REST endpoint
- Uses `@Controller` with `@ResponseBody`
- Minimal configuration
- Perfect for API testing

## 🔍 What You'll Learn

- Creating a basic REST endpoint
- Using `@Controller` annotation
- Using `@GetMapping` for GET requests
- Returning plain text responses with `@ResponseBody`
- Testing REST APIs with Postman

## 📝 Example Usage

### Using cURL
```bash
curl http://localhost:8080
```

### Using Browser
Simply navigate to: `http://localhost:8080`

---

**Note**: This is a minimal example project designed specifically for learning and testing purposes.

