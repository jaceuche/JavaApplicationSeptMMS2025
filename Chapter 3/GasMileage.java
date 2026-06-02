import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int miles, gallons;
        int totalMiles = 0;
        int totalGallons = 0;

        System.out.print("Enter miles (-1 to quit): ");
        miles = input.nextInt();

        while (miles != -1) {
            System.out.print("Enter gallons used: ");
            gallons = input.nextInt();

            double mpg = (double) miles / gallons;
            System.out.println("MPG = " + mpg);

            totalMiles += miles;
            totalGallons += gallons;

            System.out.println("Overall MPG = " +
                    (double) totalMiles / totalGallons);

            System.out.print("Enter miles (-1 to quit): ");
            miles = input.nextInt();
        }
    }
}