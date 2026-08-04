public class KnightsTour {

    public static void main(String[] args) {

        int[][] board = new int[8][8];

        int[] horizontal = {
            2, 1, -1, -2,
            -2, -1, 1, 2
        };

        int[] vertical = {
            -1, -2, -2, -1,
            1, 2, 2, 1
        };

        int currentRow = 0;
        int currentColumn = 0;

        board[currentRow][currentColumn] = 1;

        int moveCount = 1;

        while (moveCount < 64) {

            boolean moved = false;

            for (int moveNumber = 0;
                 moveNumber < 8;
                 moveNumber++) {

                int newRow =
                    currentRow + vertical[moveNumber];

                int newColumn =
                    currentColumn + horizontal[moveNumber];

                if (newRow >= 0 &&
                    newRow < 8 &&
                    newColumn >= 0 &&
                    newColumn < 8 &&
                    board[newRow][newColumn] == 0) {

                    currentRow = newRow;
                    currentColumn = newColumn;

                    moveCount++;

                    board[currentRow][currentColumn] =
                        moveCount;

                    moved = true;

                    break;
                }
            }

            if (!moved) {
                break;
            }
        }

        System.out.println(
            "Number of moves made: " + moveCount
        );

        System.out.println("\nKnight's Tour Board:");

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