# FirstRest - Spring Boot REST API

A basic REST API application for employee management, demonstrating fundamental REST concepts in Spring Boot.

## 📋 Description

This project implements a simple REST API for employee operations. It demonstrates the basic structure of a RESTful service with controller, service, and repository layers.

## 🔧 Dependencies

- **Spring Web** - For REST API functionality
- **Spring Boot Starter** - Core Spring Boot features

## 🏗️ Project Structure

```
FirstRest/
├── src/main/java/com/example/demo/
│   ├── FirstRestApplication.java  - Main application class
│   ├── EmployeeController.java   - REST controller
│   ├── EmployeeService.java      - Service interface
│   ├── EmployeeRepository.java   - Repository interface
│   └── Employee.java             - Entity class
```

## 🚀 Running the Project

1. Navigate to the project directory:
   ```bash
   cd FirstRest
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

- **GET /employee/{id}** - Get employee by ID
  - Example: `GET http://localhost:8080/employee/1`
  
- **GET /employees** - Get all employees
  - Example: `GET http://localhost:8080/employees`

## 💡 Key Features

- RESTful API design
- Path variable handling (`@PathVariable`)
- Service layer integration
- Repository pattern usage
- JSON response handling

## 🔍 What You'll Learn

- Creating REST controllers with `@RestController`
- Using `@GetMapping` for GET requests
- Handling path variables with `@PathVariable`
- Dependency injection with `@Autowired`
- Basic REST API structure

## 📝 Example Usage

### Get Employee by ID
```bash
curl http://localhost:8080/employee/1
```

### Get All Employees
```bash
curl http://localhost:8080/employees
```

## 🗄️ Database

Check `db.md` file in the project directory for database setup instructions if the project uses a database.

---

**Note**: This is a basic REST API implementation. The actual data source (in-memory or database) depends on the repository implementation.

