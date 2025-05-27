package Projects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaSortingExample {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> names = new ArrayList<>();
        names.add("Krishna");
        names.add("Shiva");
        names.add("Vishnu");
        names.add("Ganesha");
        names.add("Durga");

        // Sort the list using a lambda expression
        Collections.sort(names, (a, b) -> a.compareTo(b));

        // Display the sorted list
        System.out.println("Sorted list:");
        names.forEach(System.out::println);
    }
}