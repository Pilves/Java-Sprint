# Java Programming Exercises

Welcome to the Java Programming Exercises! This repository contains a series of exercises designed to help you practice and enhance your Java programming skills. Each exercise focuses on different aspects of Java programming, such as string manipulation, data transformation, and working with different data types. Let's get started!

## Exercises

### 1. Get First Rune

**Learning Objectives:**

- Gain proficiency in transforming data between different types.
- Learn how to manipulate strings to extract specific characters or substrings, enhancing your ability to work with text data.

**Instructions:**

Create a Java method that takes a non-empty string as input and returns the first character of the string as a character.

**Expected Method Signature:**
    
```java
public char getFirstRune(String s) {
// Your code here
}
```

### 2. Get Last Rune

**Learning Objectives:**

- Gain proficiency in transforming data between different types.
- Learn how to manipulate strings to extract specific characters or substrings, enhancing your ability to work with text data.

**Instructions:**

Create a Java method that takes a non-empty string as input and returns the last character of the string as a character.

**Expected Method Signature:**
```java
public char getLastRune(String s) {
// Your code here
}
```

### 3. Nth Rune

**Learning Objectives:**

- Gain proficiency in transforming data between different types.
- Learn how to manipulate strings to extract specific characters or substrings, enhancing your ability to work with text data.

**Instructions:**

Create a Java method that takes a non-empty string as its first argument and an index as its second argument. The method should return the character at the specified index in the string.

**Expected Method Signature:**
```java
public char nRune(String s, int i) {
// Your code here
}
```

### 4. Str Length

**Learning Objectives:**

- Develop the ability to work with strings, including counting characters and bytes.
- Gain an understanding of character encoding schemes, with a specific focus on UTF-8 encoding and how it impacts the length of strings.

**Instructions:**

Create a Java method that accepts a string and returns two integers. The first integer represents the number of characters in the string, and the second integer represents the byte length of the string. The method should handle UTF-8 encoding for all characters.

**Expected Method Signature:**
```java
public int[] strLength(String s) {
// Your code here
}
```

### 5. Str Reverse

**Learning Objectives:**

- Develop proficiency in manipulating strings, such as reversing their content, which is a common operation in text processing.

**Instructions:**

Create a Java method that takes a string and returns the reversed version of that string.

**Expected Method Signature:**
```java
public String strReverse(String s) {
// Your code here
}
```

### 6. Is Lower?

**Learning Objectives:**

- Develop the skill of validating data to determine if it meets specific criteria or conditions.
- Practice using conditional statements to make decisions in your code based on data characteristics.
- Learn how to process and analyze strings effectively, enabling you to check and manipulate the contents of text data.
- Understand how to return boolean values from methods to indicate whether certain conditions are met or not.

**Instructions:**

Create a Java method that takes a string as its parameter. The method should return true if the string contains only lowercase characters, and false otherwise.

**Expected Method Signature:**
```java
public boolean isLower(String s) {
// Your code here
}
```

### 7. Is Numeric?

**Learning Objectives:**

- Develop the skill of validating data to determine if it meets specific criteria or conditions.
- Practice using conditional statements to make decisions in your code based on data characteristics.
- Learn how to process and analyze strings effectively, enabling you to check and manipulate the contents of text data.
- Understand how to return boolean values from methods to indicate whether certain conditions are met or not.

**Instructions:**

Create a Java method that takes a string as its parameter. The method should return true if the string contains only numeric characters, and false otherwise.

**Expected Method Signature:**
```java
public boolean isNumeric(String s) {
// Your code here
}
```

### 8. To Upper Case

**Learning Objectives:**

- Practice manipulating strings to achieve desired changes, enhancing your ability to work with text data.

**Instructions:**

Create a Java method that takes a string as its parameter and returns a new string with each letter capitalized.

**Expected Method Signature:**
```java
public String toUpperCase(String s) {
// Your code here
}
```

### 9. To Capital Case

**Learning Objectives:**

- Practice manipulating strings to achieve desired changes, enhancing your ability to work with text data.

**Instructions:**

Create a Java method that takes a string as its parameter. The method should capitalize the first letter of each word while converting the rest of the word to lowercase. In this task, a word is defined as a sequence of alphanumeric characters.

**Expected Method Signature:**
```java
public String toCapitalCase(String s) {
// Your code here
}
```

### 10. Str Concat With

**Learning Objectives:**

- Develop the skill to aggregate or combine data from different sources or elements, such as joining multiple strings into one.
- Gain proficiency in manipulating strings to create meaningful compositions, such as combining and separating them based on a specific pattern or delimiter.
- Learn how to effectively handle input parameters, such as slices and separator strings, and use them to produce desired output.
- Practice working with delimiters or separators to format data or text in a specific way, enhancing your ability to manage data structures and text output.

**Instructions:**

Create a Java method that takes a list of strings and a separator string as its parameters. The method should return a new string by concatenating all the strings in the list, with each string separated by the provided separator.

**Expected Method Signature:**
```java
public String strConcatWith(List<String> strings, String separator) {
// Your code here
}
```

### 11. Split on Whitespaces

**Learning Objectives:**

- Develop the ability to parse and extract information from strings based on specific delimiters or separators.
- Gain proficiency in working with string lists to store and manage collections of words or elements from a text.
- Practice handling and processing different types of whitespace characters, such as spaces, tabs, and newlines, in text data.

**Instructions:**

Create a Java method that takes a string as its parameter. The method should split the string into words and store them in a list of strings. Words are separated by spaces, tabs, and newlines.

**Expected Method Signature:**
```java
public List<String> splitOnWhitespaces(String s) {
// Your code here
}
```

### 12. Str Split By

**Learning Objectives:**

- Develop the ability to parse and extract information from strings based on specific delimiters or separators.
- Gain proficiency in working with string lists to store and manage collections of words or elements from a text.
- Practice handling and processing different types of delimiters, such as characters or strings, used to separate parts of a text.

**Instructions:**

Create a Java method that takes a string `s` and a separator `sep` as parameters. The method should split the string `s` into substrings using the separator `sep` and return a list of strings containing the resulting substrings.

**Expected Method Signature:**
```java
public List<String> strSplitBy(String s, String sep) {
// Your code here
}
```

### 13. Substring Index

**Learning Objectives:**

- Enhance your capacity to think algorithmically, enabling you to devise step-by-step procedures to solve a wide range of computational problems.
- Gain proficiency in manipulating data, allowing you to perform operations like searching, extracting, and indexing data elements in various data structures.
- Practice using conditional statements to make decisions in your code, ensuring that it responds appropriately to different cases and conditions.

**Instructions:**

Create a Java method that behaves like the `indexOf` method. It takes two strings as input: `s` and `toFind`. The method should find the index of the first occurrence of `toFind` in `s` and return that index as an integer. If `toFind` is not present in `s`, the method should return -1.

**Expected Method Signature:**
```java
public int substringIndex(String s, String toFind) {
// Your code here
}
```

### 14. Str Compare

**Learning Objectives:**

- Enhance your problem-solving skills and the ability to design algorithms for comparing and evaluating data efficiently.
- Gain proficiency in working with data, specifically strings, and using comparison methods to understand their relationships.

**Instructions:**

Create a Java method that mimics the behavior of the `compareTo` method. It takes two strings, `a` and `b`, as input and returns an integer. The method should compare the two strings and return:
- 0 if the strings are equal,
- -1 if `a` comes before `b` in lexicographic order,
- 1 if `a` comes after `b` in lexicographic order.

**Expected Method Signature:**
```java
public int strCompare(String a, String b) {
// Your code here
}
```

### 15. Number to Base

**Learning Objectives:**

- Develop the ability to convert numbers from one base to another using specified characters, enhancing your understanding of numerical representation.
- Learn how to validate input data, especially the base, to ensure it meets specific criteria or conditions and handle invalid input gracefully.
- Gain proficiency in manipulating strings to construct representations of numbers in various bases and handle different types of characters.

**Instructions:**

Create a Java method that takes an integer `n` and a string `base` as parameters. The method should return the integer `n` represented in the specified base as a string.

**Validity rules for the base:**
- The base must contain at least 2 unique characters.
- The base should not contain the characters `+` or `-`.
- The method should handle negative numbers as well. If the base is not valid, the method should return "NV" (Not Valid).

**Expected Method Signature:**
```java
public String nbrBase(int n, String base) {
// Your code here
}
```

### 16. Convert Any to Decimal

**Learning Objectives:**

- Develop the ability to convert numbers from one base to another using specified characters, enhancing your understanding of numerical representation.
- Learn how to validate input data, especially the base, to ensure it meets specific criteria or conditions and handle invalid input gracefully.
- Gain proficiency in manipulating strings to extract and process numeric values represented in different bases.

**Instructions:**

Create a Java method that takes two parameters:
- `s`: a numeric string in a specific base.
- `base`: a string containing unique characters representing the available digits in that base.

The method should return the integer value of `s` in the given base. If the base is not valid, it returns 0.

**Validity rules for the base:**
- The base must contain at least 2 unique characters.
- The base should not contain the characters `+` or `-`.
- The method only works with valid string numbers that consist of elements present in the base. It does not handle negative numbers.

**Allowed packages:**
- `math`
- `strings`

**Expected Method Signature:**
```java
public int convertAnyToDec(String s, String base) {
// Your code here
}
```

### 17. Convert Any to Any

**Learning Objectives:**

- Develop the ability to convert numeric values between different bases, understanding the concepts and logic involved in base conversion.
- Learn to design and implement an efficient algorithm for converting numbers between bases, considering the positional value system.

**Instructions:**

Create a Java method that takes three string arguments: `nbr` representing a numeric value in a specific base `baseFrom`, and `baseTo` representing the desired base for the returned value. The method should convert the `nbr` from `baseFrom` to `baseTo` and return the result as a string.

**Allowed packages:**
- `math`
- `strings`

**Expected Method Signature:**
```java
public String convertAnyToAny(String nbr, String baseFrom, String baseTo) {
// Your code here
}
```
## Example Usage

```java
public static void main(String[] args) {
    System.out.println(GetFirstRune("kood/Jõhvi"));
    // Example output: 'k'

    System.out.println(GetLastRune("kood/Jõhvi"));
    // Example output: 'i'

    System.out.println(NRune("kood/Jõhvi", 3));
    // Example output: 'd'

    System.out.println(Arrays.toString(StrLength("Hello World!")));
    // Example output: [12, 12]

    System.out.println(StrReverse("Hello World!"));
    // Example output: "!dlroW olleH"

    System.out.println(IsLower("hello"));
    // Example output: true

    System.out.println(IsLower("hello!"));
    // Example output: false

    System.out.println(IsNumeric("010203"));
    // Example output: true

    System.out.println(IsNumeric("01,02,03"));
    // Example output: false

    System.out.println(ToUpperCase("Hello! How are you?"));
    // Example output: "HELLO! HOW ARE YOU?"

    System.out.println(ToCapitalCase("Hello! How are you? How+are+things+4you?"));
    // Example output: "Hello! How Are You? How+Are+Things+4you?"

    String[] toConcat = {"Hello!", " How", " are", " you?"};
    System.out.println(StrConcatWith(toConcat, ":"));
    // Example output: "Hello!: How: are: you?"

    System.out.println(Arrays.toString(SplitWhitespaces("Hello how are you?")));
    // Example output: ["Hello", "how", "are", "you?"]

    String s = "HelloHAhowHAareHAyou?";
    System.out.println(Arrays.toString(StrSplitBy(s, "HA")));
    // Example output: ["Hello", "how", "are", "you?"]

    System.out.println(SubstrIndex("Hello!", "l"));
    // Example output: 2

    System.out.println(SubstrIndex("Salut!", "alu"));
    // Example output: 1

    System.out.println(SubstrIndex("Ola!", "hOl"));
    // Example output: -1

    System.out.println(StrCompare("Hello!", "Hello!"));
    // Example output: 0

    System.out.println(StrCompare("Salut!", "lut!"));
    // Example output: -1

    System.out.println(StrCompare("Ola!", "Ol"));
    // Example output: 1

    System.out.println(NbrBase(125, "0123456789"));
    // Example output: "125"

    System.out.println(NbrBase(-125, "01"));
    // Example output: "-1111101"

    System.out.println(NbrBase(125, "0123456789ABCDEF"));
    // Example output: "7D"

    System.out.println(NbrBase(-125, "choumi"));
    // Example output: "-uoi"

    System.out.println(NbrBase(125, "aa"));
    // Example output: "NV"

    System.out.println(ConvertAnyToDec("125", "0123456789"));
    // Example output: 125

    System.out.println(ConvertAnyToDec("1111101", "01"));
    // Example output: 125

    System.out.println(ConvertAnyToDec("7D", "0123456789ABCDEF"));
    // Example output: 125

    System.out.println(ConvertAnyToDec("uoi", "choumi"));
    // Example output: 125

    System.out.println(ConvertAnyToDec("bbbbbab", "-ab"));
    // Example output: 0

    System.out.println(ConvertAnyToAny("101011", "01", "0123456789"));
    // Example output: "43"
}
```