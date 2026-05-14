import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        if (a % b == 0)
            System.out.println("Multiple");
        else
            System.out.println("Not multiple");
    }
}