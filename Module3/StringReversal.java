package Projects;
import java.util.Scanner;
public class StringReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Method 1: Using a loop to reverse manually
        String reversedLoop = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversedLoop += input.charAt(i);
        }

        // Method 2: Using StringBuilder's reverse() method
        String reversedBuilder = new StringBuilder(input).reverse().toString();

        // Display results
        System.out.println("Reversed string (loop method): " + reversedLoop);
        System.out.println("Reversed string (StringBuilder method): " + reversedBuilder);

        scanner.close();
    }
}
