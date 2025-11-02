# Dynamic Message - Spring Boot Project

## 📋 Description

This project demonstrates how to redirect dynamic messages from the application to an HTML page using Thymeleaf templating engine. The application passes a dynamic message from the controller to the view using Spring's Model.

## 🔧 Dependencies

Add the following dependencies:

- **Spring Web** - For web MVC functionality and REST controllers
- **Thymeleaf** - For HTML templating and dynamic content rendering

## 🏗️ Project Structure

```
DynamicMessage/
├── src/main/java/com/example/demo/
│   ├── DynamicMessageApplication.java  - Main application class
│   └── MessageController.java         - Controller with message routing
└── src/main/resources/
    └── templates/
        └── greet.html                 - Thymeleaf template for displaying message
```

## 🚀 Running the Project

1. Navigate to the project directory:
   ```bash
   cd DynamicMessage
   ```

2. Run the application:
   ```bash
   mvn spring-boot:run
   ```

3. Open your browser and navigate to:
   ```
   http://localhost:8080/greet
   ```

## 🎯 Usage

When you access `/greet`, the controller adds a dynamic message ("Welcome to kodnest") to the model, which is then displayed in the `greet.html` template using Thymeleaf's `${msg1}` expression.

## 📡 API Endpoints

- **GET /greet** - Displays the greeting page with a dynamic message

## 💡 Key Features

- Dynamic content rendering using Thymeleaf
- Model attribute passing from controller to view
- Clean separation between controller and view layers

## 🔍 What You'll Learn

- How to pass data from controller to view using Model
- Using Thymeleaf expressions to display dynamic content
- Creating simple web pages with Spring Boot and Thymeleaf
