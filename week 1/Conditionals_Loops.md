# Java Programming Exercises

Welcome to the Java Programming Exercises! This repository contains a series of exercises designed to help you practice and enhance your Java programming skills. Each exercise focuses on different aspects of Java programming, such as handling data types, evaluating conditions, and working with loops. Let's get started!

## Exercises

### 1. Is Negative?

**Learning Objectives:**

- Develop the skill of handling and evaluating different data types, such as integers and boolean values, to make informed decisions in your code.

**Instructions:**

Create a Java method that takes an integer as input and returns a boolean value (true or false) to indicate whether the input integer is negative or not.

**Expected Method Signature:**
```java
public boolean isNegative(int n){
    // Your code here
}
```
### 2. Int vs Float

**Learning Objectives:**

- Learn how to convert data types.
- Reinforce your understanding of conditional logic (if-else) for decision-making.
- Enhance your skills in numerical comparisons and handling different data types.

**Instructions:**

Write a Java method that takes an integer and a float as input and returns a string. The method should compare the integer to the float and return one of the following: "Integer" if the integer is larger, "Float" if the float is larger, or "Same" if they are equal.

**Expected Method Signature:**
```java
public String intVsFloat(int i, float f){
    // Your code here
}
```

### 3. Season

**Learning Objectives:**

- Develop the skill of using the switch statement in Java to efficiently handle multiple cases based on the value of an expression.
- Practice returning informative error messages when dealing with invalid or unexpected input, enhancing the robustness of your code.
- Learn to structure your code logically, making it more organized and readable, which is particularly relevant when working with multiple cases or conditions.

**Instructions:**

Create a Java method that takes a string containing a month name. If a valid month name is given, the method should return the season. Otherwise, it should return "invalid input: " with the input appended to it.

**Months:**
```sh
- Winter: Jan, Feb, Dec
- Spring: Mar, Apr, May
- Summer: Jun, Jul, Aug
- Autumn: Sep, Oct, Nov
```

**Expected Method Signature:**
```java
public String season(String month){
    // Your code here
}
```

### 4. Accumulate

**Learning Objectives:**

- Develop the ability to use loops, such as for loops, to iterate through sequences of data, perform calculations, and manage program flow efficiently.
- Gain proficiency in using conditional statements, like if statements, to make decisions and handle different cases, ensuring that your code responds appropriately to varying input or conditions.

**Instructions:**

Create a Java method that takes a non-negative integer `n`. If `n` is positive, return the sum of all the digits from 0 to `n`, including `n` itself. If `n` is negative, return 0.

**Expected Method Signature:**
```java
public int accumulate(int n){
    // Your code here
}
```

### 5. Between Limits

**Learning Objectives:**

- Develop a solid understanding of working with characters in Java, including comparing, extracting, and modifying them effectively.
- Gain expertise in building and manipulating strings in Java, with the ability to construct strings containing a range of characters to meet specific requirements.
- Practice processing input characters in a way that accommodates different orders or variations, ensuring that the method works correctly for various scenarios.
- Gain proficiency in using loops or iterations to generate sequences of characters between two input characters, demonstrating control over the process.

**Instructions:**

Build a method that accepts two characters as input and returns a string containing all the characters that come between these two characters in the alphabet, in the correct order.

**Expected Method Signature:**
```java
public String betweenLimits(char from, char to){
    // Your code here
}
```

### 6. Do Operation

**Learning Objectives:**

- Gain proficiency in creating methods to perform mathematical operations.
- Learn to handle and validate user inputs, such as operators and values.
- Understand error handling for division by 0 and invalid operations.

**Instructions:**

Create a Java method called `doOperation`. This method takes three parameters:
- An integer `a`
- An operator, which can be one of the following: +, -, /, *, %
- Another integer `b`

In case of an invalid operator, invalid values, or division by 0, the method should return 0.

**Expected Method Signature:**
```java
public int doop(int a, String op, int b){
    // Your code here
}
```

### 7. Is Leap Year?

**Learning Objectives:**

- Writing a method that returns a boolean value is a fundamental skill for implementing conditions in programming.
- Creating a method for this specific task promotes modular programming, which is important for code organization and reusability.
- Understanding the mathematical rules for leap years (divisibility by 4, except for certain conditions) requires applying mathematical logic in programming.
- Determining whether a year is a leap year or not is a problem-solving task, and learning to tackle such problems is essential in software development.

**Instructions:**

Write a Java method that takes an integer representing a year and returns a boolean value indicating whether that year is a leap year or not. A leap year is a year that is evenly divisible by 4, except for years that are divisible by 100 but not by 400.

**Expected Method Signature:**
```java
public boolean isLeapYear(int year){
    // Your code here
}
```

### 8. Count Divisible

**Learning Objectives:**

- This task will teach you how to handle exceptions or edge cases where certain input conditions must be met.
- Reinforces your ability to use loops and iteration to traverse a range of numbers, taking into account a step value.
- You will apply conditional logic within the loop.

**Instructions:**

Write a Java method that takes four integers as input: `from`, `to`, `step`, and `divisor`. The method should check for exceptions and return 0 if any of the following conditions are met:
- `step` is negative or zero.
- `divisor` is zero.

Otherwise, it should loop through the range of numbers from `from` (inclusive) to `to` (exclusive), checking every `step`-th element, and return the count of elements among these that are divisible by the `divisor`.

**Expected Method Signature:**
```java
public int countDivisible(int from, int to, int step, int divisor){
    // Your code here
}
```

### 9. Find Dividend

**Learning Objectives:**

- This task will provide practical experience in using loops to iterate through a range of numbers, which is a fundamental programming concept.
- You'll apply conditional logic within the loop to determine if a number is divisible by the given divisor.
- Dealing with scenarios where there might be no divisible number and returning -1 demonstrates how to handle edge cases and provide appropriate outputs.

**Instructions:**

Write a Java method that takes three integers as input: `from`, `to`, and `divisor`. The method should loop through the numbers from `from` (inclusive) to `to` (exclusive) and return the first number in that range that is divisible by the `divisor`. If there is no such number, the method should return -1.

**Expected Method Signature:**
```java
public int findDividend(int from, int to, int divisor){
    // Your code here
}
```
## Example Usage
```java
public static void main(String[] args){
        System.out.println(IsNegative(6)); // false
        System.out.println(IntVsFloat(5,8.8f)); // Float
        System.out.println(Season("feb")); // winter
        System.out.println(Accumulate(4)); // 10
        System.out.println(BetweenLimits('j','f')); // ghi
        System.out.println(Doop(5,"+",3)); // 8
        System.out.println(IsLeapYear(2020)); // true
        System.out.println(CountDivisible(5,17,2,3)); // 2
        System.out.println(FindDivident(5,17,4)); // 8
        System.out.println(ReverseAlphabetValue('a')); // z
    }
```