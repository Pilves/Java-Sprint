# Java Exercises and Tasks

This document describes a series of tasks and exercises implemented in Java. Each section explains a specific function, detailing its purpose, expected inputs, and outputs.

## IsNegative
- **Purpose**: Determines if a given integer is negative.
- **Inputs**: `int n`
- **Returns**: `boolean` - `true` if `n` is negative, `false` otherwise.

## IntVsFloat
- **Purpose**: Compares an integer and a float and returns a string indicating which is greater or if they are the same.
- **Inputs**: `int i`, `float f`
- **Returns**: `String` - "Integer" if `i` is greater, "Float" if `f` is greater, or "Same" if they are equal.

## Season
- **Purpose**: Returns the season name based on the input month.
- **Inputs**: `String month`
- **Returns**: `String` - "winter", "spring", "summer", "autumn", or "invalid input: [month]" if the month is not recognized.

## Accumulate
- **Purpose**: Calculates the sum of all integers from 0 to `n`.
- **Inputs**: `int n`
- **Returns**: `int` - The sum from 0 to `n`. Returns 0 if `n` is negative.

## BetweenLimits
- **Purpose**: Returns a string containing all characters between two specified characters in the alphabet.
- **Inputs**: `char from`, `char to`
- **Returns**: `String` - Contains all characters between `from` and `to` in the alphabet.

## Doop
- **Purpose**: Performs an arithmetic operation between two integers based on the specified operator.
- **Inputs**: `int a`, `String op`, `int b`
- **Returns**: `int` - The result of the operation. Returns 0 for invalid inputs or operations that cannot be performed, such as division by zero.

## IsLeapYear
- **Purpose**: Determines if the specified year is a leap year.
- **Inputs**: `int year`
- **Returns**: `boolean` - `true` if the year is a leap year, `false` otherwise.

## CountDivisible
- **Purpose**: Counts numbers within a specified range that are divisible by a given divisor, checking every `step` numbers.
- **Inputs**: `int from`, `int to`, `int step`, `int divisor`
- **Returns**: `int` - The count of numbers divisible by the divisor.

## FindDividend
- **Purpose**: Finds the first number within a specified range that is divisible by a given divisor.
- **Inputs**: `int from`, `int to`, `int divisor`
- **Returns**: `int` - The first number divisible by `divisor` within the range, or -1 if no such number exists.

