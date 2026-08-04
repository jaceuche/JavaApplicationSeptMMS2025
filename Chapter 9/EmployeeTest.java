// File: EmployeeTest.java
public class EmployeeTest {
    public static void main(String[] args) {
        CommissionEmployee commissionEmployee = new CommissionEmployee(
            "Sue", "Jones", "222-22-2222", 10000.00, 0.06);

        BasePlusCommissionEmployee basePlusEmployee = new BasePlusCommissionEmployee(
            "Bob", "Lewis", "333-33-3333", 5000.00, 0.04, 300.00);

        System.out.printf("%s:%n%n%s%n%s $%.2f%n%n", 
            "Commission Employee", commissionEmployee, "Earnings", commissionEmployee.earnings());

        System.out.printf("%s:%n%n%s%n%s $%.2f%n", 
            "Base Plus Commission Employee", basePlusEmployee, "Earnings", basePlusEmployee.earnings());
    }
}