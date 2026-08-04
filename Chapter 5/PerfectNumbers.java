public class PerfectNumbers {

    public static boolean isPerfect(int number) {

        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {

            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }

    public static void displayFactors(int number) {

        System.out.print("Factors: ");

        for (int i = 1; i <= number / 2; i++) {

            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("Perfect numbers between 1 and 1000:");

        for (int number = 1; number <= 1000; number++) {

            if (isPerfect(number)) {

                System.out.println("\n" + number);

                displayFactors(number);
            }
        }
    }
}