# Java Programming Exercises

Welcome to the Java Programming Exercises! This repository contains a series of exercises designed to help you practice and enhance your Java programming skills. Each exercise focuses on different aspects of Java programming, such as loops, string manipulation, and data transformation. Let's get started!

## Exercises

### 1. Alphabet Mastery

**Learning Objectives:**

- Learn how to use loops or iteration to generate a sequence of letters, adapting the loop based on the input value.
- Gain proficiency in working with strings to construct a string of letters, using indexing and other string manipulation techniques.

**Instructions:**

Create a method that takes a positive integer as input and returns the corresponding number of letters from the Latin alphabet. The input integer won't be larger than the alphabet's length.

**Expected Method Signature:**
```java
public String alphabetMastery(int n){
    // Your code here
}
```

### 2. Reverse Alphabet

**Learning Objectives:**

- Learn to use loops or iteration constructs to generate sequences of data and adapt them based on input values.
- Practice using conditional statements to handle cases where the input step value is zero or negative, ensuring that the method handles these scenarios correctly.
- Understand how to design algorithms that manipulate and transform data, considering the problem's requirements and constraints.

**Instructions:**

Create a method that takes a step value `n` as input. Starting from 'z' in the Latin alphabet, it should return the lowercase alphabet in reverse order as a string. For each letter, you skip `n-1` letters. If `n` is 0 or negative, use a default step of 1.

**Expected Method Signature:**
```java
public String reverseAlphabet(int step){
    // Your code here
}
```

### 3. Pairs

**Learning Objectives:**

- Develop skills in working with strings, including formatting and concatenating strings to create structured outputs.
- Gain expertise in using loops to generate pairs or sequences of data and efficiently iterate through them.
- Enhance problem-solving skills by designing a solution to generate all possible pairs, demonstrating the ability to break down complex tasks into manageable steps.
- Learn how to represent and format data effectively, including considerations for padding numbers or applying other transformations as required.

**Instructions:**

Create a method that finds all possible combinations of two two-digit numbers. The pairs should be in ascending order, and each number should be padded with a leading zero if it's less than 10. The pairs should be separated by a comma and a space. Each number within a pair should be separated by a space. The method should return a string containing these pairs.

**Expected Method Signature:**
```java
public String pairs(){
    // Your code here
}
```

### 4. Combinations

**Learning Objectives:**

- Develop the ability to recognize and generate specific patterns in data, in this case, ascending triplets of digits.
- Gain proficiency in using loops to generate and iterate through sequences of data efficiently.
- Learn how to format strings by creating and concatenating unique triplets, understanding how to separate them as required.
- Practice using conditional statements to filter out specific combinations or patterns that don't meet the task's criteria.

**Instructions:**

Create a method that generates a series of unique triplets of digits. Each triplet should consist of different digits, and they should be in ascending order, from the smallest to the largest. The triplets should be separated by a comma and a space. For example, the method should return triplets like 012, 013, 014, 015.... Avoid combinations with all the same digits, like 000 or 999, and exclude triplets in descending order, like 987.

**Expected Method Signature:**
```java
public String combinations(){
    // Your code here
}
```

### 5. Countdown

**Learning Objectives:**

- Develop the skill of using loops, like for loops, to iterate through sequences of data, providing control over how data is processed and manipulated.
- Gain expertise in working with strings, including techniques to concatenate, modify, and manipulate strings effectively to achieve the desired outcomes.
- Practice using conditional statements, like if statements, to make decisions in your code. Understand how to control the flow of your program based on specific conditions or criteria.

**Instructions:**

Create a method that takes a one-digit integer as input and returns a countdown string. The countdown should start from the given number, skip every second number, and end with "0!". For example, if the input is 7, the method should return "7, 5, 3, 1, 0!".

**Expected Method Signature:**
```java
public String countdown(int n){
    // Your code here
}
```

### 6. AlphaNumber

**Learning Objectives:**

- Develop skills in transforming data between different types, such as converting integers to strings and mapping digits to letters.
- Gain expertise in working with strings, including replacing characters, preserving signs, and formatting strings based on specific rules.
- Practice using conditional statements to handle different cases, such as preserving the minus sign for negative numbers.
- Learn how to map numerical values to their corresponding alphabetic representations, which is a useful skill for various types of data mapping.

**Instructions:**

Create a method that takes an integer as input and returns a string representing that integer. If the number is negative, preserve the minus sign. Replace the digits with lowercase letters, where 0 becomes 'a', 1 becomes 'b', and so on up to 9, which becomes 'j'.

**Expected Method Signature:**
```java
public String alphaNumber(int n){
    // Your code here
}
```

### 7. Simple String to Integer

**Learning Objectives:**

- Develop the ability to convert data between different types, such as converting strings to integers or vice versa.
- Understand how to validate input data and handle potential errors or invalid data gracefully.
- Gain proficiency in working with strings, including extracting, modifying, or filtering characters as needed.
- Learn how to design algorithms for specific tasks, considering the problem's requirements and constraints.

**Instructions:**

Create a method that converts a valid string representation of a number into an integer. If the string is not a valid number, the method should return 0. The input will only contain one or more digits, and you don't need to handle signs like + or -.

**Expected Method Signature:**
```java
public int simpleStrToInt(String s){
    // Your code here
}
```

### 8. String to Integer

**Learning Objectives:**

- Develop the skill of converting data between different types, such as converting strings to integers, handling signs, and recognizing invalid input.
- Understand how to handle potential errors or non-valid input gracefully by returning a default value (0 in this case) instead of raising an error.
- Practice using conditional statements to make decisions in your code, especially when handling signs and different cases.
- Learn techniques for parsing and interpreting strings to extract meaningful information, such as numbers from mixed character strings.

**Instructions:**

Create a method that mimics the behavior of the `Atoi` function. `Atoi` converts a string representing a number into an integer.

The method should return the integer value. If the input string is not a valid number, it should return 0. The method must handle signs such as + or -. The exercise does not require you to return an error.

**Expected Method Signature:**
```java
public int strToInt(String s){
    // Your code here
}
```
## Example Usage
```java
    public static void main(String[] args){
    System.out.println(AlphabetMastery(6)); // abcdef
    System.out.println(ReverseAlphabet(5)); // zupkfa
    System.out.println(Pairs()); // "00 01, 00 02, 00 03, ..., 00 98, 00 99, 01 02, 01 03, ..., 97 98, 97 99, 98 99"
    System.out.println(Combinations()); // "012, 013, 014, ..., 689, 789"
    System.out.println(Countdown(7)); // 7, 5, 3, 1, 0!
    System.out.println(AlphaNumber(-1280)); // -bcia
    System.out.println(SimpleStrToInt("0000000012345")); // 12345
    System.out.println(StrToInt("-12345")); // -12345
    System.out.println(StrToInt("12345")); // 12345
    System.out.println(StrToInt("123 45")); // 0
    System.out.println(StrToInt("--12345")); // 0
}
```