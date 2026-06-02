import java.util.Scanner;

public class CreditLimit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Account Number: ");
        int account = input.nextInt();

        System.out.print("Beginning Balance: ");
        int balance = input.nextInt();

        System.out.print("Charges: ");
        int charges = input.nextInt();

        System.out.print("Credits: ");
        int credits = input.nextInt();

        System.out.print("Credit Limit: ");
        int limit = input.nextInt();

        int newBalance = balance + charges - credits;

        System.out.println("New Balance = " + newBalance);

        if (newBalance > limit)
            System.out.println("Credit limit exceeded");
    }
}