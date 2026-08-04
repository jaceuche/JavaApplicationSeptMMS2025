import java.util.Random;

public class ClosedKnightsTour {

    static Random random =
        new Random();

    static int[] horizontal = {
        2, 1, -1, -2,
        -2, -1, 1, 2
    };

    static int[] vertical = {
        -1, -2, -2, -1,
        1, 2, 2, 1
    };

    public static boolean isValid(
        int row,
        int column,
        int[][] board
    ) {

        return row >= 0 &&
               row < 8 &&
               column >= 0 &&
               column < 8 &&
               board[row][column] == 0;
    }

    public static void main(String[] args) {

        int[][] board =
            new int[8][8];

        int startRow =
            random.nextInt(8);

        int startColumn =
            random.nextInt(8);

        int currentRow =
            startRow;

        int currentColumn =
            startColumn;

        board[currentRow]
             [currentColumn] = 1;

        int moves = 1;

        while (moves < 64) {

            int[] possibleMoves =
                new int[8];

            int count = 0;

            for (int move = 0;
                 move < 8;
                 move++) {

                int newRow =
                    currentRow +
                    vertical[move];

                int newColumn =
                    currentColumn +
                    horizontal[move];

                if (isValid(
                        newRow,
                        newColumn,
                        board
                    )) {

                    possibleMoves[count] =
                        move;

                    count++;
                }
            }

            if (count == 0) {
                break;
            }

            int selectedMove =
                possibleMoves[
                    random.nextInt(count)
                ];

            currentRow +=
                vertical[selectedMove];

            currentColumn +=
                horizontal[selectedMove];

            moves++;

            board[currentRow]
                 [currentColumn] =
                moves;
        }

        System.out.println(
            "Squares visited: " +
            moves
        );

        if (moves == 64) {

            boolean closed = false;

            for (int move = 0;
                 move < 8;
                 move++) {

                int newRow =
                    currentRow +
                    vertical[move];

                int newColumn =
                    currentColumn +
                    horizontal[move];

                if (newRow == startRow &&
                    newColumn ==
                    startColumn) {

                    closed = true;

                    break;
                }
            }

            if (closed) {

                System.out.println(
                    "This is a closed tour."
                );

            } else {

                System.out.println(
                    "This is not a closed tour."
                );
            }

        } else {

            System.out.println(
                "A full tour was not completed."
            );
        }
    }
}