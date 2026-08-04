import java.util.Random;
import java.util.Scanner;

public class CAIFatigue {

    static Random random = new Random();

    public static String getCorrectResponse() {

        String[] responses = {
            "Very good!",
            "Excellent!",
            "Nice work!",
            "Keep up the good work!"
        };

        return responses[random.nextInt(responses.length)];
    }

    public static String getIncorrectResponse() {

        String[] responses = {
            "No. Please try again.",
            "Wrong. Try once more.",
            "Don't give up!",
            "No. Keep trying."
        };

        return responses[random.nextInt(responses.length)];
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

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

                System.out.println(getCorrectResponse());

            } else {

                System.out.println(getIncorrectResponse());
            }

        } while (answer != number1 * number2);

        input.close();
    }
}