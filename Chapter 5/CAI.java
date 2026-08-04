import java.util.Random;
import java.util.Scanner;

public class CAI {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int number1 = 1 + random.nextInt(9);
        int number2 = 1 + random.nextInt(9);

        int answer;

        do {

            System.out.printf(
                "How much is %d times %d? ",
                number1,
                number2
            );

            answer = input.nextInt();

            if (answer == number1 * number2) {

                System.out.println("Very good!");

            } else {

                System.out.println("No. Please try again.");
            }

        } while (answer != number1 * number2);

        input.close();
    }
}