import java.util.Random;
import java.util.Scanner;

public class CrapsGame {

    enum Status {
        CONTINUE, WON, LOST
    }

    static final Random random = new Random();

    public static int rollDice() {

        int die1 = 1 + random.nextInt(6);

        int die2 = 1 + random.nextInt(6);

        return die1 + die2;
    }

    public static void chatter(double bankBalance) {

        String[] messages = {
            "Oh, you're going for broke, huh?",
            "Aw c'mon, take a chance!",
            "You're up big. Now's the time to cash in your chips!"
        };

        int index = random.nextInt(messages.length);

        System.out.println(messages[index]);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double bankBalance = 1000.00;

        System.out.println("Welcome to Craps!");

        while (bankBalance > 0) {

            System.out.printf(
                "%nCurrent Bank Balance: $%.2f%n",
                bankBalance
            );

            System.out.print("Enter your wager: $");

            double wager = input.nextDouble();

            while (wager <= 0 || wager > bankBalance) {

                System.out.println(
                    "Invalid wager. Enter a value between $0.01 and your balance."
                );

                System.out.print("Enter your wager: $");

                wager = input.nextDouble();
            }

            chatter(bankBalance);

            int sumOfDice = rollDice();

            System.out.println("You rolled: " + sumOfDice);

            Status gameStatus;

            switch (sumOfDice) {

                case 7:
                case 11:
                    gameStatus = Status.WON;
                    break;

                case 2:
                case 3:
                case 12:
                    gameStatus = Status.LOST;
                    break;

                default:
                    gameStatus = Status.CONTINUE;
                    break;
            }

            int myPoint = 0;

            while (gameStatus == Status.CONTINUE) {

                myPoint = sumOfDice;

                System.out.println("Point is: " + myPoint);

                do {

                    sumOfDice = rollDice();

                    System.out.println("You rolled: " + sumOfDice);

                } while (sumOfDice != myPoint && sumOfDice != 7);

                if (sumOfDice == myPoint) {

                    gameStatus = Status.WON;

                } else {

                    gameStatus = Status.LOST;
                }
            }

            if (gameStatus == Status.WON) {

                bankBalance += wager;

                System.out.printf(
                    "You won! New balance: $%.2f%n",
                    bankBalance
                );

            } else {

                bankBalance -= wager;

                System.out.printf(
                    "You lost! New balance: $%.2f%n",
                    bankBalance
                );

                if (bankBalance == 0) {

                    System.out.println("Sorry. You busted!");
                }
            }

            if (bankBalance > 0) {

                System.out.print(
                    "Would you like to play again? (y/n): "
                );

                char choice = input.next().charAt(0);

                if (choice != 'y' && choice != 'Y') {
                    break;
                }
            }
        }

        input.close();
    }
}