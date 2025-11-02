# EmployeeRest - Spring Boot REST API

A comprehensive REST API application for employee management built with Spring Boot, featuring a complete service layer implementation.

## 📋 Description

This project provides a full-featured REST API for managing employees. It includes separate service layers for Employee and Student operations, demonstrating proper separation of concerns and service layer patterns in Spring Boot.

## 🔧 Dependencies

- **Spring Web** - For REST API functionality
- **Spring Boot Starter** - Core Spring Boot features

## 🏗️ Project Structure

```
EmployeeRest/
├── src/main/java/com/example/demo/
│   ├── EmployeeRestApplication.java         - Main application class
│   ├── controller/                         - REST controllers (if any)
│   ├── service/
│   │   ├── EmployeeService.java            - Employee service interface
│   │   ├── EmployeeServiceImplementation.java - Employee service implementation
│   │   ├── StudentService.java             - Student service interface
│   │   └── StudentServiceImplementation.java - Student service implementation
│   ├── entity/                             - Entity classes
│   └── repository/                         - Repository interfaces (if any)
```

## 🚀 Running the Project

1. Navigate to the project directory:
   ```bash
   cd EmployeeRest
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

The application provides REST endpoints for employee operations. Refer to the controller classes for specific endpoint mappings.

### Service Methods Available

**EmployeeService Interface:**
- `createEmployee(Employee employee)` - Create a new employee
- `fetchAllEmployees()` - Get all employees
- `fetchEmployeeById(int id)` - Get employee by ID
- `updateEmployee(Employee employee)` - Update employee details
- `deleteEmployee(int id)` - Delete an employee

## 💡 Key Features

- Complete CRUD operations for employees
- Service layer pattern implementation
- Interface-based service design
- Proper separation of concerns

## 🔍 What You'll Learn

- Building REST APIs with Spring Boot
- Implementing service layer patterns
- Creating service interfaces and implementations
- Managing entity operations through services

## 📝 Notes

- This project demonstrates a multi-service architecture
- Both Employee and Student services are implemented
- The project follows Spring Boot best practices for service layer design

---

**Note**: Check the controller classes to see the actual REST endpoint mappings and request/response formats.

