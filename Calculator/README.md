# Calculator - Spring Boot Web Application

A web-based calculator application built with Spring Boot and Thymeleaf that performs basic arithmetic operations.

## 📋 Description

This project provides a simple web-based calculator interface where users can perform:
- Addition
- Subtraction
- Multiplication
- Division
- Remainder (Modulo) operations

The application uses Spring MVC for handling web requests and Thymeleaf for rendering HTML templates.

## 🔧 Dependencies

- **Spring Web** - For web MVC functionality
- **Thymeleaf** - For HTML templating
- **Spring Boot DevTools** - For development convenience

## 🏗️ Project Structure

```
Calculator/
├── src/main/java/com/example/demo/
│   ├── CalculatorApplication.java  - Main application class
│   ├── CalciController.java        - Web controller
│   └── CalciService.java           - Service layer for calculations
└── src/main/resources/
    └── templates/
        ├── home.html              - Calculator input form
        └── result.html            - Result display page
```

## 🚀 Running the Project

1. Navigate to the project directory:
   ```bash
   cd Calculator
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

1. Enter two numbers in the input fields
2. Click on any operation button (Addition, Subtraction, Multiplication, Division, or Remainder)
3. View the result on the result page

## 📡 API Endpoints

- **GET /** - Displays the calculator home page with input form
- **POST /calculate** - Performs the selected operation and displays the result

## 🔍 Features

- Clean, simple web interface
- Supports multiple arithmetic operations
- Error handling for invalid operations
- Separation of concerns (Controller, Service layers)

---

**Note**: The default port is 8080. If you need to change it, modify `application.properties`.

