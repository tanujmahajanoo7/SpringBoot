# RedirectPage - Spring Boot Web Application

A Spring Boot application demonstrating page redirection functionality using Thymeleaf templates.

## 📋 Description

This project shows how to implement page redirection in a Spring Boot web application. When a specific endpoint is accessed, the application redirects to a welcome page rendered using Thymeleaf.

## 🔧 Dependencies

- **Spring Web** - For web MVC functionality
- **Thymeleaf** - For HTML templating

## 🏗️ Project Structure

```
RedirectPage/
├── src/main/java/com/example/demo/
│   ├── RedirectPageApplication.java  - Main application class
│   └── SendController.java          - Controller handling redirection
└── src/main/resources/
    └── templates/
        └── welcome.html              - Welcome page template
```

## 🚀 Running the Project

1. Navigate to the project directory:
   ```bash
   cd RedirectPage
   ```

2. Run the application:
   ```bash
   mvn spring-boot:run
   ```

3. Open your browser and navigate to:
   ```
   http://localhost:8080/getpage
   ```

## 📡 API Endpoints

- **GET /getpage** - Redirects to the welcome page
  - Example: `GET http://localhost:8080/getpage`
  - Returns: `welcome.html` template

## 💡 Key Features

- Page redirection using Spring MVC
- Thymeleaf template rendering
- Simple routing mechanism

## 🔍 What You'll Learn

- Using `@RequestMapping` for URL mapping
- Returning view names from controllers
- Thymeleaf template integration
- Basic web page routing in Spring Boot

## 📝 Additional Files

- Check `dependencies.md` for detailed dependency information
- Refer to `a.html` if present for additional HTML examples

## 📝 Example Usage

### Using Browser
Navigate to: `http://localhost:8080/getpage`

### Using cURL
```bash
curl http://localhost:8080/getpage
```

---

**Note**: The application will display the welcome page when you access the `/getpage` endpoint. Make sure the `welcome.html` template exists in the templates folder.

