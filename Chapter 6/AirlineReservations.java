import java.util.Scanner;

public class AirlineReservations {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean[] seats = new boolean[10];

        while (true) {

            System.out.println("\nPlease type 1 for First Class.");
            System.out.println("Please type 2 for Economy.");
            System.out.println("Please type 0 to exit.");

            System.out.print("Your choice: ");

            int choice = input.nextInt();

            if (choice == 0) {
                break;
            }

            if (choice == 1) {

                boolean assigned = false;

                for (int i = 0; i < 5; i++) {

                    if (!seats[i]) {

                        seats[i] = true;

                        System.out.println(
                            "Your seat is " + (i + 1) +
                            " in First Class."
                        );

                        assigned = true;

                        break;
                    }
                }

                if (!assigned) {

                    System.out.println(
                        "First Class is full."
                    );

                    System.out.print(
                        "Would you like Economy? (y/n): "
                    );

                    char answer = input.next().charAt(0);

                    if (answer == 'y' || answer == 'Y') {

                        for (int i = 5; i < 10; i++) {

                            if (!seats[i]) {

                                seats[i] = true;

                                System.out.println(
                                    "Your seat is " +
                                    (i + 1) +
                                    " in Economy."
                                );

                                assigned = true;

                                break;
                            }
                        }
                    }
                }

                if (!assigned) {

                    System.out.println(
                        "The plane is full."
                    );
                }

            } else if (choice == 2) {

                boolean assigned = false;

                for (int i = 5; i < 10; i++) {

                    if (!seats[i]) {

                        seats[i] = true;

                        System.out.println(
                            "Your seat is " +
                            (i + 1) +
                            " in Economy."
                        );

                        assigned = true;

                        break;
                    }
                }

                if (!assigned) {

                    System.out.println(
                        "Economy is full."
                    );

                    System.out.print(
                        "Would you like First Class? (y/n): "
                    );

                    char answer = input.next().charAt(0);

                    if (answer == 'y' || answer == 'Y') {

                        for (int i = 0; i < 5; i++) {

                            if (!seats[i]) {

                                seats[i] = true;

                                System.out.println(
                                    "Your seat is " +
                                    (i + 1) +
                                    " in First Class."
                                );

                                assigned = true;

                                break;
                            }
                        }
                    }
                }

                if (!assigned) {

                    System.out.println(
                        "The plane is full."
                    );
                }

            } else {

                System.out.println(
                    "Invalid choice."
                );
            }
        }

        input.close();
    }
}