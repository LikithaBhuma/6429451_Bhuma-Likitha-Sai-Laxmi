package Projects;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileWritingExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text to write to the file: ");
        String userInput = sc.nextLine();
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write(userInput);
            writer.close();
            System.out.println("Data successfully written to output.txt");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
        sc.close();
    }
}

