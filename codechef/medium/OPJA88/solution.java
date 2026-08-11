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
