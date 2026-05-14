import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b;

        System.out.print("Enter first integer: ");
        a = input.nextInt();

        System.out.print("Enter second integer: ");
        b = input.nextInt();

        System.out.println("Sum = " + (a + b));
        System.out.println("Product = " + (a * b));
        System.out.println("Difference = " + (a - b));
        System.out.println("Quotient = " + (a / b));
    }
}