public class SieveOfEratosthenes {

    public static void main(String[] args) {

        boolean[] prime =
            new boolean[1000];

        // Initialize all elements to true
        for (int i = 0;
             i < prime.length;
             i++) {

            prime[i] = true;
        }

        prime[0] = false;
        prime[1] = false;

        for (int i = 2;
             i < prime.length;
             i++) {

            if (prime[i]) {

                for (int j = i * 2;
                     j < prime.length;
                     j += i) {

                    prime[j] = false;
                }
            }
        }

        System.out.println(
            "Prime numbers between 2 and 999:"
        );

        for (int i = 2;
             i < prime.length;
             i++) {

            if (prime[i]) {

                System.out.print(
                    i + " "
                );
            }
        }
    }
}