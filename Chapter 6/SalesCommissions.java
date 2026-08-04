import java.util.Scanner;

public class SalesCommissions {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] counters = new int[9];

        System.out.print("Enter number of salespeople: ");
        int numberOfSalespeople = input.nextInt();

        for (int i = 1; i <= numberOfSalespeople; i++) {

            System.out.print(
                "Enter gross sales for salesperson " + i + ": "
            );

            double grossSales = input.nextDouble();

            int salary = (int) (200 + 0.09 * grossSales);

            if (salary >= 1000) {
                counters[8]++;
            } else {
                int index = (salary - 200) / 100;

                if (index >= 0 && index < 8) {
                    counters[index]++;
                }
            }
        }

        System.out.println("\nSalary Range\tNumber of Salespeople");

        String[] ranges = {
            "$200-$299",
            "$300-$399",
            "$400-$499",
            "$500-$599",
            "$600-$699",
            "$700-$799",
            "$800-$899",
            "$900-$999",
            "$1000 and over"
        };

        for (int i = 0; i < counters.length; i++) {

            System.out.printf(
                "%-15s %d%n",
                ranges[i],
                counters[i]
            );
        }

        input.close();
    }
}