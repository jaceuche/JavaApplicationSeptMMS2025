import java.util.Random;

public class EightQueensBruteForce {

    static Random random =
        new Random();

    static boolean isSafe(
        int[] queens
    ) {

        for (int i = 0;
             i < queens.length;
             i++) {

            for (int j = i + 1;
                 j < queens.length;
                 j++) {

                if (queens[i] ==
                    queens[j]) {

                    return false;
                }

                if (Math.abs(
                        queens[i] -
                        queens[j]
                    ) ==
                    Math.abs(i - j)) {

                    return false;
                }
            }
        }

        return true;
    }

    public static void randomApproach() {

        int attempts = 0;

        while (true) {

            int[] queens =
                new int[8];

            for (int i = 0; i < 8; i++) {

                queens[i] =
                    random.nextInt(8);
            }

            attempts++;

            if (isSafe(queens)) {

                System.out.println(
                    "Random solution found!"
                );

                System.out.println(
                    "Attempts: " +
                    attempts
                );

                displayBoard(queens);

                break;
            }
        }
    }

    public static boolean exhaustiveApproach(
        int[] queens,
        int row
    ) {

        if (row == 8) {
            return isSafe(queens);
        }

        for (int column = 0;
             column < 8;
             column++) {

            queens[row] = column;

            if (exhaustiveApproach(
                    queens,
                    row + 1
                )) {

                return true;
            }
        }

        return false;
    }

    public static void displayBoard(
        int[] queens
    ) {

        for (int row = 0;
             row < 8;
             row++) {

            for (int column = 0;
                 column < 8;
                 column++) {

                if (queens[row] ==
                    column) {

                    System.out.print(
                        "Q "
                    );

                } else {

                    System.out.print(
                        ". "
                    );
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        System.out.println(
            "Random Brute-Force Approach"
        );

        randomApproach();

        System.out.println(
            "\nExhaustive Approach"
        );

        int[] queens =
            new int[8];

        if (exhaustiveApproach(
                queens,
                0
            )) {

            displayBoard(queens);

        } else {

            System.out.println(
                "No solution found."
            );
        }
    }
}