# Java Programming Exercises

Welcome to the Java Programming Exercises! This repository contains a series of exercises designed to help you practice and enhance your Java programming skills. Each exercise focuses on different aspects of Java programming, such as managing variables, type casting, and string manipulation. Let's get started!

## Exercises

### 1. Abacus

**Objective:**
Dive into Java by understanding the structure of functions, managing variables, returning values, and more.

**Learning Objectives:**

- Understand the structure of functions in Java.
- Manage and manipulate values stored in variables.
- Use the return statement effectively.
- Test and debug your code for any issues.

**Instructions:**

Write a function that takes two integer (int) values as input and returns the result of integer division of the first value by the second.

**Expected Method Signature:**
```java
public int abacus(int a, int b){
    // Your code here
}
```

### 2. Mean

**Learning Objectives:**

- Understand the structure of functions.
- Ability to work with values stored in the variables.
- Understand float data types and how to perform arithmetic operations on them.

**Instructions:**

Write a function that takes three float values as input and returns their mean as a float value.

**Expected Method Signature:**
```java
public float mean(float a, float b, float c){
    // Your code here
}
```

### 3. Casting

**Learning Objectives:**

- Gain proficiency in type casting by successfully converting a float to an int, ensuring that fractional parts are rounded appropriately.
- Develop an understanding of rounding techniques, including rounding to the nearest integer, and implement this logic accurately within the function.

**Instructions:**

Write a function that accepts a double value, rounds it to the nearest integer, and then returns the result as an int.

**Allowed Packages:**
For this task you're allowed to use:
- `java.lang.Math`

**Expected Method Signature:**
```java
public int casting(double n){
    // Your code here
}
```

### 4. Shift By

**Learning Objectives:**

- Learn how to work with characters in Java, including extracting, modifying, and returning characters to achieve the desired shift.
- Develop the ability to create a well-structured Java function that takes input parameters, performs operations on them, and returns the desired result.
- Practice handling edge cases, such as ensuring that the function works correctly with lowercase letters and correctly loops back to the start of the alphabet if the step value exceeds 26.

**Instructions:**

Create a function that takes a single lowercase letter as a character and an int 'step.' The function should shift the letter in the alphabet by the specified 'step' value and return the resulting letter. For example, if you shift 'a' by 4 steps, it should become 'e.' Remember to handle looping back to the start of the alphabet if needed. Only lowercase characters are tested.

**Expected Method Signature:**
```java
public char shiftBy(char r, int step){
    // Your code here
}
```

### 5. String Concatenation

**Learning Objectives:**

- Gain proficiency in working with strings in Java, including techniques to concatenate and manipulate them effectively.
- Develop the ability to design and create a Java function that accepts input parameters, performs string operations, and returns a meaningful result.

**Instructions:**

Create a function that takes two strings and a delimiter. The function should combine the two strings, placing the delimiter between them, and return the combined result as a single string.

**Expected Method Signature:**
```java
public String strConcat(String a, String b, String delim){
    // Your code here
}
```

### 6. Reverse Alphabet Value

**Learning Objectives:**

- Gain experience in manipulating characters in Java, a fundamental skill for text processing.
- This task requires you to think creatively to achieve the desired transformation. Problem-solving is a crucial skill for software development and programming.

**Instructions:**

Write a function that takes a lowercase letter character ('a'-'z') as input and returns its reverse letter in the Latin alphabet as a character. For example, 'a' should be transformed to 'z', 'y' should become 'b', and so on. The function should maintain the case of the input letter.

**Expected Method Signature:**
```java
public char reverseAlphabetValue(char ch){
    // Your code here
}
```
## Example Usage
```java
public static void main(String[] args) {
    System.out.println(Abacus(8, 3)); // 2
    System.out.println(Mean(1.15f,2.8f,3.5f)); // 2.5
    System.out.println(Casting(1.15f)); // 1
    System.out.println(ShiftBy('a', 4)); // e
    System.out.println(strConcat("Hello", "World", ",")); // Hello, World
    System.out.println(reverseAlphabetValue('a')); // z
}
```