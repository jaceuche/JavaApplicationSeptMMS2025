import java.util.Scanner;

public class Polling {

    public static void main(String[] args) {

        Scanner input =
            new Scanner(System.in);

        String[] topics = {
            "Education",
            "Healthcare",
            "Environment",
            "Technology",
            "Poverty"
        };

        int[][] responses =
            new int[5][10];

        System.out.println(
            "Rate each issue from 1 to 10."
        );

        for (int i = 0;
             i < topics.length;
             i++) {

            System.out.println(
                "\nTopic: " +
                topics[i]
            );

            System.out.print(
                "Enter rating (1-10): "
            );

            int rating =
                input.nextInt();

            while (
                rating < 1 ||
                rating > 10
            ) {

                System.out.print(
                    "Invalid rating. " +
                    "Enter 1-10: "
                );

                rating =
                    input.nextInt();
            }

            responses[i][rating - 1]++;
        }

        System.out.println(
            "\nPolling Results"
        );

        System.out.printf(
            "%-15s",
            "Topic"
        );

        for (int rating = 1;
             rating <= 10;
             rating++) {

            System.out.printf(
                "%5d",
                rating
            );
        }

        System.out.printf(
            "%10s%n",
            "Average"
        );

        int highestTopic = 0;

        int lowestTopic = 0;

        int highestTotal =
            Integer.MIN_VALUE;

        int lowestTotal =
            Integer.MAX_VALUE;

        for (int i = 0;
             i < topics.length;
             i++) {

            int totalResponses = 0;

            int pointTotal = 0;

            System.out.printf(
                "%-15s",
                topics[i]
            );

            for (int j = 0;
                 j < 10;
                 j++) {

                System.out.printf(
                    "%5d",
                    responses[i][j]
                );

                totalResponses +=
                    responses[i][j];

                pointTotal +=
                    (j + 1) *
                    responses[i][j];
            }

            double average;

            if (totalResponses > 0) {

                average =
                    (double) pointTotal /
                    totalResponses;

            } else {

                average = 0.0;
            }

            System.out.printf(
                "%10.2f%n",
                average
            );

            if (pointTotal >
                highestTotal) {

                highestTotal =
                    pointTotal;

                highestTopic = i;
            }

            if (pointTotal <
                lowestTotal) {

                lowestTotal =
                    pointTotal;

                lowestTopic = i;
            }
        }

        System.out.println(
            "\nHighest Point Total:"
        );

        System.out.println(
            topics[highestTopic] +
            " - " +
            highestTotal
        );

        System.out.println(
            "\nLowest Point Total:"
        );

        System.out.println(
            topics[lowestTopic] +
            " - " +
            lowestTotal
        );

        input.close();
    }
}