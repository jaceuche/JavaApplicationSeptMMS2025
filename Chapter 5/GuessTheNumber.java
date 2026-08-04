import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        char playAgain;

        do {

            int number = random.nextInt(1000) + 1;

            int guess;

            System.out.println("\nGuess a number between 1 and 1000.");

            do {

                System.out.print("Enter your guess: ");
                guess = input.nextInt();

                if (guess > number) {

                    System.out.println("Too high. Try again.");

                } else if (guess < number) {

                    System.out.println("Too low. Try again.");

                } else {

                    System.out.println(
                        "Congratulations. You guessed the number!"
                    );
                }

            } while (guess != number);

            System.out.print("Would you like to play again? (y/n): ");

            playAgain = input.next().charAt(0);

        } while (playAgain == 'y' || playAgain == 'Y');

        input.close();
    }
}