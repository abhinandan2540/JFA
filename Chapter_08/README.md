
### **Java for All (JFA) - Object-Oriented Programming (OOP) Part 1**  

Welcome to **Java for All (JFA)**! This chapter focuses on the fundamentals of **Object-Oriented Programming (OOP)** in Java. OOP is a programming paradigm based on the concept of **objects**, which can contain data (fields/attributes) and methods (functions).  

---

## **Key OOP Concepts in Java**  

### 🔹 **1. Abstraction**  
Abstraction is the process of hiding implementation details and showing only the necessary functionality. It helps in reducing complexity and increasing reusability.  

✅ **Example:**  
- Using **abstract classes** and **interfaces** in Java.  
- Hiding implementation using method signatures while allowing subclasses to define specific behaviors.  

```java
abstract class Vehicle {
    abstract void start(); // Only method signature, no implementation
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting...");
    }
}
```

---

### 🔹 **2. Encapsulation**  
Encapsulation is the practice of wrapping data (variables) and methods within a class and restricting direct access to them using **access modifiers** (`private`, `public`, `protected`).  

✅ **Example:**  
- Making class attributes `private` and providing `getter` and `setter` methods.  

```java
class Employee {
    private int salary; // Private variable

    public int getSalary() { // Getter method
        return salary;
    }

    public void setSalary(int salary) { // Setter method
        this.salary = salary;
    }
}
```

Benefits of Encapsulation:
- Protects data from accidental modification.
- Enhances security and flexibility.

---

### 🔹 **3. Inheritance**  
Inheritance allows a class (**child/subclass**) to acquire properties and methods from another class (**parent/superclass**). It promotes **code reusability** and **hierarchical structure**.  

✅ **Example:**  
- `extends` keyword is used for inheritance.  

```java
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound(); // Inherited from Animal class
        d.bark();
    }
}
```

---

### 🔹 **4. Polymorphism**  
Polymorphism means "many forms" and allows a single interface to represent different types of objects. It is achieved through **method overloading** and **method overriding**.  

✅ **Types of Polymorphism:**  
- **Compile-time (Method Overloading)** → Multiple methods with the same name but different parameters.  
- **Run-time (Method Overriding)** → A subclass provides a specific implementation of a method already defined in its superclass.  

```java
// Method Overloading (Compile-time Polymorphism)
class MathOperations {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Method Overriding (Run-time Polymorphism)
class Parent {
    void show() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child class method");
    }
}
```

---

## **📌 Conclusion**  
Object-Oriented Programming (OOP) is a **powerful programming paradigm** that makes code **modular, reusable, and scalable**. In this chapter, we explored **abstraction, encapsulation, inheritance, and polymorphism**—the four pillars of OOP in Java.

---

## **🙏 Special Thanks**  
A huge thanks to **[Code with Harry](https://www.codewithharry.com/)** for his incredible notes and tutorials that helped in understanding Java OOP concepts in depth. 🎯  

## **Notes**

[Ch8_PS.pdf](https://github.com/user-attachments/files/18749577/Ch8_PS.pdf)
[Ch8.pdf](https://github.com/user-attachments/files/18749576/Ch8.pdf)


---

### 🔗 **More Resources**
📂 **GitHub Repository**: [Java for All (JFA)](https://github.com/abhinandan2540/JFA)  
📘 **Java Docs**: [Oracle Java Documentation](https://docs.oracle.com/en/java/)  

### Thank You
[JFA](https://github.com/abhinandan2540/JFA)

🚀 Happy Coding!  
