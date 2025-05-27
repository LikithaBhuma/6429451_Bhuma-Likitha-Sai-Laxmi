package Projects;
import java.util.Scanner;
public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Error: Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1; // Using long to handle large results

            for (int i = 1; i <= number; i++) {
                factorial *= i; // Multiply iteratively
            }

            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        scanner.close();
    }
}
