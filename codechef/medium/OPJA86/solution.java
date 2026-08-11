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
