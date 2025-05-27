package Projects;
public class OperatorPrecedence {
    public static void main(String[] args) {
        // Example expressions with multiple operators
        int result1 = 10 + 5 * 2;     // Multiplication (*) has higher precedence than addition (+)
        int result2 = (10 + 5) * 2;   // Parentheses override precedence rules
        int result3 = 20 / 4 + 3 * 2; // Division (/) and multiplication (*) before addition (+)
        int result4 = 10 % 3 + 5 * 2; // Modulus (%) first, then multiplication (*), then addition (+)

        // Display results
        System.out.println("Result of 10 + 5 * 2 = " + result1);
        System.out.println("Result of (10 + 5) * 2 = " + result2);
        System.out.println("Result of 20 / 4 + 3 * 2 = " + result3);
        System.out.println("Result of 10 % 3 + 5 * 2 = " + result4);
    }
}