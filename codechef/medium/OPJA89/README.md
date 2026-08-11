# OPJA89

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Overriding in single inheritance

Method overriding in Java is a mechanism that allows a subclass to provide a specific implementation for a method that is already defined in its superclass. The overriding method in the subclass should have the same name, return type, and parameters (if overridden), but it may provide a different implementation. Method overriding is a key concept in achieving runtime polymorphism in object-oriented programming.

In this example:

- The Animal class defines a method called makeSound.
- The Dog and Cat classes are subclasses of Animal. They override the makeSound method with their own implementations.
- In the main method, we create instances of both Dog and Cat but store them in variables of type Animal. This is an example of polymorphism, where objects of different classes are treated as objects of a common superclass.
- When we call the makeSound method on animal1 and animal2, Java determines which version of the method to call based on the actual runtime type of the objects. As a result, the overridden makeSound method in the respective subclass is executed, demonstrating method overriding.

Method overriding is essential for building flexible and extensible class hierarchies in Java, allowing subclasses to provide their own behavior while adhering to a common interface defined by the superclass.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-11T16:38:12.378Z  

```java
// Base class
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass 1
class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Subclass 2
class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meows");
    }
}

class Codechef {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.makeSound(); // Calls Dog's makeSound method
        animal2.makeSound(); // Calls Cat's makeSound method
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/OPJA89)