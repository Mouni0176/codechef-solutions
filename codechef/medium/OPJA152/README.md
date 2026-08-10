# OPJA152

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Employee Information

Create a Java program that models different types of employees using dynamic method dispatch. You should have a base class Employee and one derived class called Worker.

The Employee base class should have the following attributes and methods:

- name (a string)
- void displayInfo() - This method should be declared in the base class and should print the name of the employee.

The Worker class should inherit from Employee and have :

- hourlyRate (an integer)
- displayInfo() - method on each worker to display their information.
### Task

Your program should take the name and hourly rate of worker as input and then create instance of Worker with this input. Use dynamic method dispatch to call the displayInfo() method on worker to display their information by creating pointer to employee class.

### Input Format
- First line contain a string representing name of worker.
- Second line contain an integer representing rate of worker.
### Output Format

Use dynamic method dispatch to call the displayInfo() method on worker to display their information.

### Sample 1:
Input
Output

```
Tom 
4
```

```
Name: Tom
Hourly Rate: $4

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-10T16:59:31.868Z  

```java
import java.util.Scanner;

class Employee {
    protected String name;

    Employee(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
    }
}

class Worker extends Employee {
    private int hourlyRate;

    Worker(String name, int hourlyRate) {
        super(name);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the base class method
        System.out.println("Hourly Rate: $" + hourlyRate);
    }
}

class Codechef {
    public static void main(String[] args) {
        // Write your code here
        Employee e = new Worker("Tom",4);
        e.displayInfo();
        
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/OPJA152)