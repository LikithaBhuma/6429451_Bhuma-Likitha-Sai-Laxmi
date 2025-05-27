package Projects;
public class TypeCastingExample {
    public static void main(String[] args) {
        // Declare and initialize a double variable
        double myDouble = 9.75;
        // Explicitly cast double to int
        int myInt = (int) myDouble;

        // Declare and initialize an int variable
        int anotherInt = 7;
        // Implicitly cast int to double
        double anotherDouble = anotherInt;

        // Display results
        System.out.println("Original double value: " + myDouble);
        System.out.println("Casted to int (loses decimal part): " + myInt);
        System.out.println("Original int value: " + anotherInt);
        System.out.println("Casted to double (automatically converts): " + anotherDouble);
    }
}