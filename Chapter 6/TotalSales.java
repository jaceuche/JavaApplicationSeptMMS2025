import java.util.Scanner;

public class TotalSales {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[][] sales = new double[4][5];

        System.out.println(
            "Enter sales for 4 salespeople and 5 products."
        );

        for (int salesperson = 0;
             salesperson < sales.length;
             salesperson++) {

            for (int product = 0;
                 product < sales[salesperson].length;
                 product++) {

                System.out.print(
                    "Salesperson " +
                    (salesperson + 1) +
                    ", Product " +
                    (product + 1) +
                    ": "
                );

                sales[salesperson][product] =
                    input.nextDouble();
            }
        }

        System.out.println(
            "\nSalesperson Totals:"
        );

        for (int salesperson = 0;
             salesperson < sales.length;
             salesperson++) {

            double total = 0;

            for (int product = 0;
                 product < sales[salesperson].length;
                 product++) {

                total += sales[salesperson][product];
            }

            System.out.printf(
                "Salesperson %d: $%.2f%n",
                salesperson + 1,
                total
            );
        }

        System.out.println(
            "\nProduct Totals:"
        );

        for (int product = 0; product < 5; product++) {

            double total = 0;

            for (int salesperson = 0;
                 salesperson < 4;
                 salesperson++) {

                total += sales[salesperson][product];
            }

            System.out.printf(
                "Product %d: $%.2f%n",
                product + 1,
                total
            );
        }

        input.close();
    }
}