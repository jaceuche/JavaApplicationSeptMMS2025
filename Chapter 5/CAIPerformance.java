import java.util.Random;
import java.util.Scanner;

public class CAIPerformance {

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

        int correctAnswers = 0;

        for (int question = 1; question <= 10; question++) {

            int number1 = 1 + random.nextInt(9);
            int number2 = 1 + random.nextInt(9);

            int correctAnswer = number1 * number2;

            System.out.printf(
                "%nQuestion %d: How much is %d times %d? ",
                question,
                number1,
                number2
            );

            int answer = input.nextInt();

            if (answer == correctAnswer) {

                correctAnswers++;

                System.out.println(getCorrectResponse());

            } else {

                System.out.println(getIncorrectResponse());
            }
        }

        double percentage = (correctAnswers / 10.0) * 100;

        System.out.println("\nTest Complete!");
        System.out.println("Correct Answers: " + correctAnswers);
        System.out.println("Incorrect Answers: " + (10 - correctAnswers));
        System.out.printf("Percentage: %.1f%%%n", percentage);

        if (percentage >= 75) {

            System.out.println(
                "Congratulations! You are ready to go to the next level."
            );

        } else {

            System.out.println(
                "Please ask your instructor for extra help."
            );
        }

        input.close();
    }
}