import java.util.Scanner;

public class TurtleGraphics {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char[][] floor = new char[20][20];

        for (int row = 0; row < floor.length; row++) {

            for (int col = 0; col < floor[row].length; col++) {

                floor[row][col] = ' ';
            }
        }

        int row = 0;
        int column = 0;

        int direction = 0;

        boolean penDown = false;

        while (true) {

            System.out.println("\nTurtle Commands:");

            System.out.println(
                "1 - Pen up"
            );

            System.out.println(
                "2 - Pen down"
            );

            System.out.println(
                "3 - Turn right"
            );

            System.out.println(
                "4 - Turn left"
            );

            System.out.println(
                "5 - Move forward"
            );

            System.out.println(
                "6 - Display floor"
            );

            System.out.println(
                "9 - End program"
            );

            System.out.print(
                "Enter command: "
            );

            int command = input.nextInt();

            if (command == 1) {

                penDown = false;

            } else if (command == 2) {

                penDown = true;

            } else if (command == 3) {

                direction =
                    (direction + 1) % 4;

            } else if (command == 4) {

                direction =
                    (direction + 3) % 4;

            } else if (command == 5) {

                System.out.print(
                    "Enter number of steps: "
                );

                int steps = input.nextInt();

                for (int i = 0; i < steps; i++) {

                    if (penDown) {

                        floor[row][column] = '*';
                    }

                    if (direction == 0) {

                        if (column < 19) {
                            column++;
                        }

                    } else if (direction == 1) {

                        if (row < 19) {
                            row++;
                        }

                    } else if (direction == 2) {

                        if (column > 0) {
                            column--;
                        }

                    } else {

                        if (row > 0) {
                            row--;
                        }
                    }
                }

            } else if (command == 6) {

                for (int i = 0;
                     i < floor.length;
                     i++) {

                    for (int j = 0;
                         j < floor[i].length;
                         j++) {

                        System.out.print(
                            floor[i][j]
                        );
                    }

                    System.out.println();
                }

            } else if (command == 9) {

                System.out.println(
                    "Program ended."
                );

                break;

            } else {

                System.out.println(
                    "Invalid command."
                );
            }
        }

        input.close();
    }
}