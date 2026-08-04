// File: BasePlusCommissionEmployee.java
public class BasePlusCommissionEmployee {
    private final CommissionEmployee commissionEmployee; // Composition (HAS-A)
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName,
            String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        this.commissionEmployee = new CommissionEmployee(firstName, lastName, 
            socialSecurityNumber, grossSales, commissionRate);
        setBaseSalary(baseSalary);
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() { return baseSalary; }

    public String getFirstName() { return commissionEmployee.getFirstName(); }
    public String getLastName() { return commissionEmployee.getLastName(); }
    public String getSocialSecurityNumber() { return commissionEmployee.getSocialSecurityNumber(); }

    public void setGrossSales(double grossSales) { commissionEmployee.setGrossSales(grossSales); }
    public double getGrossSales() { return commissionEmployee.getGrossSales(); }

    public void setCommissionRate(double commissionRate) { commissionEmployee.setCommissionRate(commissionRate); }
    public double getCommissionRate() { return commissionEmployee.getCommissionRate(); }

    public double earnings() {
        return getBaseSalary() + commissionEmployee.earnings();
    }

    @Override
    public String toString() {
        return String.format("%s %s%n%s: %.2f", "base-salaried",
            commissionEmployee.toString(), "base salary", getBaseSalary());
    }
}