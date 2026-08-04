import java.util.Scanner;

public class FibonacciSeries {

    public static int fibonacci(
        int n
    ) {

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        int first = 0;

        int second = 1;

        int result = 0;

        for (int i = 2;
             i <= n;
             i++) {

            result =
                first + second;

            first = second;

            second = result;
        }

        return second;
    }

    public static double fibonacciDouble(
        int n
    ) {

        if (n == 0) {
            return 0.0;
        }

        if (n == 1) {
            return 1.0;
        }

        double first = 0.0;

        double second = 1.0;

        double result = 0.0;

        for (int i = 2;
             i <= n;
             i++) {

            result =
                first + second;

            first = second;

            second = result;
        }

        return second;
    }

    public static void main(String[] args) {

        Scanner input =
            new Scanner(System.in);

        System.out.print(
            "Enter n: "
        );

        int n =
            input.nextInt();

        System.out.println(
            "Fibonacci(" +
            n +
            ") = " +
            fibonacci(n)
        );

        System.out.println(
            "Double Fibonacci(" +
            n +
            ") = " +
            fibonacciDouble(n)
        );

        input.close();
    }
}