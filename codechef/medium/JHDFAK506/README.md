# JHDFAK506

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Validating User Input

In this example, we demonstrate how to take user valid input and ensure it falls within the range 1 to 100 using a while loop.

When executed, the code will prompt the user to enter a number. Based on the input, it will display:

### Sample 1:
Input
Output

```
-3
105
50
```

```
Invalid input! Please enter a number between 1 and 100.
Invalid input! Please enter a number between 1 and 100.
Valid number entered: 50
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-14T16:03:58.862Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        int number; // Declare a variable to store user input

        // Step 1: Input validation loop
        // Keeps prompting until a valid number (1-100) is entered
        while ((number = scanner.nextInt()) < 1 || number > 100) {
            System.out.println("Invalid input! Please enter a number between 1 and 100: ");
        }

        // Step 2: Display the valid input
        System.out.println("Valid number entered: " + number);

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/JHDFAK506)