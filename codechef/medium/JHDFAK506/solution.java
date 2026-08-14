import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        int number; // Declare a variable to store user input

        // Step 1: Input validation loop
        // Keeps prompting until a valid number (1-100) is entered
        while ((number = scanner.nextInt()) < 1 || number > 100) {
            System.out.println("Invalid input! Please enter a number between 1 and 100: ");
        }

        // Step 2: Display the valid input
        System.out.println("Valid number entered: " + number);

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}