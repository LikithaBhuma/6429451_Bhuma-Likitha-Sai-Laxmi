package Projects;
public class TypeCastingExample {
    public static void main(String[] args) {
        double myDouble = 9.75;
        double anotherDouble = anotherInt;
        System.out.println("Original double value: " + myDouble);
        System.out.println("Casted to int (loses decimal part): " + myInt);
        System.out.println("Original int value: " + anotherInt);
        System.out.println("Casted to double (automatically converts): " + anotherDouble);
    }
}
