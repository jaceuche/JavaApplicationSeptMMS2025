import java.util.Scanner;

public class EvenOdd {

    public static boolean isEven(int number) {

        return number % 2 == 0;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        int number = input.nextInt();

        if(isEven(number))
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");

        input.close();
    }
}