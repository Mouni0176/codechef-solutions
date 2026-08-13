# OPJA168

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Rectangle Area Calculation with Exception Handling

You are tasked with creating a Java program that calculates the area of a rectangle using user-provided length and width values. Your program should handle exceptions for invalid input, such as negative values, non-integer values, or non-numeric input.

 **Program Requirements:** 

- Create a Java program that performs the following tasks: take the length and width of a rectangle as input. Ensure that the input values are valid integers and that both length and width are positive values. Calculate the area of the rectangle using the formula: Area = Length * Width.
- Implement exception handling in your program to address the following scenarios: Negative Values Exception: If either the length or width entered by the user is negative, your program should throw an IllegalArgumentException exception with the message "Invalid Argument: Length and width must be positive values." Non-Integer Input Exception: If the user enters a non-integer value (e.g., a floating-point number or a character), and the input cannot be converted to an integer, your program should throw an IllegalArgumentException exception with the message "Invalid Argument: Length and width must be integers." Unknown Exception: Catch any other exceptions that may occur and display an error message: "An unknown error occurred."
- Display the calculated area of the rectangle if the input is valid and handle exceptions appropriately.
### Task

Complete the code to ensure that your program gracefully handles exceptions and provides meaningful error messages.

### Input Format

First line contain two integers representing the length and breadth of rectangle respectively.

### Output Format

Print the area of the rectangle or error message if invalid input is provided.

### Sample 1:
Input
Output

```
-5 4
```

```
Invalid Argument: Length and width must be positive values.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T15:55:51.613Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length, width;

        try {
            if (!scanner.hasNextInt()) {
                throw new IllegalArgumentException("Invalid Argument: Length and width must be integers.");
            }
            length = scanner.nextInt();

            if (!scanner.hasNextInt()) {
                throw new IllegalArgumentException("Invalid Argument: Length and width must be integers.");
            }
            width = scanner.nextInt();

            // Check for negative values
            if (length < 0 || width < 0) {
                throw new IllegalArgumentException("Invalid Argument: Length and width must be positive values.");
            }

            // Calculate the area of the rectangle
            int area = length * width;

            // Display the result
            System.out.println("Area: " + area);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An unknown error occurred.");
        } finally {
            scanner.close();
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/OPJA168)