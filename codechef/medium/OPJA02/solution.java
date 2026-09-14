// Step 1: Define the class
class MyClass {
    // Step 2: Declare private members (fields)
    private int privateValue;

    // Step 3: Declare public members (fields and methods)
    public int publicValue;

    public void publicFunction() {
        // Your code for the public function goes here
    }
}

class Codechef {
    public static void main(String[] args) {
        // Step 4: Create an object of the class
        MyClass obj = new MyClass();

        // Step 5: Accessing and changing the object's public data
        obj.publicValue = 10;

        // Step 6: Use the object's public methods
        obj.publicFunction();
    }
}
