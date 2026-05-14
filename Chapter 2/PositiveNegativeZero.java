import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pos = 0, neg = 0, zero = 0;

        for (int i = 0; i < 5; i++) {
            int n = input.nextInt();

            if (n > 0) pos++;
            else if (n < 0) neg++;
            else zero++;
        }

        System.out.println("Positive: " + pos);
        System.out.println("Negative: " + neg);
        System.out.println("Zero: " + zero);
    }
}
