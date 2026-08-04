public class PrimeNumbers {

    public static boolean isPrime(int number) {

        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {

            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int count = 0;

        System.out.println("Prime numbers less than 10,000:");

        for (int number = 2; number < 10000; number++) {

            if (isPrime(number)) {

                System.out.print(number + " ");

                count++;
            }
        }

        System.out.println("\n\nTotal prime numbers: " + count);
    }
}