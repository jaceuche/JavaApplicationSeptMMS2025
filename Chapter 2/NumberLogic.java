import java.util.Scanner;

public class NumberLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(Scanner.in);
        
        // --- STEP 1: Accept the first three numbers using a repetition statement ---
        int sum = 0;
        System.out.println("Enter the first three numbers:");
        
        int count = 1;
        while (count <= 3) {
            System.out.print("Number " + count + ": ");
            sum += scanner.nextInt();
            count++;
        }
        
        System.out.println("\nThe sum of the first three numbers is: " + sum);
        
        // --- STEP 2: Conditional logic based on the sum ---
        // Check if sum is even (sum % 2 == 0) AND divisible by 10 (sum % 10 == 0)
        if (sum % 2 == 0 && sum % 10 == 0) {
            
            // If true, accept a new set of three numbers
            System.out.println("\nCondition met (Even and Divisible by 10)!");
            System.out.println("Enter another three numbers to find their product:");
            
            long product = 1; // Using long to prevent integer overflow during multiplication
            
            for (int i = 1; i <= 3; i++) {
                System.out.print("New Number " + i + ": ");
                product *= scanner.nextInt();
            }
            
            System.out.println("The product is: " + product);
            
            // Check if the product is greater than 200
            if (product > 200) {
                System.out.println("hurray");
            } else {
                System.out.println(",");
            }
            
        } else {
            // Otherwise condition: sum is NOT divisible by 10 AND sum is NOT > 200
            if (sum % 10 != 0 && sum <= 200) {
                System.out.println("do it your self.");
            }
        }
        
        scanner.close();
    }
}