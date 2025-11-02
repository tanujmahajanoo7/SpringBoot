# ServiceSpring - Spring Boot Web Application

A Spring Boot web application demonstrating service layer implementation with message building and Thymeleaf templating.

## 📋 Description

This project demonstrates the use of a service layer in Spring Boot web applications. It includes a greeting system where users can enter their name, and the service builds a personalized message that is displayed using Thymeleaf templates.

## 🔧 Dependencies

- **Spring Web** - For web MVC functionality
- **Thymeleaf** - For HTML templating

## 🏗️ Project Structure

```
ServiceSpring/
├── src/main/java/com/example/demo/
│   ├── ServiceSpringApplication.java  - Main application class
│   ├── GreetController.java         - Web controller
│   └── MessageService.java          - Service layer for message building
└── src/main/resources/
    └── templates/
        ├── home.html                - Input form
        └── greet.html               - Greeting display page
```

## 🚀 Running the Project

1. Navigate to the project directory:
   ```bash
   cd ServiceSpring
   ```

2. Run the application:
   ```bash
   mvn spring-boot:run
   ```

3. Open your browser and navigate to:
   ```
   http://localhost:8080
   ```

## 🎯 Usage

1. Access the home page at `http://localhost:8080`
2. Enter your name in the form
3. Submit the form
4. View the personalized greeting message

## 📡 API Endpoints

- **GET /** - Displays the home page with input form
- **POST /greet** - Processes the form submission and displays greeting
  - Parameter: `un` (username/name)

## 💡 Key Features

- Service layer pattern implementation
- Form handling with `@RequestParam`
- Dependency injection of services using `@Autowired`
- Model attribute passing to views
- Thymeleaf template integration

## 🔍 What You'll Learn

- Creating and using service classes in Spring Boot
- Building service layer architecture
- Handling form submissions with POST requests
- Using `@RequestParam` to extract form data
- Passing data from controller to view using Model
- Best practices for separating business logic into services

## 📝 Code Structure

- **Controller**: Handles HTTP requests and responses
- **Service**: Contains business logic (message building)
- **Templates**: View layer for displaying content

---

**Note**: The service layer handles the business logic of building personalized messages, while the controller focuses on handling HTTP requests and responses.

