# OPJA02

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Write your first class

Writing a class in Java involves defining the structure and behavior of objects based on the principles of object-oriented programming. Here's a step-by-step guide on how to write a basic class in Java:

This code demonstrates the basic structure of a Java program:

- A class named MyClass is defined. It contains: A private integer field privateValue. A public integer field publicValue. A public method publicFunction() (which currently does nothing).
- The Main class is defined, which contains the main method, the entry point of the program. Inside the main method: An object of the MyClass class is created using MyClass obj = new MyClass();. The public field publicValue of the MyClass object is assigned the value 10. The public method publicFunction() of the MyClass object is called (though it currently does nothing).

In summary, this code demonstrates the creation of a class (`MyClass`) with private and public members (fields and methods) and shows how to create an object of that class, access and modify its public members, and call its public methods from the `main` method.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-14T13:57:57.535Z  

```java
// Step 1: Define the class
class MyClass {
    // Step 2: Declare private members (fields)
    private int privateValue;

    // Step 3: Declare public members (fields and methods)
    public int publicValue;

    public void publicFunction() {
        // Your code for the public function goes here
    }
}

class Codechef {
    public static void main(String[] args) {
        // Step 4: Create an object of the class
        MyClass obj = new MyClass();

        // Step 5: Accessing and changing the object's public data
        obj.publicValue = 10;

        // Step 6: Use the object's public methods
        obj.publicFunction();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/OPJA02)