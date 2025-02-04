# Java for All

Welcome to **Java for All**, a repository dedicated to learning Java with fun and practical projects! 🚀

## Rock Paper Scissors Game
This repository includes a simple **Rock Paper Scissors** game implemented in Java. The game is based on user input and random computer choices, using fundamental Java concepts.

### **How the Game Works**
- The player chooses `Rock (0)`, `Paper (1)`, or `Scissors (2)`.
- The computer randomly picks an option using `Math.random()`.
- The winner is decided based on the standard **Rock Paper Scissors** rules:
  - Rock beats Scissors
  - Scissors beats Paper
  - Paper beats Rock
- The result is displayed on the console.

### **Key Java Concepts Used**
#### 1. `Math.random()` for Random Selection
`Math.random()` generates a random number between `0.0` and `1.0`. We multiply it and convert it into an integer range for the game.
```java
int computerChoice = (int) (Math.random() * 3); // Generates 0, 1, or 2
```

#### 2. `Integer.parseInt()` for User Input
Since `Scanner` reads input as a string, `Integer.parseInt()` converts the user input into an integer.
```java
Scanner sc = new Scanner(System.in);
System.out.print("Enter your choice (0 for Rock, 1 for Paper, 2 for Scissors): ");
int userChoice = Integer.parseInt(sc.nextLine());
```
This ensures the input is correctly interpreted as a number.

### **How to Play?**
1. Run the program.
2. Enter your choice (0 for Rock, 1 for Paper, 2 for Scissors).
3. The computer will randomly select an option.
4. The winner will be announced based on the game rules.

#### Example Output:
```
Enter your choice (0 for Rock, 1 for Paper, 2 for Scissors): 1
Computer chose: Rock
You win!
```

---
### **Special Thanks**
A special thanks to [**Code with Harry**](https://www.youtube.com/@CodeWithHarry) for providing helpful Java notes that assisted in creating this project. 🙌
---
### Thank You
[JFA](https://github.com/abhinandan2540)

