package Projects;
import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1; 
        int userGuess = 0;
        System.out.println("Guess a number between 1 and 100:");
        while (userGuess != targetNumber) {
            System.out.print("Enter your guess: ");
            userGuess = sc.nextInt();
            if (userGuess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number: " + targetNumber);
            }
        }
        sc.close();
    }
}
