import java.util.Scanner;

public class HeartRatesTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = input.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Enter Birth Month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter Birth Day (1-31): ");
        int day = input.nextInt();

        System.out.print("Enter Birth Year (YYYY): ");
        int year = input.nextInt();

        HeartRates person = new HeartRates(firstName, lastName, month, day, year);

        System.out.println("\n--- HEART RATE REPORT ---");
        System.out.printf("Name: %s %s%n", person.getFirstName(), person.getLastName());
        System.out.printf("Date of Birth: %d/%d/%d%n", person.getBirthMonth(), person.getBirthDay(), person.getBirthYear());
        System.out.printf("Age: %d years%n", person.getAge());
        System.out.printf("Maximum Heart Rate: %d bpm%n", person.getMaxHeartRate());
        System.out.printf("Target Heart Rate Range: %s%n", person.getTargetHeartRate());
    }
}