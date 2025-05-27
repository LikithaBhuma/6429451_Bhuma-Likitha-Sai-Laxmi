package Projects;
public class PatternMatchingExample {
    public static void checkObjectType(Object obj) {
        // Enhanced switch with pattern matching
        switch (obj) {
            case Integer i -> System.out.println("It's an Integer: " + i);
            case String s -> System.out.println("It's a String: " + s);
            case Double d -> System.out.println("It's a Double: " + d);
            case Boolean b -> System.out.println("It's a Boolean: " + b);
            default -> System.out.println("Unknown type: " + obj.getClass().getSimpleName());
        }
    }

    public static void main(String[] args) {
        checkObjectType(42);
        checkObjectType("Hello, Java!");
        checkObjectType(99.99);
        checkObjectType(true);
        checkObjectType(new Object());
    }
}
