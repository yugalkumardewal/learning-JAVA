# Day 4: Arrays & Methods in Java 📦

Welcome to Day 4 of your Java learning roadmap! Today, we transition from simple variable storage to managing multiple data values using **Arrays**, and structuring reusable code using **Methods (Functions)**.

## 🎯 Learning Objectives

By the end of today, you will be able to:

1. Declare, initialize, and access elements in 1D Arrays.
2. Iterate through arrays using `for` loops and `for-each` loops.
3. Understand and write custom static methods (functions) with parameters and return types.
4. Pass arrays into methods to process sequences of data efficiently.

---

## 📚 Core Concepts

### 1. Arrays in Java

An **Array** is a fixed-size container that holds multiple values of the same data type.

#### **Declaration & Memory Allocation:**
```java
// Method 1: Specify size, values default to 0
int[] numbers = new int[5];

// Method 2: Declare with immediate values
int[] scores = {85, 90, 78, 92, 88};
```

#### **Accessing & Modifying Elements (0-indexed):**
```java
int firstScore = scores[0]; // 85
scores[1] = 95;             // Updates second element to 95
```

#### **Iterating Through Arrays:**
```java
// Standard loop (index accessible)
for (int i = 0; i < scores.length; i++) {
    System.out.println("Score " + i + ": " + scores[i]);
}

// Enhanced for-each loop (cleaner read-only iteration)
for (int score : scores) {
    System.out.println("Score: " + score);
}
```

---

### 2. Methods (Functions) in Java

Methods break down complex programs into modular, reusable blocks of logic.

#### **Syntax:**
```java
public class Main {

    // ReturnType MethodName(ParameterType parameterName)
    public static int addNumbers(int a, int b) {
        int sum = a + b;
        return sum; // returns calculated integer back to caller
    }

    public static void main(String[] args) {
        int result = addNumbers(10, 20); // Calling the method
        System.out.println("Sum is: " + result);
    }
}
```

---

## ⚠️ Common Pitfalls

1. **`ArrayIndexOutOfBoundsException`**:
   * Occurs when trying to access an index that doesn't exist (e.g., accessing index `5` on an array of length `5`, valid indices are `0` to `4`).
2. **Missing Return Statement**:
   * If a method has a non-`void` return type, every execution path must return a value matching that data type.

---

## 🧪 Day 4 Practice Challenges

### Challenge 1: Find Min and Max in an Array 🔢
Write a Java method `findMax(int[] arr)` that takes an array of integers and returns the maximum element.

**Sample Input:** `{12, 45, 2, 67, 34}`  
**Expected Output:** `Max value is 67`

### Challenge 2: Array Sum & Average 📊
Create a method `calculateAverage(int[] arr)` that returns the average of all numbers in the array.

**Sample Input:** `{10, 20, 30, 40}`  
**Expected Output:** `Average is 25.0`

---

