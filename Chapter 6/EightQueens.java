public class EightQueens {

    static int[][] board =
        new int[8][8];

    static boolean isSafe(
        int row,
        int column
    ) {

        // Check column
        for (int i = 0; i < row; i++) {

            if (board[i][column] == 1) {
                return false;
            }
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = column - 1;
             i >= 0 && j >= 0;
             i--, j--) {

            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = column + 1;
             i >= 0 && j < 8;
             i--, j++) {

            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    public static boolean solve(
        int row
    ) {

        if (row == 8) {
            return true;
        }

        for (int column = 0;
             column < 8;
             column++) {

            if (isSafe(row, column)) {

                board[row][column] = 1;

                if (solve(row + 1)) {
                    return true;
                }

                board[row][column] = 0;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        if (solve(0)) {

            System.out.println(
                "Eight Queens Solution:"
            );

            for (int row = 0;
                 row < 8;
                 row++) {

                for (int column = 0;
                     column < 8;
                     column++) {

                    if (board[row][column] == 1) {
                        System.out.print("Q ");
                    } else {
                        System.out.print(". ");
                    }
                }

                System.out.println();
            }

        } else {

            System.out.println(
                "No solution found."
            );
        }
    }
}