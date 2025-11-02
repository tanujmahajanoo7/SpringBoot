# OTP Based Authentication - Spring Boot Security Project

A Spring Boot application implementing Two-Factor Authentication (2FA) using One-Time Password (OTP) verification.

## 📋 Description

This project demonstrates a multi-step authentication process:
1. User enters username and password
2. If credentials are valid, an OTP is generated and sent
3. User enters the OTP to complete authentication
4. Upon successful OTP verification, user gains access to the dashboard

## 🔧 Dependencies

- **Spring Boot Starter Security** - For security functionality
- **Spring Web** - For web MVC
- **Thymeleaf** - For HTML templating
- **Spring Boot Starter Data JPA** (if using database) - For database operations

## 🏗️ Project Structure

```
OtpBasedAuthentication/
├── src/main/java/com/example/demo/
│   ├── OtpBasedAuthenticationApplication.java  - Main application class
│   ├── controller/
│   │   └── UserController.java               - Authentication controller
│   ├── service/
│   │   ├── UserService.java                  - Service interface
│   │   └── UserServiceImplementation.java    - Service implementation with OTP logic
│   ├── repository/
│   │   ├── UserRepository.java              - User repository
│   │   └── TokenRepository.java            - OTP token repository
│   └── entity/
│       ├── User.java                        - User entity
│       └── Token.java                      - OTP token entity
└── src/main/resources/
    └── templates/
        ├── login.html                       - Login page
        ├── verify-otp.html                  - OTP verification page
        └── dashboard.html                   - Dashboard page
```

## 🚀 Running the Project

1. Navigate to the project directory:
   ```bash
   cd Security/OtpBasedAuthentication
   ```

2. Set up the database (check `db.md` for database configuration)

3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

4. Open your browser and navigate to:
   ```
   http://localhost:8080/api/
   ```

## 🎯 Authentication Flow

1. **Login Page** (`/api/`):
   - Enter username and password
   - Submit the form

2. **OTP Verification** (`/api/verify-otp`):
   - If credentials are valid, you'll be redirected here
   - Enter the OTP sent to your account
   - Verify the OTP

3. **Dashboard** (`/api/dashboard`):
   - Upon successful OTP verification, you'll see the dashboard

## 📡 API Endpoints

- **GET /api/** - Login page
- **POST /api/login** - Authenticate user and generate OTP
  - Parameters: `username`, `password`
- **POST /api/verify-otp** - Verify OTP and complete authentication
  - Parameter: `otp`

## 💡 Key Features

- Two-factor authentication (2FA)
- OTP generation and validation
- Token expiration handling
- User-friendly web interface
- Secure authentication flow

## 🔍 What You'll Learn

- Implementing 2FA in Spring Boot
- OTP generation and management
- Multi-step authentication flows
- Token-based verification
- Security best practices

## 🗄️ Database Setup

Check the `db.md` file in the project directory for database schema and setup instructions.

## ⚠️ Important Notes

- OTPs typically expire after a certain time (check the implementation for expiration logic)
- In a production environment, OTPs should be sent via email or SMS
- This example may use in-memory storage or a database - check the implementation
- Ensure proper error handling for invalid credentials and expired OTPs

---

**Note**: This is a learning project. In production, implement proper OTP delivery mechanisms (email/SMS) and secure token storage.

