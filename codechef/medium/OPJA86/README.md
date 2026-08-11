# OPJA86

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Hierarchical inheritance

Hierarchical inheritance in Java is a type of inheritance where multiple classes inherit from a single base class. In other words, it represents a tree-like structure of inheritance where a single parent class has multiple child classes. Each child class inherits the properties and behaviors of the parent class and may have its own additional properties and behaviors. Hierarchical inheritance is commonly used to model relationships where different classes share common characteristics but have their own unique features.

Here's an example of hierarchical inheritance in Java:

- The Animal class is the base class with a constructor and an eat method. It represents common properties and behaviors shared by both Dog and Cat.
- The Dog class and Cat class are child classes that inherit from the Animal class. They have their own constructors and additional methods (bark and meow) that are specific to each class.
- In the main method, instances of both Dog and Cat classes are created, and methods from the base class (eat) and child classes (bark and meow) are called. This demonstrates hierarchical inheritance, where multiple classes inherit from a single base class.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-11T16:37:49.633Z  

```java
// Base class
class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }
}

// Child class 1
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    void bark() {
        System.out.println(name + " is barking.");
    }
}

// Child class 2
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    void meow() {
        System.out.println(name + " is meowing.");
    }
}

class Codechef {
    public static void main(String[] args) {
        // Create instances of child classes
        Dog myDog = new Dog("Buddy");
        Cat myCat = new Cat("Whiskers");

        // Call methods from the base class and child classes
        myDog.eat();
        myDog.bark();

        myCat.eat();
        myCat.meow();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/OPJA86)