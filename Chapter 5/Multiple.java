import java.util.Scanner;

public class Multiple {

    public static boolean isMultiple(int first, int second) {

        return second % first == 0;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = input.nextInt();

        System.out.print("Enter second number: ");
        int second = input.nextInt();

        if(isMultiple(first, second))
            System.out.println(second + " is a multiple of " + first);
        else
            System.out.println(second + " is NOT a multiple of " + first);

        input.close();
    }
}