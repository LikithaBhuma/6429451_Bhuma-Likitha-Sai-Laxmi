package Projects;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> studentMap = new HashMap<>();

        // Adding student entries
        System.out.println("Enter student ID and name (type -1 to stop):");
        while (true) {
            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (id == -1) break; // Stop condition

            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            studentMap.put(id, name);
        }

        // Retrieving student name by ID
        System.out.print("\nEnter an ID to search: ");
        int searchId = scanner.nextInt();

        if (studentMap.containsKey(searchId)) {
            System.out.println("Student Name: " + studentMap.get(searchId));
        } else {
            System.out.println("ID not found!");
        }

        scanner.close();
    }
}

