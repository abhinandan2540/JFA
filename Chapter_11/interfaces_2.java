package Chapter_11;

/*
### **Why Do We Use Interfaces in Java? 🤔**
Interfaces in Java are mainly used for **abstraction**, **multiple inheritance**, and **loose coupling**. Here are the key reasons why interfaces are useful:

---

## **🔹 1. Achieving Full Abstraction**
An **interface only contains method declarations** (without implementations), forcing implementing classes to provide their own logic.

```java
interface Animal {
    void makeSound();  // Abstract method (no implementation)
}
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}
```
✔ **Why?** It separates the definition from implementation, making the code **cleaner and more modular**.

---

## **🔹 2. Multiple Inheritance in Java (Since Java Doesn't Support It with Classes)**
Java **does not allow multiple inheritance** using classes (to avoid ambiguity), but an interface allows a class to inherit from multiple sources.

```java
interface Flyable {
    void fly();
}

interface Swimable {
    void swim();
}

class Bird implements Flyable, Swimable {
    @Override
    public void fly() {
        System.out.println("Bird is flying!");
    }

    @Override
    public void swim() {
        System.out.println("Bird is swimming!");
    }
}
```
✔ **Why?** A class can implement multiple interfaces but **extend only one class**, overcoming Java’s single inheritance limitation.

---

## **🔹 3. Loose Coupling (Decoupling Components in Large Systems)**
Interfaces **reduce dependencies** between different parts of an application, making the system **easier to modify and maintain**.

```java
interface Database {
    void connect();
}

class MySQLDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connected to MySQL Database");
    }
}

class PostgreSQLDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connected to PostgreSQL Database");
    }
}

// Using the interface in a program
public class Main {
    public static void main(String[] args) {
        Database db = new MySQLDatabase(); // We can easily switch to PostgreSQL
        db.connect();
    }
}
```
✔ **Why?** The `Main` class depends only on the `Database` interface, not the concrete implementation, making it **easier to swap databases** later.

---

## **🔹 4. Standardization (Defining a Common API/Contract)**
Interfaces define a **standard set of methods** that multiple classes **must** follow. This ensures consistency across different implementations.

```java
interface PaymentGateway {
    void processPayment(double amount);
}

class PayPal implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment: $" + amount);
    }
}

class Stripe implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Stripe payment: $" + amount);
    }
}
```
✔ **Why?** Any new payment service (like Razorpay) can be **added later** without changing existing code.

---

## **🔹 5. Allows Functional Programming (Java 8+)**
Since **Java 8**, interfaces can have **default and static methods** with implementations. This allows better **code reusability** without affecting existing implementations.

```java
interface Logger {
    default void log(String message) {
        System.out.println("Logging: " + message);
    }
}

class FileLogger implements Logger {
    public void saveLog() {
        log("Saving log to file...");  // Using default method
    }
}
```
✔ **Why?** Now **new methods can be added** to interfaces without breaking old implementations.

---

### **🔥 Summary – Why Use Interfaces?**
| 🛠 Purpose               | ✅ Benefit |
|----------------------|--------------------------------|
| **Abstraction** | Hides implementation details, forcing implementation in derived classes. |
| **Multiple Inheritance** | Allows a class to inherit behaviors from multiple interfaces. |
| **Loose Coupling** | Reduces dependencies between classes, making code modular. |
| **Standardization** | Defines a common contract that multiple classes must follow. |
| **Code Reusability (Java 8+)** | Default methods allow adding new features without breaking existing code. |

---

### **🧐 When to Use an Interface vs. Abstract Class?**
| Feature | Interface | Abstract Class |
|-----------------|------------|----------------|
| **Abstract Methods** | ✅ Can only have abstract methods (before Java 8) | ✅ Can have both abstract & concrete methods |
| **Multiple Inheritance** | ✅ Yes (a class can implement multiple interfaces) | ❌ No (a class can extend only one class) |
| **Default Methods (Java 8+)** | ✅ Yes | ✅ Yes |
| **Fields (Variables)** | ❌ Only `static` and `final` variables | ✅ Can have non-final, instance variables |
| **Constructors** | ❌ No | ✅ Yes |

👉 **Use an Interface** if you want to enforce a **contract** (behavior) across multiple unrelated classes.
👉 **Use an Abstract Class** if you want to share **state & behavior** among related classes.

 */


interface Mamals{
    void mamalSound();
}
class Dog implements Mamals{
    @Override
    public void mamalSound() {
        System.out.println("woof! woof!");
    }
}


public class interfaces_2 {
    public static void main(String[] args) {
        Mamals an=new Dog();
        an.mamalSound();
    }
}
