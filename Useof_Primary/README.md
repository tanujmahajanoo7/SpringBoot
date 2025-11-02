# Use of Primary - Spring Boot Project

This project demonstrates the use of `@Primary` annotation in Spring Boot to resolve ambiguity when multiple beans of the same type are available.

## 📋 Description

When Spring encounters multiple implementations of the same interface or type, it doesn't know which one to inject by default. The `@Primary` annotation marks a bean as the preferred choice when multiple candidates are available.

This project shows how `@Primary` works with the OS (Operating System) interface, which has multiple implementations (Windows, Unix), and how to inject the correct one into a Laptop component.

## 🔧 Dependencies

- **Spring Boot Starter** - Core Spring Boot functionality
- No additional dependencies required

## 🏗️ Project Structure

```
Useof_Primary/
├── src/main/java/com/example/demo/
│   ├── UseofPrimaryApplication.java  - Main application class
│   ├── Laptop.java                  - Component that uses OS
│   ├── OS.java                      - Interface
│   ├── Windows.java                 - OS implementation
│   └── Unix.java                    - OS implementation (with @Primary)
```

## 💡 Key Concepts

### @Primary Annotation

The `@Primary` annotation indicates that a bean should be given preference when multiple candidates are qualified to autowire a single-valued dependency.

**Example:**
```java
@Component
@Primary
public class Unix implements OS {
    // Implementation
}
```

When `Laptop` needs an `OS` dependency and both `Windows` and `Unix` are available, Spring will inject `Unix` because it's marked with `@Primary`.

## 🚀 Running the Project

1. Navigate to the project directory:
   ```bash
   cd Useof_Primary
   ```

2. Run the application:
   ```bash
   mvn spring-boot:run
   ```

3. Observe the output in the console showing:
   - Which OS implementation was injected
   - The laptop building process

## 🔍 What You'll Learn

- How to use `@Primary` annotation
- Resolving bean ambiguity in Spring
- When to use `@Primary` vs `@Qualifier`
- Best practices for handling multiple bean implementations

## 📝 Experiment

Try removing the `@Primary` annotation and see what error Spring throws. This will help you understand when `@Primary` is necessary.

---

**Note**: This is a console application - it runs and displays output directly in the console. The `@Primary` annotation helps Spring decide which OS implementation to inject into the Laptop component.

