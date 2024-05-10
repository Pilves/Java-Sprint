# Java Programming Exercises

Welcome to the Java Programming Exercises! This repository contains a series of exercises designed to help you practice and enhance your Java programming skills. Each exercise focuses on different aspects of Java programming, such as loops, conditional statements, and string manipulation. Let's get started!

## Exercises

### 1. Accumulate

**Learning Objectives:**

- Develop proficiency in using loops to accumulate values.
- Practice handling edge cases, such as negative input values.

**Instructions:**

Create a method that takes an integer `n` and returns the sum of all integers from `n` down to 1. If `n` is less than 0, the method should return 0.

**Expected Method Signature:**
```java
public static int Accumulate(int n){
    // Your code here
}
```

### 2. Is Leap Year

**Learning Objectives:**

- Learn to apply conditional statements to check for leap years.
- Understand the rules for determining whether a year is a leap year.

**Instructions:**

Create a method that takes an integer `n` (representing a year) and returns `true` if the year is a leap year, and `false` otherwise.

**Expected Method Signature:**
```java
public static boolean IsLeapYear(int n){
    // Your code here
}
```

### 3. Combinations

**Learning Objectives:**

- Develop skills in generating combinations using nested loops.
- Practice string formatting and concatenation to create structured outputs.

**Instructions:**

Create a method that generates all unique combinations of three different digits (0-9) in ascending order. The combinations should be returned as a comma-separated string.

**Expected Method Signature:**
```java
public static String Combinations(){
    // Your code here
}
```

### 4. Pairs

**Learning Objectives:**

- Develop skills in generating pairs of numbers using nested loops.
- Practice string formatting and concatenation to create structured outputs.

**Instructions:**

Create a method that generates all possible pairs of two-digit numbers (00-99). Each number in the pair should be padded with a leading zero if it is less than 10. The pairs should be returned as a comma-separated string.

**Expected Method Signature:**
```java
public static String Pairs(){
    // Your code here
}
```

### 5. Atoi

**Learning Objectives:**

- Learn to convert a string representation of a number into an integer.
- Handle edge cases such as negative signs and non-numeric characters.

**Instructions:**

Create a method that takes a string representing a number and converts it into an integer. The method should handle leading '+' and '-' signs. If the string contains non-numeric characters, the method should return -1.

**Expected Method Signature:**
```java
public static int Atoi(String s){
    // Your code here
}
```

### 6. ChessBoard

**Learning Objectives:**

- Learn to generate sequences based on alternating patterns.
- Practice using boolean parameters to toggle between different outputs.

**Instructions:**

Create a method that takes a boolean parameter `col`. The method should return a string of either all black or all white squares on a chessboard, depending on the value of `col`. The squares should be returned in the format "a1, b2, c3,...".

**Expected Method Signature:**
```java
public static String ChessBoard(boolean col){
    // Your code here
}
```

### 7. Interest

**Learning Objectives:**

- Develop skills in calculating compound interest over time.
- Practice using loops to iterate until a condition is met.

**Instructions:**

Create a method that takes three parameters: `start` (initial amount), `finish` (target amount), and `interest` (interest rate). The method should return the number of years it takes for the initial amount to reach or exceed the target amount with the given interest rate. If the number of years exceeds 99, the method should return 0.

**Expected Method Signature:**
```java
public static int Interest(int start, int finish, double interest){
    // Your code here
}
```

## Example Usage

```java
public class Exam {
    public static void main(String[] args) {
        System.out.println(Accumulate(4)); // Example output: 10
        System.out.println(IsLeap(2000)); // Example output: true
        System.out.println(Combinations()); // Example output: "012, 013, 014, ..."
        System.out.println(Pairs()); // Example output: "00 01, 00 02, ..."
        System.out.println(Atoi("-12345")); // Example output: -12345
        System.out.println(ChessBoard(true)); // Example output: "a2, b1, c2, ..."
        System.out.println(Interest(1000.0f, 2000.0f, 0.05f)); // Example output: 15
    }
}
```