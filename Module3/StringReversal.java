package Projects;
import java.util.Scanner;
public class StringReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String r = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            r += input.charAt(i);
        }
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed string (loop method): " + r);
        System.out.println("Reversed string (StringBuilder method): " + reversed);
        sc.close();
    }
}
