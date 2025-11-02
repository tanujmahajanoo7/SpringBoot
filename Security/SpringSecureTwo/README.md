# SpringSecureTwo - Advanced Spring Security Configuration

An advanced Spring Boot application demonstrating custom Spring Security configuration with user-defined authentication, authorization rules, and security settings.

## 📋 Description

This project shows how to customize Spring Security beyond the default configuration. It includes:
- Custom SecurityFilterChain configuration
- In-memory user management with roles
- Password encoding using BCrypt
- Public and protected endpoints
- Role-based access control

## 🔧 Dependencies

- **Spring Boot Starter Security** - Core Spring Security functionality
- **Spring Web** - For web endpoints

## 🏗️ Project Structure

```
SpringSecureTwo/
├── src/main/java/com/example/demo/
│   ├── SpringSecureTwoApplication.java  - Main application class
│   ├── SecurityConfig.java             - Custom security configuration
│   └── SampleController.java          - REST controller with multiple endpoints
```

## 🚀 Running the Project

1. Navigate to the project directory:
   ```bash
   cd Security/SpringSecureTwo
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

### Public Endpoint (No Authentication Required)
- **GET /pub** - Public endpoint accessible to anyone
  - Response: "anybody can access"

### Protected Endpoint (Authentication Required)
- **GET /admin** - Admin endpoint requiring authentication
  - Response: "This is admin page"
  - Access: Requires login with admin credentials

## 🔐 Default Credentials

The application is configured with an in-memory user:

- **Username**: `admin`
- **Password**: `admin`
- **Role**: `ADMIN`

## 💡 Key Configuration Features

### SecurityConfig.java includes:

1. **Custom SecurityFilterChain**:
   - Public endpoint (`/pub`) - accessible without authentication
   - Protected endpoint (`/admin`) - requires authentication

2. **In-Memory User Management**:
   - Pre-configured admin user
   - Role assignment (ADMIN)

3. **Password Encoding**:
   - BCryptPasswordEncoder for secure password storage

4. **HTTP Basic Authentication**:
   - Configured with custom realm name

## 🔍 What You'll Learn

- Creating custom SecurityFilterChain
- Configuring public and protected endpoints
- Setting up in-memory user authentication
- Password encoding with BCrypt
- Role-based access configuration
- Advanced Spring Security customization

## 📝 Testing

### Test Public Endpoint (No Login Required)
```bash
curl http://localhost:8080/pub
```
Response: "anybody can access"

### Test Protected Endpoint (Login Required)
```bash
curl -u admin:admin http://localhost:8080/admin
```
Response: "This is admin page"

### Using Browser
1. Navigate to `http://localhost:8080/pub` - Should work without login
2. Navigate to `http://localhost:8080/admin` - Will prompt for credentials
   - Username: `admin`
   - Password: `admin`

## 🆚 Comparison with SpringSecureOne

| Feature | SpringSecureOne | SpringSecureTwo |
|---------|----------------|-----------------|
| Configuration | Default | Custom |
| Public Endpoints | None | `/pub` |
| User Management | Auto-generated | In-memory configured |
| Password | Random (console) | Fixed: `admin` |
| Customization | None | Full control |

---

**Note**: This project demonstrates advanced security configuration. For production, use database-based user management and implement additional security measures.

