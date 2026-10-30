# Java Basic: Day 2 - Control Flow & Decision Making

Welcome to Day 2 of your Java journey! Today, you'll learn how to make decisions in your programs using **Conditional Statements** (`if`, `else if`, `else`, and `switch`).

---

## 🎯 Task Description

Write a Java program in `Solution.java` that takes a student's score (an integer from 0 to 100) and outputs:
1. Their corresponding **letter grade** based on standard grading logic.
2. A **custom message** based on their grade status using a `switch` statement or conditional logic.

### Grading Scale:
* **90 to 100:** Grade `A` (Message: *"Excellent work!"*)
* **80 to 89:** Grade `B` (Message: *"Good job!"*)
* **70 to 79:** Grade `C` (Message: *"Fair effort!"*)
* **60 to 69:** Grade `D` (Message: *"Needs improvement."*)
* **Below 60:** Grade `F` (Message: *"Failed. Please try again."*)

---

## 📥 Input Format

A single integer $S$, representing the score.

---

## 🔒 Constraints

* $0 \le S \le 100$

---

## 📤 Output Format

Print the evaluation result in two lines:
1. `Grade: <Letter Grade>`
2. `Status: <Message>`

If the score is outside the range $0 - 100$, output:
`Invalid Score! Please enter a value between 0 and 100.`

---

## 🧪 Sample Test Cases

### Sample 0

**Input:**
```text
85
```

**Output:**
```text
Grade: B
Status: Good job!
```

### Sample 1

**Input:**
```text
52
```

**Output:**
```text
Grade: F
Status: Failed. Please try again.
```

### Sample 2

**Input:**
```text
105
```

**Output:**
```text
Invalid Score! Please enter a value between 0 and 100.
```

---

