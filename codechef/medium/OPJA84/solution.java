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
