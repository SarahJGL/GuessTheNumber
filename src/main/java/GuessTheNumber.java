import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    // Create a main() method
    public static void main(String[] args) {
        // Use the following code to create a random number from 1 to 100:
        // Note: you may have to import the Random class
        // int randomNumber = new Random().nextInt(100) + 1;
        int randomNumber = new Random().nextInt(100) + 1;
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Create a variable to hold the number of guess attempts, example
        // int guessAttempts = 6;
        int guessAttempts = 6;

        // While the user has more than 0 guess attempts...
        while (guessAttempts > 0) {
            // Ask the user for a number between 1 and 100
            System.out.print("Guess a number between 1 and 100 ");
            int userGuess = scanner.nextInt();

            // If the user's number matches the random number tell the user they guessed correctly!
            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed correctly!");
                // Stop the program using:
                System.exit(0);
            }
            // System.exit(0);


            // Otherwise, if the user's number is lower than the random number,
            else if (userGuess < randomNumber) {
                // tell them they guessed too low
                System.out.println("Too low! Try again!");
                // Decrease the number of attempts by 1
                guessAttempts--;
            }
            // Otherwise, tell the user they guessed too high
            else {
                System.out.println("Too high! Try again!");
                // Decrease the number of attempts by 1
                guessAttempts--;
            }
            //Display the remaining attempts
            System.out.println("You have " + guessAttempts + " attempts left.");
        }
            // Outside the loop, tell the user they have lost and reveal the random number!
            System.out.println("Sorry! You've run out of attempts. The random number was " + randomNumber + ".");

            scanner.close();

            /*
             * Feel free to add any additional rules :)
             */
        }
    }
