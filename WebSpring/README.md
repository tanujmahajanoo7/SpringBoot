# WebSpring - Spring Boot Web Application

A basic Spring Boot web application demonstrating simple web controllers with `@ResponseBody` annotations for returning plain text responses.

## 📋 Description

This project provides multiple web endpoints that return plain text responses. It demonstrates the use of `@Controller` with `@ResponseBody` annotations to create simple REST-like endpoints without using `@RestController`.

## 🔧 Dependencies

- **Spring Web** - For web MVC functionality
- **Spring Boot Starter** - Core Spring Boot features

## 🏗️ Project Structure

```
WebSpring/
├── src/main/java/com/example/demo/
│   ├── WebSpringApplication.java  - Main application class
│   ├── Greet.java                - Controller with multiple endpoints
│   └── Second.java               - Additional controller
```

## 🚀 Running the Project

1. Navigate to the project directory:
   ```bash
   cd WebSpring
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

- **GET /** - Returns "Welcome to this project"
- **GET /greet** - Returns "Hello....."
- **GET /bye** - Returns "Bye bye ..."
- **GET /getsup** - Returns "Hola surprise...."

## 💡 Key Features

- Multiple controllers in the same application
- Using `@Controller` with `@ResponseBody`
- Simple text responses
- Multiple endpoint routing

## 🔍 What You'll Learn

- Creating web controllers with `@Controller`
- Using `@RequestMapping` for URL mapping
- Returning plain text with `@ResponseBody`
- Having multiple controllers in one application
- Difference between `@Controller` + `@ResponseBody` vs `@RestController`

## 📝 Example Usage

### Using Browser
Navigate to:
- `http://localhost:8080` - Welcome message
- `http://localhost:8080/greet` - Greeting
- `http://localhost:8080/bye` - Farewell
- `http://localhost:8080/getsup` - Surprise message

### Using cURL
```bash
curl http://localhost:8080
curl http://localhost:8080/greet
curl http://localhost:8080/bye
curl http://localhost:8080/getsup
```

## 🆚 @Controller + @ResponseBody vs @RestController

This project uses `@Controller` with `@ResponseBody` on each method. This is equivalent to using `@RestController` at the class level, which automatically adds `@ResponseBody` to all methods.

---

**Note**: All endpoints return plain text responses. This is a simple example for learning basic web routing in Spring Boot.

