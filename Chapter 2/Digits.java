import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        System.out.print(n / 10000 + "   ");
        System.out.print((n / 1000) % 10 + "   ");
        System.out.print((n / 100) % 10 + "   ");
        System.out.print((n / 10) % 10 + "   ");
        System.out.print(n % 10);
    }
}
