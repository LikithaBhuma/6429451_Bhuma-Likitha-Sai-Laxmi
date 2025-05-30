package Projects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class LambdaSortingExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Krishna");
        names.add("Shiva");
        names.add("Vishnu");
        names.add("Ganesha");
        names.add("Durga");
        Collections.sort(names, (a, b) -> a.compareTo(b));
        System.out.println("Sorted list:");
        names.forEach(System.out::println);
    }
}
