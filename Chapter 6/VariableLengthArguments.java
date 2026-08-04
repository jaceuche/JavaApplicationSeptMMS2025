public class VariableLengthArguments {

    public static int product(int... numbers) {

        int result = 1;

        for (int number : numbers) {
            result *= number;
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(
            "Product of 2 numbers: " +
            product(2, 3)
        );

        System.out.println(
            "Product of 3 numbers: " +
            product(2, 3, 4)
        );

        System.out.println(
            "Product of 4 numbers: " +
            product(1, 2, 3, 4)
        );

        System.out.println(
            "Product of 5 numbers: " +
            product(1, 2, 3, 4, 5)
        );
    }
}