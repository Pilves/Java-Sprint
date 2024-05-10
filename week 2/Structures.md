# Java Programming Exercises

Welcome to the Java Programming Exercises! This repository contains a series of exercises designed to help you practice and enhance your Java programming skills. Each exercise focuses on different aspects of Java programming, such as creating and manipulating data structures. Let's get started!

## Exercises

### 1. New Struct

**Learning Objectives:**

- Understand how to compose data structures.
- Learn to create data structures using constructors.

**Instructions:**

You'll need to create a class called `Point`, which will contain the following fields (in the exact order):

- `x` - float
- `y` - float
- `text` - String

This class will represent text at a specific point (for example, on a graph or video game).

You will need to write a method that will return a newly created instance of this class with fields filled from the parameters provided.

**Expected Class and Method Signature:**
```java
public class Point {
    float x;
    float y;
    String text;
}
public Point(float x, float y, String text) {
    // Your code here
}
public Point makePoint(float x, float y, String text) {
// Your code here
}
```

### 2. Point Difference

**Learning Objectives:**

- Read data and manipulate data from structures.

**Instructions:**

Using the same `Point` class from the previous exercise, write a method that, given two `Point` objects, returns the one that is further ahead in the X/Y coordinates. If they are equal, return either.

**Expected Class and Method Signature:**
```java
public Point pointDifference(Point p1, Point p2) {
    // Your code here
}
```

### 3. Point Text

**Learning Objectives:**

- Read data and manipulate data from structures.
- Write data into structures and return them.

**Instructions:**

Again using the same `Point` class from the previous exercises, write a method that, given a `Point` object, returns a new one that includes the same coordinates as the one given, but has the text formatted in this way: "Text at (X, Y)" (with X and Y replaced with the actual coordinates).

**Allowed Packages:**

For this task, you're allowed to use:
- `java.lang.String`

**Expected Class and Method Signature:**
```java
public Point pointText(Point p) {
    // Your code here
}
```

### 4. Circle Result

**Learning Objectives:**

- Apply everything you learned from the previous tasks.

**Instructions:**

You'll need to create a new class. This will represent a circle and various properties of it.

The `Circle` class should include the following fields in the exact order:

- `radius` - float
- `diameter` - float
- `area` - float
- `perimeter` - float

The method, called `getCircle`, will take in the radius of the circle. It should return a new `Circle` with all the fields filled with the correct values from the radius given.

For π, you MUST use the value 3.14.

**Expected Class and Method Signature:**
```java
public class Circle {
    float radius;
    float diameter;
    float area;
    float perimeter;
}
public Circle getCircle(float radius) {
    // Your code here
}
```

