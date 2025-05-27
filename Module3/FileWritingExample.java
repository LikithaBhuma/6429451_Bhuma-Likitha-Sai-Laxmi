package Projects;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWritingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter text to write to the file: ");
        String userInput = scanner.nextLine();

        // Write to file
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write(userInput);
            writer.close();
            System.out.println("Data successfully written to output.txt");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        scanner.close();
    }
}

