import java.util.Scanner;

public class RoundNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");

        double number = input.nextDouble();

        double rounded = Math.floor(number + 0.5);

        System.out.println("Original Number: " + number);

        System.out.println("Rounded Number: " + rounded);

        input.close();
    }
}