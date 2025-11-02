# Security - Spring Boot Security Projects

This folder contains various Spring Boot projects demonstrating different security concepts and implementations using Spring Security.

## 📁 Projects

### 1. SpringSecureOne
Basic Spring Security implementation with default configuration. Demonstrates how Spring Security works out of the box.

### 2. SpringSecureTwo
Advanced Spring Security configuration with custom security settings, including:
- Custom SecurityFilterChain
- In-memory user authentication
- Password encoding
- Role-based access control
- Public and protected endpoints

### 3. RoleBasedLoginApp
Role-based authentication system that supports different user roles (ADMIN and CUSTOMER) with different access levels.

### 4. OtpBasedAuthentication
Two-factor authentication (2FA) system using One-Time Password (OTP) verification. Demonstrates:
- Username/password authentication
- OTP generation and validation
- Multi-step authentication flow

## 🔧 Common Dependencies

All security projects use:
- **Spring Boot Starter Security** - Core Spring Security functionality
- **Spring Web** - For web endpoints
- **Thymeleaf** (in some projects) - For HTML templates

## 🚀 Getting Started

Navigate to any project directory and run:
```bash
mvn spring-boot:run
```

## 🔐 Security Concepts Covered

1. **Basic Authentication** - Default Spring Security setup
2. **Custom Security Configuration** - Configuring SecurityFilterChain
3. **User Management** - In-memory user storage
4. **Password Encoding** - Using BCryptPasswordEncoder
5. **Role-Based Access Control (RBAC)** - Different access levels based on roles
6. **Two-Factor Authentication (2FA)** - OTP-based verification

## 📖 Individual Project Documentation

Each project has its own README.md file with detailed information about:
- Specific security features implemented
- Configuration details
- Endpoints and access requirements
- Default credentials (if applicable)
- Usage examples

## ⚠️ Important Notes

- These are learning projects and should not be used in production without proper security hardening
- Default credentials are provided for testing purposes only
- Always change default passwords in production environments
- Implement proper password policies and security measures

---

For detailed information about each security project, please refer to the individual README files in each project directory.

