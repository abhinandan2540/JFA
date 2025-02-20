# Java For All (JFA)

Welcome to **Java For All (JFA)**! This repository aims to provide a comprehensive understanding of Java concepts, starting with fundamental topics like **Interpreter vs Compiler**, **Packages in Java**, **Creating Packages**, and **Access Modifiers in Java**.

## **Interpreter vs Compiler**
### **What is an Interpreter?**
An **interpreter** is a program that translates high-level code into machine code **line by line**. It does not generate a separate executable file but instead runs the code directly.

**Example of an Interpreted Language:**
- Python
- JavaScript
- PHP

### **What is a Compiler?**
A **compiler** translates the entire source code into machine code at once before execution. It creates an independent executable file that can be run without the compiler.

**Example of a Compiled Language:**
- C
- C++
- Go

### **How Java Uses Both?**
Java is a unique language because it uses both **compilation and interpretation**:
1. Java source code (`.java` files) is first compiled into **bytecode** (`.class` files) using the **Java Compiler (javac)**.
2. The bytecode is then interpreted and executed by the **Java Virtual Machine (JVM)**, making Java platform-independent.

## **Packages in Java**
### **What is a Package?**
A **package** in Java is a way to group related classes and interfaces together. It helps in **organizing code**, **avoiding name conflicts**, and **providing access control**.

### **Types of Packages**
1. **Built-in Packages** – Provided by Java, such as `java.util`, `java.io`, `java.net`.
2. **User-defined Packages** – Created by the programmer to better organize code.

### **How to Create a Package in Java?**
To create a package, follow these steps:
1. Declare the package at the beginning of your Java file using the `package` keyword.
2. Save the file inside a directory with the package name.
3. Compile the program using `javac -d . filename.java`.

#### **Example of Creating a Package**
```java
// Step 1: Define a package
package mypackage;

public class MyClass {
    public void showMessage() {
        System.out.println("Hello from MyClass in mypackage!");
    }
}
```

#### **Using a Package in Another Class**
```java
import mypackage.MyClass;

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showMessage();
    }
}
```

## **Access Modifiers in Java**
Access modifiers determine the **visibility and accessibility** of classes, methods, and variables in Java.

### **Types of Access Modifiers**
| Modifier     | Within Class | Within Package | Outside Package (Subclass) | Outside Package |
|-------------|-------------|----------------|--------------------------|----------------|
| **private** | ✅ Yes      | ❌ No           | ❌ No                     | ❌ No         |
| **default** | ✅ Yes      | ✅ Yes          | ❌ No                     | ❌ No         |
| **protected** | ✅ Yes    | ✅ Yes          | ✅ Yes                     | ❌ No         |
| **public**  | ✅ Yes      | ✅ Yes          | ✅ Yes                     | ✅ Yes        |

### **Example Usage of Access Modifiers**
```java
// Example showing different access modifiers
package mypackage;

public class Example {
    private int privateVar = 10;
    int defaultVar = 20;
    protected int protectedVar = 30;
    public int publicVar = 40;

    public void display() {
        System.out.println("Private: " + privateVar);
        System.out.println("Default: " + defaultVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Public: " + publicVar);
    }
}
```

#### **Accessing in Another Class**
```java
import mypackage.Example;

public class AccessTest {
    public static void main(String[] args) {
        Example obj = new Example();
        // System.out.println(obj.privateVar); // ❌ Not Accessible
        // System.out.println(obj.defaultVar); // ❌ Not Accessible (outside package)
        // System.out.println(obj.protectedVar); // ❌ Not Accessible (outside package)
        System.out.println(obj.publicVar); // ✅ Accessible
    }
}
```

## **Special Thanks**
This repository is inspired by and made possible with the help of [**Code with Harry**](https://www.youtube.com/@CodeWithHarry). His excellent notes and tutorials have been instrumental in creating this guide. 🚀

[Chapter12_Java.pdf](https://github.com/user-attachments/files/18881222/Chapter12_Java.pdf)
[Ch12psJava.pdf](https://github.com/user-attachments/files/18881221/Ch12psJava.pdf)


---

## **Stay Tuned for More Java Concepts!**
[**JFA**](https://github.com/abhinandan2540)

This repository will be updated regularly with more Java concepts, examples, and projects. Happy Coding! 🎯

