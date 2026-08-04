import java.util.Scanner;

public class DuplicateElimination {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] uniqueNumbers = new int[5];

        int count = 0;

        while (count < 5) {

            System.out.print(
                "Enter a number between 10 and 100: "
            );

            int number = input.nextInt();

            if (number < 10 || number > 100) {

                System.out.println(
                    "Invalid number. Enter a value from 10 to 100."
                );

                continue;
            }

            boolean duplicate = false;

            for (int i = 0; i < count; i++) {

                if (uniqueNumbers[i] == number) {

                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {

                uniqueNumbers[count] = number;
                count++;

                System.out.println(
                    "Unique values entered:"
                );

                for (int i = 0; i < count; i++) {
                    System.out.print(
                        uniqueNumbers[i] + " "
                    );
                }

                System.out.println();

            } else {

                System.out.println(
                    "Duplicate number. Enter another number."
                );
            }
        }

        System.out.println(
            "\nAll unique values:"
        );

        for (int number : uniqueNumbers) {
            System.out.print(number + " ");
        }

        input.close();
    }
}