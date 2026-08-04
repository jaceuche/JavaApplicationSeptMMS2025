import java.util.Random;

public class DiceRolling {

    public static void main(String[] args) {

        Random random = new Random();

        int[] frequency = new int[13];

        final int NUMBER_OF_ROLLS = 36_000_000;

        for (int i = 0; i < NUMBER_OF_ROLLS; i++) {

            int die1 = 1 + random.nextInt(6);

            int die2 = 1 + random.nextInt(6);

            int sum = die1 + die2;

            frequency[sum]++;
        }

        System.out.println(
            "Sum\tFrequency"
        );

        for (int sum = 2; sum <= 12; sum++) {

            System.out.printf(
                "%d\t%,d%n",
                sum,
                frequency[sum]
            );
        }
    }
}