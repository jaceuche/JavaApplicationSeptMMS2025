import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sales = 0;
        int item;

        System.out.println("Enter item number (1-4), 0 to stop:");

        while ((item = input.nextInt()) != 0) {
            switch (item) {
                case 1: sales += 239.99; break;
                case 2: sales += 129.75; break;
                case 3: sales += 99.95; break;
                case 4: sales += 350.89; break;
            }
        }

        double salary = 200 + (0.09 * sales);

        System.out.println("Salary = $" + salary);
    }
}