# Java for All (JFA) - Access Modifiers

Access modifiers in Java define the **visibility** and **accessibility** of classes, methods, and variables. Java provides four main access modifiers:
- **private**
- **default** (no modifier)
- **protected**
- **public**

This document focuses on the **private** and **public** access modifiers.

---

## **1. private Access Modifier**
The `private` access modifier **restricts access** to the member **within the same class only**. It cannot be accessed from outside the class.

### **Example:**
```java
class MyEmployee {
    private int id;
    private String name;

    // Setter methods to assign values
    public void setID(int i) {
        id = i;
    }
    public void setName(String n) {
        name = n;
    }
    
    // Getter methods to retrieve values
    public int getID() {
        return id;
    }
    public String getName() {
        return name;
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        MyEmployee emp = new MyEmployee();
        
        // Setting values using setters
        emp.setID(101);
        emp.setName("Java for All");
        
        // Getting values using getters
        System.out.println("ID: " + emp.getID());  // Output: 101
        System.out.println("Name: " + emp.getName());  // Output: Java for All
    }
}
```
### **Key Points:**
✅ **Ensures data encapsulation** (data hiding).  
✅ Variables cannot be accessed directly from outside the class.  
✅ We need **getter and setter methods** to modify and retrieve private variables.

---

## **2. public Access Modifier**
The `public` access modifier allows the member **to be accessed from anywhere** within the program.

### **Example:**
```java
class Student {
    public int rollNo;
    public String name;

    // Constructor
    public Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    // Method accessible everywhere
    public void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name);
    }
}

public class AccessModifiersDemo {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Alice");
        s1.display();  // Output: Roll No: 1, Name: Alice
    }
}
```
### **Key Points:**
✅ **Accessible from anywhere** in the program.  
✅ Used for methods, variables, and classes that should be **globally accessible**.  
✅ No restrictions on access.

---

## **Conclusion**
- **`private`** ensures **data security and encapsulation** by restricting access.
- **`public`** provides **global accessibility**, making the member available throughout the application.
- Use **getter and setter methods** to access private data safely.

---

## **Special Thanks**
A huge **thank you** to [**Code with Harry**](https://www.youtube.com/@CodeWithHarry) for providing insightful notes that helped in understanding these concepts! 🎉

### Notes
[Chapter9.pdf](https://github.com/user-attachments/files/18765273/Chapter9.pdf)
[Ch9PS.pdf](https://github.com/user-attachments/files/18765271/Ch9PS.pdf)

### Thank You
[JFA](https://github.com/abhinandan2540)




