import java.util.Scanner;

public class ReverseDigits {

    public static int reverse(int number) {

        int reversed = 0;

        while (number != 0) {

            int digit = number % 10;

            reversed = reversed * 10 + digit;

            number = number / 10;
        }

        return reversed;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        int number = input.nextInt();

        System.out.println("Original number: " + number);

        System.out.println("Reversed number: " + reverse(number));

        input.close();
    }
}