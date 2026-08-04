// File: Employee.java (Payable version)
public abstract class Employee implements Payable {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getSocialSecurityNumber() { return socialSecurityNumber; }

    @Override
    public double getPaymentAmount() {
        return earnings(); // Polymorphically calls earnings()
    }

    public abstract double earnings();

    @Override
    public String toString() {
        return String.format("%s %s%nsocial security number: %s", 
            getFirstName(), getLastName(), getSocialSecurityNumber());
    }
}