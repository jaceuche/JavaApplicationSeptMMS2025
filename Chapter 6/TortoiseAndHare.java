import java.util.Random;

public class TortoiseAndHare {

    static Random random =
        new Random();

    public static void main(String[] args) {

        int tortoise = 1;

        int hare = 1;

        System.out.println(
            "BANG !!!!!"
        );

        System.out.println(
            "AND THEY'RE OFF !!!!!"
        );

        while (
            tortoise < 70 &&
            hare < 70
        ) {

            int tortoiseMove =
                1 + random.nextInt(10);

            if (tortoiseMove >= 1 &&
                tortoiseMove <= 5) {

                tortoise += 3;

            } else if (
                tortoiseMove <= 7
            ) {

                tortoise -= 6;

            } else {

                tortoise += 1;
            }

            int hareMove =
                1 + random.nextInt(10);

            if (hareMove <= 2) {

                // Sleep
                hare += 0;

            } else if (
                hareMove <= 4
            ) {

                // Big hop
                hare += 9;

            } else if (
                hareMove == 5
            ) {

                // Big slip
                hare -= 12;

            } else if (
                hareMove <= 8
            ) {

                // Small hop
                hare += 1;

            } else {

                // Small slip
                hare -= 2;
            }

            if (tortoise < 1) {
                tortoise = 1;
            }

            if (hare < 1) {
                hare = 1;
            }

            for (int position = 1;
                 position <= 70;
                 position++) {

                if (position ==
                    tortoise &&
                    position == hare) {

                    System.out.print(
                        "OUCH!!!"
                    );

                } else if (
                    position == tortoise
                ) {

                    System.out.print(
                        "T"
                    );

                } else if (
                    position == hare
                ) {

                    System.out.print(
                        "H"
                    );

                } else {

                    System.out.print(
                        " "
                    );
                }
            }

            System.out.println();

            if (tortoise >= 70 &&
                hare >= 70) {

                System.out.println(
                    "It's a tie."
                );

                break;

            } else if (
                tortoise >= 70
            ) {

                System.out.println(
                    "TORTOISE WINS!!! YAY!!!"
                );

                break;

            } else if (
                hare >= 70
            ) {

                System.out.println(
                    "Hare wins. Yuch."
                );

                break;
            }
        }
    }
}