# JFA Java Threads

## Introduction to Threads in Java
In Java, a thread is a lightweight process that allows multiple operations to run concurrently. Java provides built-in support for multithreading through the `Thread` class and the `Runnable` interface. Threads help in improving application performance by utilizing CPU cores efficiently.

## Why Use Threads?
Threads are used in Java for:
- **Concurrency & Multitasking**: Execute multiple tasks at the same time.
- **Improved Performance**: Utilize multi-core processors efficiently.
- **Better Resource Management**: Threads share memory and resources within a process.
- **Asynchronous Execution**: Prevent blocking of the main program while performing time-consuming tasks.
- **Responsive Applications**: Avoid UI freezing in GUI-based applications.

## Creating Threads in Java
Java provides two primary ways to create threads:

### 1. Extending the `Thread` Class
```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();  // Start the thread
    }
}
```

### 2. Implementing the `Runnable` Interface
```java
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        t1.start();
    }
}
```

## Thread Lifecycle
A thread in Java goes through several states:
1. **NEW**: The thread is created but not started.
2. **RUNNABLE**: The thread is ready to run.
3. **BLOCKED**: The thread is waiting to access a locked resource.
4. **WAITING**: The thread is waiting indefinitely for another thread’s signal.
5. **TIMED_WAITING**: The thread waits for a specific time.
6. **TERMINATED**: The thread has finished execution.

You can check a thread's state using:
```java
System.out.println(t1.getState());
```

## Thread Priority
Each thread in Java has a priority between **1 (MIN_PRIORITY)** and **10 (MAX_PRIORITY)**. The default priority is **5 (NORM_PRIORITY)**.

Setting and getting thread priority:
```java
Thread t1 = new Thread(new MyRunnable());
t1.setPriority(Thread.MAX_PRIORITY);
System.out.println("Thread Priority: " + t1.getPriority());
```

## Synchronization
When multiple threads access shared resources, **race conditions** can occur. Java provides **synchronized** blocks and methods to prevent data inconsistency.

Example:
```java
class SharedResource {
    synchronized void printNumbers() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}
```

## Thread Communication
Threads can communicate using `wait()`, `notify()`, and `notifyAll()` methods.

Example:
```java
class Shared {
    synchronized void waitMethod() throws InterruptedException {
        System.out.println("Waiting...");
        wait();
    }

    synchronized void notifyMethod() {
        System.out.println("Notifying...");
        notify();
    }
}
```

## Special Thanks
---
Special thanks to [code with harry](https://www.youtube.com/@CodeWithHarry) for his insightful notes

[Chapter13PracticeSetJava.pdf](https://github.com/user-attachments/files/18985433/Chapter13PracticeSetJava.pdf)

[Ch13Java.pdf](https://github.com/user-attachments/files/18985432/Ch13Java.pdf)

---

🚀 **Happy Coding**
---
[JFA](https://github.com/abhinandan2540)

