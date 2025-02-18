# Java for All (JFA)

Welcome to the **Java for All (JFA)** repository! This repository is designed to provide a structured and in-depth understanding of Java programming, covering various fundamental and advanced concepts.

## **Topics and Concepts Discussed**

### **Abstract Classes**
- Abstract classes cannot be instantiated but can have both abstract and concrete methods.
- Used for providing a common base for derived classes.
- Example:
  ```java
  abstract class Animal {
      abstract void makeSound();
      void sleep() {
          System.out.println("Sleeping...");
      }
  }
  ```

### **Interfaces**
- Interfaces define a contract that implementing classes must follow.
- Can contain only abstract methods (Java 7) or default and static methods (Java 8+).
- Example:
  ```java
  interface Vehicle {
      void start();
  }
  ```

### **Inheritance**
- Mechanism to derive a class from another class, promoting code reusability.
- Example:
  ```java
  class Animal {
      void eat() {
          System.out.println("This animal eats food.");
      }
  }
  class Dog extends Animal {
      void bark() {
          System.out.println("Dog barks");
      }
  }
  ```

### **Polymorphism**
- Ability of an object to take many forms.
- Two types: **Compile-time (Method Overloading)** and **Runtime (Method Overriding)**.
- Example:
  ```java
  class Shape {
      void draw() {
          System.out.println("Drawing a shape");
      }
  }
  class Circle extends Shape {
      void draw() {
          System.out.println("Drawing a circle");
      }
  }
  ```

## **Special Thanks**
A special thanks to [**Code with Harry**](https://www.youtube.com/@CodeWithHarry) for his insightful notes that contributed to the learning material in this repository.

[Chapter11PS.pdf](https://github.com/user-attachments/files/18849411/Chapter11PS.pdf)
[Chapter_11_Abstract Classes.pdf](https://github.com/user-attachments/files/18849410/Chapter_11_Abstract.Classes.pdf)

## **Thank You**
[JFA](https://github.com/abhinandan2540)



