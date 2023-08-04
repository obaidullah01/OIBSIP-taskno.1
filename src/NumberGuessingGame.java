import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Define the range of numbers for the game
        int minNumber = 1;
        int maxNumber = 100;

        // Create a random number generator
        Random random = new Random();
        int secretNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;
        // Initialize the maximum number of attempts
        int maxAttempts = 10;

        // Game introduction
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've chosen a number between " + minNumber + " and " + maxNumber + ".");
        System.out.println("You have " + maxAttempts + " attempts to guess the number.");

        // Create a Scanner to read the player's input
        Scanner scanner = new Scanner(System.in);
        int guess = 0; // Declare the 'guess' variable outside the loop

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.print("Attempt " + attempt + ": Enter your guess: ");
            guess = scanner.nextInt();

            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the correct number in " + attempt + " attempts.");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }
        }

        // Close the scanner
        scanner.close();

        if (secretNumber != guess) {
            System.out.println("Sorry, you have used all " + maxAttempts + " attempts.");
            System.out.println("The secret number was: " + secretNumber);
        }
    }
}

