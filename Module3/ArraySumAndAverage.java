package Projects;
import java.util.Scanner;
public class ArraySumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Validate input
        if (n <= 0) {
            System.out.println("Error: Please enter a positive number of elements.");
            return;
        }

        int[] numbers = new int[n]; // Array declaration
        int sum = 0;

        // Read elements into array
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i]; // Accumulate sum
        }

        // Calculate average
        double average = (double) sum / n;

        // Display results
        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + average);

        scanner.close();
    }
}
