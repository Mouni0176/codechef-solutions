import java.util.Scanner;

class Employee {
    protected String name;

    Employee(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
    }
}

class Worker extends Employee {
    private int hourlyRate;

    Worker(String name, int hourlyRate) {
        super(name);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the base class method
        System.out.println("Hourly Rate: $" + hourlyRate);
    }
}

class Codechef {
    public static void main(String[] args) {
        // Write your code here
        Employee e = new Worker("Tom",4);
        e.displayInfo();
        
    }
}
