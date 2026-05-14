import java.util.Scanner;

public class CompareIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b;

        System.out.print("Enter first integer: ");
        a = input.nextInt();

        System.out.print("Enter second integer: ");
        b = input.nextInt();

        if (a > b)
            System.out.println(a + " is larger");
        else if (b > a)
            System.out.println(b + " is larger");
        else
            System.out.println("These numbers are equal");
    }
}
