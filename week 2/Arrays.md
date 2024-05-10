# Java Programming Exercises

Welcome to the Java Programming Exercises! This repository contains a series of exercises designed to help you practice and enhance your Java programming skills. Each exercise focuses on different aspects of Java programming, such as conditional statements, data manipulation, and working with various data structures. Let's dive in!

## Exercises

### 1. Generate Range

**Learning Objectives:**

- Practice using conditional statements to handle varying input or conditions.
- Gain proficiency in manipulating data to create sequences or ranges of values.
- Learn to work with data structures like arrays to represent and manage collections of data efficiently.

**Instructions:**

Write a Java method that takes two integers, `min` and `max`, as input. The method should return an array of integers containing all values between `min` (inclusive) and `max` (exclusive). If `min` is greater than or equal to `max`, the method should return `null`.

**Expected Method Signature:**
```java
public int[] generateRange(int min, int max) {
    // Your code here
}
```
### 2. Remove Elements in Range

**Learning Objectives:**

- Apply conditional statements to handle indices that can be negative or larger than the array length.
- Handle edge cases by addressing indices that are out of bounds or negative.
- Develop skills in removing elements from an array within a specified range.

**Instructions:**

Write a Java method that takes an array of `double`, two indices, and removes elements that lie between these indices from the array. The lower index should be removed, and the upper index should be kept. The method should return the resulting modified array. The indices can be negative or larger than the length of the array, and they might be in the wrong order.

**Expected Method Signature:**

```java
public double[] removeElementsInRange(double[] arr, int from, int to) {
    // Your code here
}
```

### 3. Balance Out

**Learning Objectives:**

- Apply conditional statements to balance the counts of boolean values.
- Enhance logical thinking and understanding of boolean logic and array manipulation.

**Instructions:**

Write a Java method that takes an array of booleans and adds the minimum number of booleans necessary to balance the count of `true` and `false` values in the array. The method should return the resulting modified array. New elements should be added at the end of the array.

**Expected Method Signature:**
```java
public boolean[] balanceOut(boolean[] arr) {
    // Your code here
}
```

### 4. Filter by Sum

**Learning Objectives:**

- Use conditional statements and loops to filter subarrays based on the sum of their elements.
- Filter subarrays based on a specific condition, which is valuable for data processing and manipulation.
- Enhance logical thinking and understanding of array manipulation.

**Instructions:**

Write a Java method that takes a 2D array of integers and an integer value. The method should filter out all subarrays from the 2D array where the sum of elements is lower than the given value. The resulting modified 2D array should be returned.

**Expected Method Signature:**
```java
public int[][] filterBySum(int[][] arr, int sum) {
    // Your code here
}
```

### 5. Sort Integer Table

**Learning Objectives:**

- Develop proficiency in sorting data structures, specifically an array of integers.
- Gain experience in modifying data structures in place to achieve the desired result.

**Instructions:**

Write a Java method that sorts an array of integers in ascending order.

**Expected Method Signature:**
```java
public int[] sortIntegerTable(int[] table) {
// Your code here
}
```

### 6. Bulk Atoi

**Learning Objectives:**

- Use the `Atoi` function you previously created as part of a larger task, demonstrating how functions can be composed for more complex functionality.
- Promote modular programming, a best practice for code organization and reusability.
- Understand how to manipulate data structures, such as arrays, which is essential for various data processing tasks.

**Instructions:**

Write a Java method that takes an array of strings, applies a `strToInt` method to every element in the array, and returns the resulting integer values as a new array. Note that you cannot call the `strToInt` method from the package in our current learning environment; you have to copy-paste the method instead.

**Expected Method Signature:**
```java
public int[] bulkAtoi(String[] arr) {
// Your code here
}

// Example strToInt method
int strToInt(String str) {
    // Conversion logic here
}
```

### 7. Combination of N

**Learning Objectives:**

- Practice working with loops and combinatorics to generate number combinations.
- Gain experience in optimizing code for efficiency and performance.

**Instructions:**

Write a Java method that generates all possible combinations of ascending digits of length `n`.

**Expected Method Signature:**
```java
public List<String> combN(int n) {
// Your code here
}
```

## Example Usage

```java
    public static void main(String[] args) {
        System.out.println(Arrays.toString(GenerateRange(5, 10)));
        // Example output: [5, 6, 7, 8, 9]

        System.out.println(Arrays.toString(GenerateRange(10, 5)));
        // Example output: []

        System.out.println(Arrays.toString(RemoveElementsInRange(new float[]{10.0f, 0.8f, -0.4f, 20.0f, 7.7f, 3.0f}, 4, 1)));
        // Example output: [10.0, 7.7, 3.0]

        System.out.println(Arrays.toString(BalanceOut(new boolean[]{true, false, false, false})));
        // Example output: [true, false, false, false, true, true]

        int[][] filtered = FilterBySum(new int[][]{{1, 2, 3}, {2, 3, 4}, {3, 4, 5}}, 9);
        for (int[] arr : filtered) {
            System.out.println(Arrays.toString(arr));
        }
        // Example output: [[2, 3, 4], [3, 4, 5]]

        System.out.println(Arrays.toString(SortIntegerTable(new int[]{5, 4, 3, 2, 1, 0})));
        // Example output: [0, 1, 2, 3, 4, 5]

        System.out.println(Arrays.toString(BulkAtoi(new String[]{"8", "kood", "-13"})));
        // Example output: [8, 0, -13]

        System.out.println(Arrays.toString(CombN(1)));
        // Example output: ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]

        System.out.println(Arrays.toString(CombN(3)));
        // Example output: ["012", "013", "014", "015", "016", "017", "018", ..., "679", "689", "789"]

        System.out.println(Arrays.toString(CombN(9)));
        // Example output: ["012345678", "012345679", ..., "123456789"]
    }
```