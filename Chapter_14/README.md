# **Java for All (JFA) - Errors and Exceptions**

## 📌 **Introduction**
Errors and exceptions are an essential part of Java programming. They help developers handle unexpected situations in a structured and controlled manner. Java provides a robust exception-handling mechanism using `try`, `catch`, `finally`, and the `Exception` class hierarchy.

---

## ⚡ **Errors vs. Exceptions**

| Category | Description |
|----------|-------------|
| **Errors** | Irrecoverable problems that occur at runtime, such as `OutOfMemoryError` or `StackOverflowError`. These are caused by system-level issues and are not meant to be caught. |
| **Exceptions** | Problems that can be handled during execution, such as invalid user input or file not found. Java provides mechanisms to catch and handle these exceptions. |

---

## 🚀 **Exception Handling in Java**

Java uses the `try-catch-finally` block to handle exceptions effectively.

### 🔹 **1. Try-Catch Block**
The `try` block contains code that might throw an exception, while the `catch` block handles it.

```java
public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}
```

### 🔹 **2. The Exception Class Hierarchy**
Java exceptions are categorized into **Checked** and **Unchecked** exceptions:

- **Checked Exceptions**: Must be handled during compilation (e.g., `IOException`, `SQLException`).
- **Unchecked Exceptions**: Occur at runtime and do not require mandatory handling (e.g., `NullPointerException`, `ArithmeticException`).

Common exception classes:
```java
Exception (Superclass)
│
├── IOException
│   ├── FileNotFoundException
│   ├── EOFException
│
├── RuntimeException
│   ├── ArithmeticException
│   ├── NullPointerException
│   ├── IndexOutOfBoundsException
```

### 🔹 **3. Finally Block**
The `finally` block is always executed, whether an exception occurs or not. It is mainly used for cleanup operations like closing files or database connections.

```java
public class FinallyExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // Throws ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds!");
        } finally {
            System.out.println("This block always executes!");
        }
    }
}
```

### 🔹 **4. Throw and Throws**
- `throw` is used to explicitly throw an exception.
- `throws` is used in method signatures to indicate possible exceptions.

```java
public class ThrowExample {
    static void checkAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above.");
        }
    }
    public static void main(String[] args) {
        checkAge(15);
    }
}
```

---

## 📌 **Conclusion**
Understanding and handling exceptions properly is crucial for writing robust Java applications. Using `try-catch-finally`, the `Exception` hierarchy, and the `throw` & `throws` keywords, you can effectively manage runtime errors in your programs.

## **Special Thanks**
Special thanks to [code with harry](https://www.youtube.com/@CodeWithHarry) for the concept and notes

[Ch14PS.pdf](https://github.com/user-attachments/files/19128990/Ch14PS.pdf)
[Ch14_java.pdf](https://github.com/user-attachments/files/19128983/Ch14_java.pdf)

## **Thank You**
[JFA](https://github.com/abhinandan2540)
