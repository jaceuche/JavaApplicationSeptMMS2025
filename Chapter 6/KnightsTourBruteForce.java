import java.util.Random;
import java.util.Scanner;

public class KnightsTourBruteForce {

    static Random random = new Random();

    static int[] horizontal = {
        2, 1, -1, -2,
        -2, -1, 1, 2
    };

    static int[] vertical = {
        -1, -2, -2, -1,
        1, 2, 2, 1
    };

    public static int runTour(
        boolean displayBoard
    ) {

        int[][] board = new int[8][8];

        int row = random.nextInt(8);
        int column = random.nextInt(8);

        board[row][column] = 1;

        int moves = 1;

        while (true) {

            int[] possibleMoves = new int[8];

            int numberOfPossibleMoves = 0;

            for (int move = 0; move < 8; move++) {

                int newRow =
                    row + vertical[move];

                int newColumn =
                    column + horizontal[move];

                if (newRow >= 0 &&
                    newRow < 8 &&
                    newColumn >= 0 &&
                    newColumn < 8 &&
                    board[newRow][newColumn] == 0) {

                    possibleMoves[
                        numberOfPossibleMoves
                    ] = move;

                    numberOfPossibleMoves++;
                }
            }

            if (numberOfPossibleMoves == 0) {
                break;
            }

            int selectedMove =
                possibleMoves[
                    random.nextInt(
                        numberOfPossibleMoves
                    )
                ];

            row += vertical[selectedMove];

            column += horizontal[selectedMove];

            moves++;

            board[row][column] = moves;
        }

        if (displayBoard) {

            System.out.println(
                "\nFinal Chessboard:"
            );

            for (int i = 0; i < 8; i++) {

                for (int j = 0; j < 8; j++) {

                    System.out.printf(
                        "%2d ",
                        board[i][j]
                    );
                }

                System.out.println();
            }
        }

        return moves;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(
            "1. Run one random tour"
        );

        System.out.println(
            "2. Run 1,000 random tours"
        );

        System.out.println(
            "3. Run until a full tour"
        );

        System.out.print(
            "Enter choice: "
        );

        int choice = input.nextInt();

        if (choice == 1) {

            int moves = runTour(true);

            System.out.println(
                "\nKnight visited " +
                moves +
                " squares."
            );

        } else if (choice == 2) {

            int[] tourLengths = new int[65];

            int bestResult = 0;

            for (int i = 0; i < 1000; i++) {

                int moves = runTour(false);

                tourLengths[moves]++;

                if (moves > bestResult) {
                    bestResult = moves;
                }
            }

            System.out.println(
                "\nTour Length\tFrequency"
            );

            for (int i = 1; i <= 64; i++) {

                if (tourLengths[i] > 0) {

                    System.out.printf(
                        "%d\t\t%d%n",
                        i,
                        tourLengths[i]
                    );
                }
            }

            System.out.println(
                "\nBest result: " +
                bestResult
            );

        } else if (choice == 3) {

            int[] tourLengths = new int[65];

            long attempts = 0;

            int moves;

            do {

                moves = runTour(false);

                tourLengths[moves]++;

                attempts++;

            } while (moves < 64);

            System.out.println(
                "\nFull tour found!"
            );

            System.out.println(
                "Tours attempted: " +
                attempts
            );

            System.out.println(
                "\nTour Length\tFrequency"
            );

            for (int i = 1; i <= 64; i++) {

                if (tourLengths[i] > 0) {

                    System.out.printf(
                        "%d\t\t%d%n",
                        i,
                        tourLengths[i]
                    );
                }
            }

        } else {

            System.out.println(
                "Invalid choice."
            );
        }

        input.close();
    }
}