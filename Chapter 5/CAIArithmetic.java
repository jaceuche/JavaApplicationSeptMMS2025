import java.util.Random;
import java.util.Scanner;

public class CAIArithmetic {

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

        System.out.println("Select arithmetic operation:");

        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");

        System.out.print("Enter your choice: ");

        int choice = input.nextInt();

        while (choice < 1 || choice > 4) {

            System.out.print(
                "Invalid choice. Enter 1, 2, 3, or 4: "
            );

            choice = input.nextInt();
        }

        int number1 = 1 + random.nextInt(9);
        int number2 = 1 + random.nextInt(9);

        double correctAnswer;

        switch (choice) {

            case 1:

                correctAnswer = number1 + number2;

                break;

            case 2:

                correctAnswer = number1 - number2;

                break;

            case 3:

                correctAnswer = number1 * number2;

                break;

            default:

                correctAnswer = (double) number1 / number2;

                break;
        }

        double answer;

        do {

            switch (choice) {

                case 1:

                    System.out.printf(
                        "How much is %d plus %d? ",
                        number1,
                        number2
                    );

                    break;

                case 2:

                    System.out.printf(
                        "How much is %d minus %d? ",
                        number1,
                        number2
                    );

                    break;

                case 3:

                    System.out.printf(
                        "How much is %d times %d? ",
                        number1,
                        number2
                    );

                    break;

                default:

                    System.out.printf(
                        "How much is %d divided by %d? ",
                        number1,
                        number2
                    );

                    break;
            }

            answer = input.nextDouble();

            if (Math.abs(answer - correctAnswer) < 0.01) {

                System.out.println(getCorrectResponse());

            } else {

                System.out.println(getIncorrectResponse());
            }

        } while (Math.abs(answer - correctAnswer) >= 0.01);

        input.close();
    }
}