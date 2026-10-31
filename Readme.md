# Day 3: Loops & Iteration in Java 🔄

Welcome to Day 3 of your Java learning path! Today is all about **Loops**, which allow you to repeat a block of code multiple times efficiently without writing repetitive code.

---

## 🎯 Learning Objectives
By the end of today, you will be able to:
1. Understand and use `for` loops.
2. Understand and use `while` and `do-while` loops.
3. Master nested loops to print geometric patterns (Triangles, Squares).
4. Avoid common programming traps like **Infinite Loops**.

---

## 📚 Core Concepts

### 1. `for` Loop
Best used when you **know in advance** how many times the loop should run.

```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Iteration: " + i);
}
```

### 2. `while` Loop
Best used when you want to repeat code **as long as a condition remains true**, and you might not know the exact number of iterations beforehand.

```java
int count = 1;
while (count <= 5) {
    System.out.println("Count: " + count);
    count++; // Don't forget to update the counter to prevent infinite loops!
}
```

### 3. `do-while` Loop
Guarantees that the code block will execute **at least once**, regardless of whether the condition is initial true or false.

```java
int num = 1;
do {
    System.out.println("Number: " + num);
    num++;
} while (num <= 5);
```

---

## ⚠️ Important Pitfall: Infinite Loops!

An infinite loop occurs when the loop condition **never becomes `false`**.

🔴 **Wrong (Infinite Loop):**
```java
// j keeps increasing (1, 2, 3...) so j >= i will ALWAYS be true!
for (int j = 1; j >= i; j++) {
    System.out.print("* ");
}
```

🟢 **Correct:**
```java
// j stops once it exceeds i
for (int j = 1; j <= i; j++) {
    System.out.print("* ");
}
```

---

## 🧪 Day 3 Practice Challenges

### Challenge 1: Right-Angled Triangle Pattern 🔺
Write a program that takes user input for `rows` and prints a right-angled triangle.

**Expected Output (for rows = 4):**
```text
* 
* * 
* * * 
* * * * 
```

### Challenge 2: Solid Square Pattern 🔲
Write a program using nested loops to print a square of stars based on `rows` and `columns`.

**Expected Output (for 3 rows and 3 columns):**
```text
* * * 
* * * 
* * * 
```

---

