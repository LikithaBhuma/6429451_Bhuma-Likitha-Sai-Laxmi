package Projects;
import java.util.List;
import java.util.stream.Collectors;
record Person(String name, int age) {}
public class RecordExample {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Krishna", 25),
            new Person("Shiva", 30),
            new Person("Ganesha", 19),
            new Person("Durga", 35),
            new Person("Lakshmi", 17)
        );
        List<Person> adults = people.stream()
                                    .filter(p -> p.age() >= 18)
                                    .collect(Collectors.toList());
        System.out.println("Adults:");
        adults.forEach(System.out::println);
    }
}
