import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length, width;

        try {
            if (!scanner.hasNextInt()) {
                throw new IllegalArgumentException("Invalid Argument: Length and width must be integers.");
            }
            length = scanner.nextInt();

            if (!scanner.hasNextInt()) {
                throw new IllegalArgumentException("Invalid Argument: Length and width must be integers.");
            }
            width = scanner.nextInt();

            // Check for negative values
            if (length < 0 || width < 0) {
                throw new IllegalArgumentException("Invalid Argument: Length and width must be positive values.");
            }

            // Calculate the area of the rectangle
            int area = length * width;

            // Display the result
            System.out.println("Area: " + area);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An unknown error occurred.");
        } finally {
            scanner.close();
        }
    }
}
