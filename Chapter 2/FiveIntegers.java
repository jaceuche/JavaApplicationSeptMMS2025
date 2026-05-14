import java.util.Scanner;

public class FiveIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {
            int n = input.nextInt();

            if (n > max) max = n;
            if (n < min) min = n;
        }

        System.out.println("Largest = " + max);
        System.out.println("Smallest = " + min);
    }
}
