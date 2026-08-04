// File: HourlyEmployeeTest.java
public class HourlyEmployeeTest {
    public static void main(String[] args) {
        HourlyEmployee employee1 = new HourlyEmployee("Karen", "Price", "111-11-1111", 16.75, 40.0);
        HourlyEmployee employee2 = new HourlyEmployee("John", "Smith", "444-44-4444", 20.00, 50.0);

        System.out.printf("%s:%n%n%s%n%s $%.2f%n%n", 
            "Regular Hours", employee1, "Earnings", employee1.earnings());

        System.out.printf("%s:%n%n%s%n%s $%.2f%n", 
            "Overtime Hours", employee2, "Earnings", employee2.earnings());
    }
}