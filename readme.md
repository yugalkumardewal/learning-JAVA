# Java Basic: Day 1 - Input, Output & Basic Arithmetic

Welcome to Day 1 of learning Java! This repository contains your first practice challenge focused on basic console Input/Output (I/O), working with primitive data types, and performing simple arithmetic.

---

## 🎯 Task Description

Write a Java program in `Solution.java` that reads user details and two numbers from standard input (`System.in`), displays a personalized greeting, and outputs the basic arithmetic results.

---

## 📥 Input Format

1. **Line 1:** String $S$ — User's Name  
2. **Line 2:** Integer $A$ — User's Age  
3. **Line 3:** Integer $N_1$ — First Number  
4. **Line 4:** Integer $N_2$ — Second Number  

---

## 🔒 Constraints

* $1 \le \vert{}S\vert{} \le 50$
* $1 \le A \le 120$
* $-10^4 \le N_1, N_2 \le 10^4$
* $N_2 \neq 0$

---

## 📤 Output Format

Print the results line by line in the following format:

1. `Hello <Name>! You are <Age> years old.`
2. `Sum: <N1 + N2>`
3. `Difference: <N1 - N2>`
4. `Product: <N1 * N2>`
5. `Quotient: <N1 / N2>` (formatted to 1 decimal place)

---

## 🧪 Sample Test Cases

### Sample 0

**Input:**
```text
Alex
16
10
5
```

**Output:**
```text
Hello Alex! You are 16 years old.
Sum: 15
Difference: 5
Product: 50
Quotient: 2.0
```

---

### Sample 1

**Input:**
```text
Jordan
21
15
4
```

**Output:**
```text
Hello Jordan! You are 21 years old.
Sum: 19
Difference: 11
Product: 60
Quotient: 3.75
```

---

## 💻 Starter Template

Copy this into your `Solution.java` file to begin coding:

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Read input values
        
        // 2. Print greeting message
        
        // 3. Compute and print arithmetic results

        scanner.close();
    }
}
```

---

## 🚀 How to Run

1. Open your terminal in the directory containing `Solution.java`.
2. Compile the Java file:
   ```bash
   javac Solution.java
   ```
3. Run the compiled program:
   ```bash
   java Solution
   ```