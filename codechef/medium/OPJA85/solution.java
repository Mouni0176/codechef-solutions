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
