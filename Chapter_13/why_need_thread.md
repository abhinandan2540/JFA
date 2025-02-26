**why do we need thread**
---
----
Thread in java used to attain multitasking and improvement of code efficiency.
There are multiple ways in which Threads are used in java.



*1. Concurrency & Multitasking*

---
Threads allow a program to execute multiple tasks simultaneously without blocking the main program.

Example: Running a file download while allowing the user to interact with the UI.



*2. Improved Performance*

---
Threads utilize CPU cores efficiently by running multiple operations in parallel.

Example: A multi-core processor can run multiple threads at the same time.

*3. Better Resource Utilization*

---
Instead of creating separate processes (which are heavyweight), multiple threads within a single process share memory and resources efficiently.

*4.  Responsiveness in GUI Applications*

---
In GUI applications, if a long-running task is performed on the main thread, the UI may freeze.

By using a separate thread, the UI remains responsive while the background task runs.

*5.Handling Asynchronous Tasks*

---
Threads are useful in applications where you need to handle I/O operations, such as:

- Fetching data from a database
- Reading/writing files
- Making API calls

*6. Parallelism in Large Computations*

---
Java threads are useful for executing heavy computational tasks in parallel.

Example: Running matrix multiplications on multiple threads instead of sequentially.


*When we should use threads*
-
---

- When we need to perform multiple independent tasks concurrently.
- When we have long-running tasks that shouldn't block the main program.
- When we want to utilize multi-core processors for parallel execution.

