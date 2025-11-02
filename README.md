# Spring Boot Learning Projects

This repository contains a collection of Spring Boot learning projects and examples. Each project demonstrates different Spring Boot concepts, from basic dependency injection to REST APIs and security implementations.

## 📁 Repository Structure

```
.
├── SpringBoot/
│   ├── AllTypeInjection/       - Demonstrates different types of dependency injection
│   ├── Calculator/             - Web-based calculator application
│   ├── DynamicMessage/         - Dynamic message routing with Thymeleaf
│   ├── EmployeeRest/           - REST API for employee management
│   ├── FirstRest/              - Basic REST API implementation
│   ├── Postmantest/            - Simple REST endpoint for testing
│   ├── RedirectPage/           - Page redirection example
│   ├── Security/               - Security-related projects
│   │   ├── OtpBasedAuthentication/  - OTP-based authentication system
│   │   ├── RoleBasedLoginApp/      - Role-based login system
│   │   ├── SpringSecureOne/        - Basic Spring Security example
│   │   └── SpringSecureTwo/        - Advanced Spring Security configuration
│   ├── ServiceSpring/          - Service layer implementation
│   ├── Useof_Primary/          - @Primary annotation demonstration
│   └── WebSpring/              - Basic web controllers
```

## 🚀 Getting Started

### Prerequisites

- Java JDK 8 or higher
- Maven 3.6 or higher
- IDE (IntelliJ IDEA, Eclipse, or VS Code)

### Running a Project

1. Navigate to the desired project directory:
   ```bash
   cd SpringBoot/[ProjectName]
   ```

2. Build the project:
   ```bash
   mvn clean install
   ```

3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

## 📁 Projects

### Core Concepts
- **AllTypeInjection** - Demonstrates different types of dependency injection (field, setter, constructor)
- **Useof_Primary** - Shows how to use @Primary annotation to resolve multiple bean implementations

### Web Development
- **Calculator** - Web-based calculator application with Thymeleaf templates
- **DynamicMessage** - Dynamic message routing and display using Thymeleaf
- **WebSpring** - Basic web controllers with @ResponseBody annotations
- **RedirectPage** - Page redirection examples
- **ServiceSpring** - Service layer implementation with message building

### REST APIs
- **FirstRest** - Basic REST API implementation for employee management
- **EmployeeRest** - Advanced REST API with service layer for employee operations
- **Postmantest** - Simple REST endpoint for testing with Postman

### Security
- **Security/** - Folder containing security-related projects
  - **OtpBasedAuthentication** - OTP-based two-factor authentication system
  - **RoleBasedLoginApp** - Role-based access control (ADMIN/CUSTOMER roles)
  - **SpringSecureOne** - Basic Spring Security setup
  - **SpringSecureTwo** - Advanced Spring Security with custom configuration

## 📚 Projects Overview

Each project in this repository focuses on different Spring Boot concepts:

- **Dependency Injection**: Learn about field, setter, and constructor injection
- **Web Development**: Explore Spring MVC, Thymeleaf templates, and REST APIs
- **Security**: Understand Spring Security configurations and authentication mechanisms
- **Services**: Implement service layer patterns in Spring Boot

## 📋 Common Dependencies

Most projects use:
- **Spring Boot Starter Web** - For web development
- **Thymeleaf** - For templating (in web projects)
- **Spring Boot DevTools** - For development convenience
- **Spring Boot Starter Security** - For security projects

## 🔧 Technologies Used

- Spring Boot
- Spring MVC
- Spring Security
- Thymeleaf
- Maven
- Java

## 📖 Individual Project Documentation

Each project has its own README.md file with:
- Project description
- Required dependencies
- How to run the project
- API endpoints (for REST projects)
- Usage examples

Please refer to individual project README files for detailed information.

## 📝 Notes

- Each project is independent and can be run separately
- Some projects require specific dependencies mentioned in their respective README files
- Database configuration may be required for some projects (check individual project documentation)

---

For detailed information about each project, please refer to the README files in the respective project directories.
