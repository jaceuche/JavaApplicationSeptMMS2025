import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int r = input.nextInt();

        System.out.printf("Diameter = %d%n", 2 * r);
        System.out.printf("Circumference = %f%n", 2 * Math.PI * r);
        System.out.printf("Area = %f%n", Math.PI * r * r);
    }
}
