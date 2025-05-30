package Projects;
import java.util.Scanner;
class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super(message);
 }
}
public class CustomExceptionExample {
 // Method to validate age and throw exception if less than 18
 public static void checkAge(int age) throws InvalidAgeException {
     if (age < 18) {
         throw new InvalidAgeException("Error: Age must be at least 18!");
     } else {
         System.out.println("Age is valid. Access granted.");
     }
 }
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter your age: ");
     int age = sc.nextInt();
     try {
         checkAge(age); 
     } catch (InvalidAgeException e) {
         System.out.println(e.getMessage());
     }
     sc.close();
 }
}
