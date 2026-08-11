# OPJA88

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Vehicle Inheritance

You are tasked with modeling a simple vehicle hierarchy in Java. Your goal is to create a base class called `Vehicle` and a derived class called `Car`.

Class Definitions:

- Vehicle class: Attributes: make (String): Represents the make (manufacturer) of the vehicle. model (String): Represents the model of the vehicle. Methods: start(): Prints a message indicating that the vehicle is starting. stop(): Prints a message indicating that the vehicle is stopping.
- Car class (inherits from Vehicle): Attributes: numberOfDoors (int): Represents the number of doors of the car. Methods: honk(): Prints a message indicating that the car's horn is being honked.

Additionally, write a `Main` class with the `main` method to demonstrate the functionality of these classes. Create instances of both the `Vehicle` and `Car` classes, call their methods, and display appropriate messages.

### Task

Complete the code to show that the inheritance and functionality are working correctly.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-11T16:38:22.606Z  

```java
// Base class
class Vehicle {
    String make;
    String model;

    Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    void start() {
        System.out.println("Starting the " + make + " " + model);
    }

    void stop() {
        System.out.println("Stopping the " + make + " " + model);
    }
}

// Derived class inheriting from Vehicle
class Car extends Vehicle {
    int numberOfDoors;

    Car(String make, String model, int numberOfDoors) {
        super(make,model);
        this.numberOfDoors = numberOfDoors;
        
    }

    void honk() {
        System.out.println("Honking the horn of the " + make + " " + model);
    }
}

class Codechef {
    public static void main(String[] args) {
        // Create an instance of the Vehicle class
        Vehicle genericVehicle = new Vehicle("Generic", "Vehicle");
        genericVehicle.start();
        genericVehicle.stop();

        // Create an instance of the Car class
        Car myCar = new Car("Toyota", "Camry", 4);
        myCar.start();
        myCar.honk();
        myCar.stop();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/OPJA88)