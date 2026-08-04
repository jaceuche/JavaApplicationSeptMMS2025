import java.util.Scanner;

public class RoundingMethods {

    public static double roundToInteger(double x) {
        return Math.floor(x + 0.5);
    }

    public static double roundToTenths(double x) {
        return Math.floor(x * 10 + 0.5) / 10;
    }

    public static double roundToHundredths(double x) {
        return Math.floor(x * 100 + 0.5) / 100;
    }

    public static double roundToThousandths(double x) {
        return Math.floor(x * 1000 + 0.5) / 1000;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");

        double number = input.nextDouble();

        System.out.println("Original: " + number);
        System.out.println("Nearest Integer: " + roundToInteger(number));
        System.out.println("Nearest Tenth: " + roundToTenths(number));
        System.out.println("Nearest Hundredth: " + roundToHundredths(number));
        System.out.println("Nearest Thousandth: " + roundToThousandths(number));

        input.close();
    }
}