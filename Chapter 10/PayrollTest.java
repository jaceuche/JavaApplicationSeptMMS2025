// File: PayrollTest.java
import java.util.Calendar;

public class PayrollTest {
    public static void main(String[] args) {
        int currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1; // Calendar months are 0-based

        Employee[] employees = new Employee[2];

        // One employee born in current month, one in another month
        employees[0] = new SalariedEmployee("John", "Smith", "111-11-1111", 
            new Date(currentMonth, 15, 1990), 800.00);
        employees[1] = new SalariedEmployee("Lisa", "Barnes", "222-22-2222", 
            new Date((currentMonth % 12) + 1, 10, 1985), 1200.00);

        System.out.printf("Current Month for Payroll: %d%n%n", currentMonth);

        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);

            double totalEarnings = currentEmployee.earnings();
            if (currentEmployee.getBirthDate().getMonth() == currentMonth) {
                totalEarnings += 100.00;
                System.out.println("--> Happy Birthday! A $100.00 bonus has been added.");
            }

            System.out.printf("Earned: $%.2f%n%n", totalEarnings);
        }
    }
}