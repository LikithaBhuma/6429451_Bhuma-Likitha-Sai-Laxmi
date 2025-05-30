package Projects;
public class OperatorPrecedence {
    public static void main(String[] args) {
        int res1 = 10 + 5 * 2;     // Multiplication has higher precedence than addition 
        int res2 = (10 + 5) * 2;   // Parentheses override precedence rules
        int res3 = 20 / 4 + 3 * 2; // Division  and multiplication before addition
        int res4 = 10 % 3 + 5 * 2; // Modulus first, then multiplication, then addition
        System.out.println("Result of 10 + 5 * 2 = " + res1);
        System.out.println("Result of (10 + 5) * 2 = " + res2);
        System.out.println("Result of 20 / 4 + 3 * 2 = " + res3);
        System.out.println("Result of 10 % 3 + 5 * 2 = " + res4);
    }
}
