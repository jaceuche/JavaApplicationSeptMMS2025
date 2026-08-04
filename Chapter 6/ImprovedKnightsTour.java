public class ImprovedKnightsTour {

    static int[] horizontal = {
        2, 1, -1, -2,
        -2, -1, 1, 2
    };

    static int[] vertical = {
        -1, -2, -2, -1,
        1, 2, 2, 1
    };

    static int[][] accessibility = {
        {2, 3, 4, 4, 4, 4, 3, 2},
        {3, 4, 6, 6, 6, 6, 4, 3},
        {4, 6, 8, 8, 8, 8, 6, 4},
        {4, 6, 8, 8, 8, 8, 6, 4},
        {4, 6, 8, 8, 8, 8, 6, 4},
        {4, 6, 8, 8, 8, 8, 6, 4},
        {3, 4, 6, 6, 6, 6, 4, 3},
        {2, 3, 4, 4, 4, 4, 3, 2}
    };

    public static boolean isValid(
        int[][] board,
        int row,
        int column
    ) {

        return row >= 0 &&
               row < 8 &&
               column >= 0 &&
               column < 8 &&
               board[row][column] == 0;
    }

    public static int countAvailableMoves(
        int[][] board,
        int row,
        int column
    ) {

        int count = 0;

        for (int move = 0; move < 8; move++) {

            int newRow =
                row + vertical[move];

            int newColumn =
                column + horizontal[move];

            if (isValid(
                board,
                newRow,
                newColumn
            )) {

                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[][] board = new int[8][8];

        int currentRow = 0;
        int currentColumn = 0;

        board[currentRow][currentColumn] = 1;

        int moveCount = 1;

        while (moveCount < 64) {

            int bestMove = -1;

            int lowestAccessibility =
                Integer.MAX_VALUE;

            int bestLookAhead =
                Integer.MAX_VALUE;

            for (int move = 0; move < 8; move++) {

                int newRow =
                    currentRow + vertical[move];

                int newColumn =
                    currentColumn + horizontal[move];

                if (isValid(
                    board,
                    newRow,
                    newColumn
                )) {

                    int access =
                        accessibility[
                            newRow
                        ][
                            newColumn
                        ];

                    int lookAhead =
                        countAvailableMoves(
                            board,
                            newRow,
                            newColumn
                        );

                    if (access <
                        lowestAccessibility) {

                        lowestAccessibility =
                            access;

                        bestLookAhead =
                            lookAhead;

                        bestMove = move;

                    } else if (
                        access ==
                        lowestAccessibility &&
                        lookAhead <
                        bestLookAhead
                    ) {

                        bestLookAhead =
                            lookAhead;

                        bestMove = move;
                    }
                }
            }

            if (bestMove == -1) {
                break;
            }

            currentRow +=
                vertical[bestMove];

            currentColumn +=
                horizontal[bestMove];

            moveCount++;

            board[currentRow][currentColumn] =
                moveCount;
        }

        System.out.println(
            "Number of squares visited: " +
            moveCount
        );

        System.out.println(
            "\nKnight's Tour Board:"
        );

        for (int row = 0; row < 8; row++) {

            for (int column = 0;
                 column < 8;
                 column++) {

                System.out.printf(
                    "%2d ",
                    board[row][column]
                );
            }

            System.out.println();
        }
    }
}