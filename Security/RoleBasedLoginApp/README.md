# Role Based Login App - Spring Boot Security Project

A Spring Boot application implementing role-based authentication where different users have different access levels based on their roles (ADMIN or CUSTOMER).

## 📋 Description

This project demonstrates role-based access control (RBAC) where:
- **ADMIN** users access an admin page
- **CUSTOMER** users access a customer page
- Invalid credentials are rejected

The authentication is handled via REST API endpoints that accept username and password parameters.

## 🔧 Dependencies

- **Spring Boot Starter Security** - For security functionality
- **Spring Web** - For REST API endpoints
- **Spring Boot Starter Data JPA** (if using database) - For database operations

## 🏗️ Project Structure

```
RoleBasedLoginApp/
├── src/main/java/com/example/demo/
│   ├── RoleBasedLoginAppApplication.java  - Main application class
│   ├── controller/
│   │   └── Usercontroller.java         - Authentication controller
│   ├── service/
│   │   ├── UserServiceInterface.java   - Service interface
│   │   └── UserService.java            - Service implementation
│   ├── repository/
│   │   └── UserRepository.java        - User repository
│   └── entity/
│       └── User.java                  - User entity with role
```

## 🚀 Running the Project

1. Navigate to the project directory:
   ```bash
   cd Security/RoleBasedLoginApp
   ```

2. Set up the database (check `db.md` for database configuration)

3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

4. The API will be available at:
   ```
   http://localhost:8080
   ```

## 📡 API Endpoints

- **POST /userapi/login** - Authenticate user and return role-based response
  - Parameters: `username`, `password`
  - Response:
    - "This is admin page" - for ADMIN users
    - "This is customer page" - for CUSTOMER users
    - "Invalid credentials" - for invalid login

## 🎯 Usage Example

### Using cURL

**Admin Login:**
```bash
curl -X POST "http://localhost:8080/userapi/login" \
  -d "username=admin&password=admin123"
```

**Customer Login:**
```bash
curl -X POST "http://localhost:8080/userapi/login" \
  -d "username=customer&password=customer123"
```

### Using Postman

1. Set method to POST
2. URL: `http://localhost:8080/userapi/login`
3. Body: `x-www-form-urlencoded`
4. Add parameters:
   - `username`: your username
   - `password`: your password
5. Send request

## 💡 Key Features

- Role-based authentication
- Different responses based on user roles
- Password validation
- REST API implementation
- User repository pattern

## 🔍 What You'll Learn

- Implementing role-based access control
- User authentication in Spring Boot
- Role checking and authorization
- REST API security
- Service layer patterns

## 🗄️ Database Setup

Check the `db.md` file in the project directory for:
- Database schema
- User table structure
- Sample data setup
- Role assignment instructions

## ⚠️ Security Notes

- Passwords should be encrypted in production
- Use proper password hashing (BCrypt, etc.)
- Implement session management
- Consider using JWT tokens for stateless authentication
- Add rate limiting for login attempts

---

**Note**: This is a learning project. For production use, implement proper password encryption, session management, and additional security measures.

