import java.util.Random;
import java.util.Scanner;

public class CAIDifficulty {

    static Random random = new Random();

    public static int generateNumber(int level) {

        int maximum;

        if (level == 1) {

            maximum = 9;

        } else if (level == 2) {

            maximum = 99;

        } else if (level == 3) {

            maximum = 999;

        } else {

            maximum = 9999;
        }

        return 1 + random.nextInt(maximum);
    }

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

        System.out.println("Select difficulty level:");

        System.out.println("1 - Easy");
        System.out.println("2 - Medium");
        System.out.println("3 - Hard");
        System.out.println("4 - Very Hard");

        System.out.print("Enter level: ");

        int level = input.nextInt();

        while (level < 1 || level > 4) {

            System.out.print(
                "Invalid level. Enter 1, 2, 3, or 4: "
            );

            level = input.nextInt();
        }

        int number1 = generateNumber(level);
        int number2 = generateNumber(level);

        int correctAnswer = number1 * number2;

        int answer;

        do {

            System.out.printf(
                "How much is %d times %d? ",
                number1,
                number2
            );

            answer = input.nextInt();

            if (answer == correctAnswer) {

                System.out.println(getCorrectResponse());

            } else {

                System.out.println(getIncorrectResponse());
            }

        } while (answer != correctAnswer);

        input.close();
    }
}