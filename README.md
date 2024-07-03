Find Max Sum of Digits
This is a Java program that finds the largest sum of digits within a string in an array of strings.

Problem Statement
Given an array of strings, each made up of a combination of letters and digits, write the functionality to find and return the largest sum of digits within a string.

Notes
Each digit should be considered its own 1-digit number (e.g., in the string "h1n36mfl", 36 is evaluated as 3 and 6 separately).
The input arrays can vary in length; however, they will not be larger than 10 strings.
Strings can vary in length; however, they will not be larger than 12 characters.
Example
Input: ["dh7js4jf", "or2rjvn2w", "h1n36mfl", "a7e6fw"]
Sums: 11, 4, 10, 13 respectively
Output: 13
Implementation
The Java implementation of the solution is provided in the FindMaxSum.java file. Here's how the code works:

The findMaxSum method takes an array of strings arr as input.
It initializes a variable maxSum to keep track of the largest sum of digits found so far.
It iterates through each string str in the input array.
For each string, it initializes a variable currentSum to keep track of the sum of digits in that string.
It converts the string to a character array and iterates through each character c.
For each character c, it checks if it's a digit using Character.isDigit(c).
If c is a digit, it gets its numeric value using Character.getNumericValue(c) and adds it to currentSum.
After going through all characters in the string, it updates maxSum with the maximum of maxSum and currentSum using Math.max(maxSum, currentSum).
After going through all strings in the input array, it returns the final value of maxSum.
The main method demonstrates the usage of the findMaxSum method with an example input array.

Assumptions and Design Choices
The input array will always contain strings.
The strings will only contain alphanumeric characters (letters and digits).
If a string doesn't contain any digits, its sum will be considered 0.
The method will handle empty strings and empty arrays gracefully (returning 0 for an empty array).
The method assumes that the input array and strings will not exceed the specified length limits.
