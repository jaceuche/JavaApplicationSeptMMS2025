import java.util.Scanner;

public class ParkingCharges {

    public static double calculateCharges(double hours) {

        double charge = 2.0;

        if (hours > 3) {
            charge += Math.ceil(hours - 3) * 0.5;
        }

        if (charge > 10.0) {
            charge = 10.0;
        }

        return charge;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double total = 0;

        char choice;

        do {

            System.out.print("Enter hours parked: ");
            double hours = input.nextDouble();

            double charge = calculateCharges(hours);

            total += charge;

            System.out.printf("Charge: $%.2f%n", charge);
            System.out.printf("Running Total: $%.2f%n", total);

            System.out.print("Another customer? (y/n): ");
            choice = input.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        input.close();
    }
}