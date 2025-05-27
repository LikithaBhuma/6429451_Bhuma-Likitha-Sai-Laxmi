package Projects;
import java.util.Scanner;
public class RecursiveFibonacci {
    // Recursive method to calculate nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Input must be a positive integer.");
        } else if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Error: Please enter a positive integer.");
        } else {
            System.out.println("The " + n + "th Fibonacci number is: " + fibonacci(n));
        }

        scanner.close();
    }
}