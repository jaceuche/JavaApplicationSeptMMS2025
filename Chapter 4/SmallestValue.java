import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers will you enter? ");
        int count = input.nextInt();

        System.out.print("Enter first number: ");
        int smallest = input.nextInt();

        for (int i = 2; i <= count; i++) {
            System.out.print("Enter next number: ");
            int number = input.nextInt();
            if (number < smallest)
                smallest = number;
        }

        System.out.println("The smallest value is: " + smallest);
    }
}