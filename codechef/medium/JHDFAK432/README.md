# JHDFAK432

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Greeting Based on Age Group

In this example, we demonstrate how to use an  **if-else if**  statement to determine a person's age category based on a predefined  **age**  value. This method helps in understanding conditional execution in Java.

 **When executed, the code will show:** 

```
You are a teenager.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-02T16:04:36.491Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Initialize the variable 'age' with a predefined value of 16
        int age = 16; 

        // Check if the age is less than 13
        if (age < 13) {
            System.out.println("You are a child."); 
        } 
        // Check if the age is between 13 and 19 (inclusive)
        else if (age <= 19) { // Teenagers fall into this category
            System.out.println("You are a teenager."); 
        } 
        // If the age is greater than 19
        else {
            System.out.println("You are an adult."); 
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/JHDFAK432)