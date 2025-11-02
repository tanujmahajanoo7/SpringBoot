# SpringSecureOne - Basic Spring Security

A basic Spring Boot application demonstrating Spring Security's default configuration and automatic security features.

## 📋 Description

This is the simplest Spring Security implementation. It uses Spring Security's default configuration, which automatically:
- Secures all endpoints
- Requires authentication for all requests
- Provides a default login page
- Uses in-memory authentication with default credentials

## 🔧 Dependencies

- **Spring Boot Starter Security** - Core Spring Security functionality
- **Spring Web** - For web endpoints

## 🏗️ Project Structure

```
SpringSecureOne/
├── src/main/java/com/example/demo/
│   ├── SpringSecureOneApplication.java  - Main application class
│   └── SampleController.java           - REST controller with protected endpoint
```

## 🚀 Running the Project

1. Navigate to the project directory:
   ```bash
   cd Security/SpringSecureOne
   ```

2. Run the application:
   ```bash
   mvn spring-boot:run
   ```

3. Open your browser and navigate to:
   ```
   http://localhost:8080/admin
   ```

## 🔐 Default Security Behavior

When you access any endpoint, Spring Security will:
1. Redirect you to a default login page (`/login`)
2. Require username and password
3. Default username: `user`
4. Default password: Check the console output (randomly generated each time)

## 📡 API Endpoints

- **GET /admin** - Protected endpoint that requires authentication
  - Response: "This is admin page"
  - Access: Requires authentication

## 🔍 What You'll Learn

- How Spring Security works out of the box
- Default authentication mechanism
- Automatic security configuration
- Basic protected endpoints

## 📝 Testing

1. Access `http://localhost:8080/admin`
2. You'll be redirected to `/login`
3. Use default credentials:
   - Username: `user`
   - Password: (check console for generated password)
4. After login, you'll see "This is admin page"

### Finding the Default Password

When the application starts, look for a line in the console like:
```
Using generated security password: xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx
```

## 💡 Key Features

- Automatic security configuration
- Default login page
- In-memory authentication
- Basic HTTP security

## 📚 Next Steps

After understanding this basic implementation, explore:
- **SpringSecureTwo** - Custom security configuration
- **RoleBasedLoginApp** - Role-based access control
- **OtpBasedAuthentication** - Advanced authentication

---

**Note**: This project uses Spring Security's default configuration. For custom security settings, see **SpringSecureTwo**.

