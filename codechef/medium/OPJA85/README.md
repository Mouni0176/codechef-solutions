# OPJA85

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Multilevel Inheritance

In Java, multilevel inheritance involves a chain of inheritance, where a derived class inherits from a base class, and then another class inherits from that derived class.

In this example, We will demonstrate multilevel inheritance with protected variables:

- We have a base class Animal with a protected member name.
- We then create an intermediate derived class Mammal that inherits from Animal and adds a protected member numLegs. This class represents a generic mammal.
- Finally, we create the Dog class, which inherits from Mammal. Dog is a specific type of mammal, so it inherits both the name and numLegs members and adds its own method, Bark.
- In the main function, we create an instance of the Dog class named myDog and call methods from all three levels of the inheritance hierarchy (Eat from Animal, Walk from Mammal, and Bark from Dog).

Protected members allows you to encapsulate data and behavior while still providing access within the inheritance hierarchy.

 **Run the code to ensure everything works fine.**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-11T16:37:38.372Z  

```java
class Animal {
    protected String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }
}

class Mammal extends Animal {
    protected int numLegs;

    Mammal(String name, int numLegs) {
        super(name); // calling constructor of parent class
        this.numLegs = numLegs;
    }

    void walk() {
        System.out.println(name + " is walking on " + numLegs + " legs.");
    }
}

class Dog extends Mammal {
    Dog(String name, int numLegs) {
        super(name, numLegs);
    }

    void bark() {
        System.out.println(name + " is barking.");
    }
}

class Codechef {
    public static void main(String[] args) {
        // Create an instance of the Dog class
        Dog myDog = new Dog("Buddy", 4);

        // Access and modify protected members
        myDog.eat();
        myDog.walk();
        myDog.bark();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/OPJA85)