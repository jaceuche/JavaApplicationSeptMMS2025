import java.util.Scanner;

public class CommandLineArray {

    public static void main(String[] args) {

        int size = 10;

        if (args.length > 0) {

            try {

                size = Integer.parseInt(args[0]);

            } catch (NumberFormatException e) {

                System.out.println(
                    "Invalid argument. Using default size of 10."
                );
            }
        }

        int[] array = new int[size];

        Scanner input = new Scanner(System.in);

        System.out.println(
            "Enter " + size + " integers:"
        );

        for (int i = 0; i < array.length; i++) {

            array[i] = input.nextInt();
        }

        System.out.println("\nArray values:");

        for (int value : array) {

            System.out.println(value);
        }

        input.close();
    }
}