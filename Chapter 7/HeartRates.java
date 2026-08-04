import java.time.LocalDate;
import java.time.Period;

public class HeartRates {
    private String firstName;
    private String lastName;
    private int birthMonth;
    private int birthDay;
    private int birthYear;

    public HeartRates(String firstName, String lastName, int birthMonth, int birthDay, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
    }

    // Getters and Setters
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public int getBirthMonth() { return birthMonth; }
    public void setBirthMonth(int birthMonth) { this.birthMonth = birthMonth; }

    public int getBirthDay() { return birthDay; }
    public void setBirthDay(int birthDay) { this.birthDay = birthDay; }

    public int getBirthYear() { return birthYear; }
    public void setBirthYear(int birthYear) { this.birthYear = birthYear; }

    public int getAge() {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(birthYear, birthMonth, birthDay);
        return Period.between(birthday, today).getYears();
    }

    public int getMaxHeartRate() {
        return 220 - getAge();
    }

    public String getTargetHeartRate() {
        int maxRate = getMaxHeartRate();
        int minTarget = (int) (maxRate * 0.50);
        int maxTarget = (int) (maxRate * 0.85);
        return minTarget + " - " + maxTarget + " bpm";
    }
}