# OPJA148

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Implement a Rectangle Class

Create a Java program to implement a Rectangle class. The program should include the following:

- Shape Class: Define a base class called Shape with the following characteristics: A constructor that initializes an integer member variable area to 0. A function named printArea that prints "Area: " followed by the area value.
- Rectangle Class (Derived from Shape): Define a derived class called Rectangle that inherits from the Shape class. The Rectangle class should have the following characteristics: A constructor that takes two integers, length and width, as parameters and sets the area based on the formula area = length * width. An overridden printArea function that prints "Rectangle Area: " followed by the area value.
- Main Function: In the main function: Create an object of the Rectangle class, having length as 4 and width as 6. Call the printArea function of the Rectangle object to print the calculated area.
### Task

Run the code to demonstrate dynamic method dispatch by using the printArea function of the Rectangle class.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-10T16:58:28.386Z  

```java
class Shape {
    protected int area;

    public Shape() {
        area = 0;
    }

    public void printArea() {
        System.out.println("Area: " + area);
    }
}

class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(int l, int w) {
        length = l;
        width = w;
        area = length * width;
    }

    @Override
    public void printArea() {
        System.out.println("Rectangle Area: " + area);
    }
}

class Codechef {
    public static void main(String[] args) {
        Shape s;
        Rectangle r = new Rectangle(4, 6);

        s = r;
        s.printArea();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/OPJA148)