import java.util.Random;
import java.util.Scanner;

public class CoinTossing {

    enum Coin {
        HEADS, TAILS
    }

    static Random random = new Random();

    public static Coin flip() {

        int result = random.nextInt(2);

        if (result == 0) {
            return Coin.HEADS;
        } else {
            return Coin.TAILS;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int heads = 0;
        int tails = 0;

        int choice;

        do {

            System.out.println("\n1. Toss Coin");
            System.out.println("2. Display Results");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            if (choice == 1) {

                Coin result = flip();

                if (result == Coin.HEADS) {
                    heads++;
                    System.out.println("HEADS");
                } else {
                    tails++;
                    System.out.println("TAILS");
                }

            } else if (choice == 2) {

                System.out.println("Heads: " + heads);
                System.out.println("Tails: " + tails);

            } else if (choice != 3) {

                System.out.println("Invalid choice.");

            }

        } while (choice != 3);

        System.out.println("\nFinal Results:");
        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);

        input.close();
    }
}