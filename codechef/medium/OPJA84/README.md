# OPJA84

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Single Inheritance

In Java, single inheritance refers to a class inheriting from only one base class.

The given code is an example of single inheritance:

- We have a base class Animal with two methods: Eat and Sleep. The Animal class has a constructor that takes the name of the animal as an argument.
- We then define a derived class Dog that inherits from the Animal class using the public access specifier. This means that the public members of the Animal class are accessible in the Dog class.
- The Dog class has an additional method Bark, which is specific to dogs.
- In the main function, we create an instance of the Dog class named myDog and call methods from both the base class (Eat and Sleep) and the derived class (Bark) using the myDog object.

 **Run the code to ensure it works fine.**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-11T16:37:24.803Z  

```java
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name); // calling the constructor of the base class
    }

    void bark() {
        System.out.println("Woof! Woof!");
    }
}

class Codechef {
    public static void main(String[] args) {
        // Create an instance of the Dog class
        Dog myDog = new Dog("Buddy");

        // Call methods from the base class
        myDog.eat();

        // Call method from the derived class
        myDog.bark();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/OPJA84)