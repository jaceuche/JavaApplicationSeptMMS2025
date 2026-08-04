public class SavingsAccountTest {

    public static void main(String[] args) {

        SavingsAccount saver1 =
            new SavingsAccount(2000.00);

        SavingsAccount saver2 =
            new SavingsAccount(3000.00);

        SavingsAccount.modifyInterestRate(
            0.04
        );

        System.out.println(
            "Balances at 4% annual interest:"
        );

        for (int month = 1;
             month <= 12;
             month++) {

            saver1.calculateMonthlyInterest();

            saver2.calculateMonthlyInterest();

            System.out.printf(
                "Month %2d: Saver1 = $%.2f, " +
                "Saver2 = $%.2f%n",
                month,
                saver1.getSavingsBalance(),
                saver2.getSavingsBalance()
            );
        }

        SavingsAccount.modifyInterestRate(
            0.05
        );

        saver1.calculateMonthlyInterest();

        saver2.calculateMonthlyInterest();

        System.out.println(
            "\nBalances after changing " +
            "interest rate to 5%:"
        );

        System.out.printf(
            "Saver1 = $%.2f%n",
            saver1.getSavingsBalance()
        );

        System.out.printf(
            "Saver2 = $%.2f%n",
            saver2.getSavingsBalance()
        );
    }
}