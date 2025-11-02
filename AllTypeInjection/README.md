# All Type Injection - Spring Boot Project

This project demonstrates different types of dependency injection in Spring Boot:
1. Field Injection
2. Setter Injection
3. Constructor Injection

## 📋 Description

The project shows how to inject dependencies using different methods, with examples of Student and Address classes. The code includes commented examples of all three injection types, with the currently active injection method clearly marked.

## 🔧 Dependencies

This project uses:
- **Spring Boot Starter** - Core Spring Boot functionality
- No additional dependencies required

## 🏗️ Project Structure

```
AllTypeInjection/
├── src/main/java/com/example/demo/
│   ├── FirstSpringBootApplication.java  - Main application class
│   ├── Student.java                     - Component with injection example
│   └── Address.java                     - Injected dependency
```

## 💡 Key Concepts

### Priority of Injection Types (Best Practices)
1. **Constructor Injection** (Recommended) - Ensures dependencies are available at object creation
2. **Setter Injection** - Allows optional dependencies
3. **Field Injection** - Simplest but less flexible

## 🚀 Running the Project

1. Navigate to the project directory:
   ```bash
   cd AllTypeInjection
   ```

2. Run the application:
   ```bash
   mvn spring-boot:run
   ```

3. Observe the output in the console showing:
   - Address information
   - Student studying message

## 📝 Code Examples

The `Student.java` file demonstrates all three injection types with comments. Currently, **Field Injection** is active, but you can switch to other methods by commenting/uncommenting the relevant code.

## 🔍 What You'll Learn

- How Spring Boot manages component dependencies
- Different ways to inject dependencies
- Best practices for dependency injection
- Using ApplicationContext to retrieve beans

---

**Note**: This is a console application - it runs and displays output directly in the console, not in a web browser.

