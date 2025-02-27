**Errors in java**
---
---
In java there are mainly 3 types of errors: 
1. Syntax error
2. Logical error
3. Runtime error 

*Syntax Error :*
---
---
Missing semicolons, incorrect variable declarations, etc
```public class Main {
public static void main(String[] args) {
System.out.println("Hello World" // ❌ Missing closing parenthesis
}
}
```

*Logical Error :*
--
---

Logical errors are mistakes in the program's logic that cause incorrect results without crashing the program. These errors are not detected by the compiler or runtime, making them harder to debug.

```aiignore
public class Main {
    public static void main(String[] args) {
        int length = 5, width = 3;
        int area = length + width; // ❌ Wrong formula (should be length * width)
        System.out.println("Area of rectangle: " + area);
    }
}

```

```aiignore
public class Main {
    public static void main(String[] args) {
        int num = 10;
        if (num % 2 == 1) { // ❌ Should be num % 2 == 0
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}

```


*Runtime Error :*
--
---
These occur during execution and can cause the program to crash if not handled properly.

Types of Runtime Errors:

*A. Exceptions:*

---
Exceptions are problems that can be handled using try-catch.

Examples:

```aiignore
public class Main {
    public static void main(String[] args) {
        int a = 5 / 0; // ❌ ArithmeticException: Division by zero
    }
}

```

```aiignore
public class Main {
    public static void main(String[] args) {
        try {
            int a = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}

```


*B. Errors (Serious issues that crash the JVM):*

---

Errors cannot be handled by try-catch and usually indicate system-level problems.

Example:

```aiignore
public class Main {
    public static void recursiveMethod() {
        recursiveMethod(); // ❌ Infinite recursion (stack overflow)
    }

    public static void main(String[] args) {
        recursiveMethod();
    }
}

```

