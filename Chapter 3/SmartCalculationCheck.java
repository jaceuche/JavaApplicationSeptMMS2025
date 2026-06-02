import java.util.Scanner;

public class SmartCalculationCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] num = new int[10];

        // Input 10 numbers
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            num[i] = input.nextInt();
        }

        // Calculations
        int firstGroup = num[0] + num[4] + num[9];   // 1st, 5th, 10th
        int secondGroup = num[2] + num[7] + num[1];  // 3rd, 8th, 2nd
        int thirdGroup = num[3] + num[6] + num[5] + num[8]; // 4th,7th,6th,9th

        int result = (firstGroup * secondGroup) - thirdGroup;

        // Output result
        System.out.println("Final Result: " + result);

        // Condition check
        if (result >= 100) {
            System.out.println("hurray I did it");
        } else {
            System.out.println("I still need to learn more in Java");
        }
    }
}