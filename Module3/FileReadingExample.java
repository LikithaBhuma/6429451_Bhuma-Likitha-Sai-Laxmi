package Projects;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadingExample {
    public static void main(String[] args) {
        try {
            File file = new File("output.txt");
            Scanner scanner = new Scanner(file);

            System.out.println("Contents of output.txt:");

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        }
    }
}
