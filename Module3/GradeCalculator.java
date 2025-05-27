package Projects;
import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt user for marks
        System.out.print("Enter your marks out of 100: ");
        int marks = scanner.nextInt();
        // Determine grade using if-else statements
        char grade;
        if (marks >= 90 && marks <= 100) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'B';
        } else if (marks >= 70) {
            grade = 'C';
        } else if (marks >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        // Display result
        System.out.println("Your grade is: " + grade);

        scanner.close();
    }
}
