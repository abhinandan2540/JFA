
# 📌 Java for All

Welcome to **Java for All (JFA)**! 🚀  
This repository is dedicated to learning and mastering **Java programming** with structured concepts and hands-on coding exercises.

---

## 🔹 Arrays in Java
Arrays are one of the fundamental data structures in Java, allowing storage of multiple elements of the same type in a single variable.

### 📌 One-Dimensional Arrays (1D Arrays)
A **1D array** is a linear collection of elements, accessible using an index.

#### 🔹 Declaration & Initialization:
```java
int[] arr = new int[5]; // Array of size 5
int[] numbers = {10, 20, 30, 40, 50}; // Direct initialization
```

#### 🔹 Accessing Elements:
```java
System.out.println(numbers[2]); // Output: 30
```

#### 🔹 Traversing an Array:
```java
for (int i = 0; i < numbers.length; i++) {
    System.out.print(numbers[i] + " ");
}
// Output: 10 20 30 40 50
```

---

### 📌 Two-Dimensional Arrays (2D Arrays)
A **2D array** is an array of arrays, often used for representing matrices.

#### 🔹 Declaration & Initialization:
```java
int[][] matrix = new int[3][3]; // 3x3 matrix
int[][] predefined = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

#### 🔹 Accessing Elements:
```java
System.out.println(predefined[1][2]); // Output: 6
```

#### 🔹 Traversing a 2D Array:
```java
for (int i = 0; i < predefined.length; i++) {
    for (int j = 0; j < predefined[i].length; j++) {
        System.out.print(predefined[i][j] + " ");
    }
    System.out.println();
}
```
**Output:**
```
1 2 3
4 5 6
7 8 9
```

---

## ❓ Questions on Arrays
To strengthen your understanding, practice these problems:

1️⃣ Find the largest and smallest element in an array.  
2️⃣ Reverse a given array.  
3️⃣ Find the sum of all elements in a 2D matrix.  
4️⃣ Search for an element in a 2D array.  
5️⃣ Implement a program to check sort or not.  

---
## 🙏 Special Thanks
A huge **THANK YOU** to [**Code with Harry**](https://www.youtube.com/@CodeWithHarry) for his insightful notes that helped in building this content! 🎉  

[Chapter_6_Practice_Set.pdf](https://github.com/user-attachments/files/18693401/Chapter_6_Practice_Set.pdf)
[Chapter_6_Arrays.pdf](https://github.com/user-attachments/files/18693398/Chapter_6_Arrays.pdf)


---
## Thank You
[JFA](https://github.com/abhinandan2540)



