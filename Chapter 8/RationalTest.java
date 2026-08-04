public class RationalTest {

    public static void main(
        String[] args
    ) {

        Rational number1 =
            new Rational(
                2,
                4
            );

        Rational number2 =
            new Rational(
                3,
                6
            );

        System.out.println(
            "Rational number 1: " +
            number1
        );

        System.out.println(
            "Rational number 2: " +
            number2
        );

        Rational sum =
            Rational.add(
                number1,
                number2
            );

        System.out.println(
            "Addition: " +
            sum
        );

        Rational difference =
            Rational.subtract(
                number1,
                number2
            );

        System.out.println(
            "Subtraction: " +
            difference
        );

        Rational product =
            Rational.multiply(
                number1,
                number2
            );

        System.out.println(
            "Multiplication: " +
            product
        );

        Rational quotient =
            Rational.divide(
                number1,
                number2
            );

        System.out.println(
            "Division: " +
            quotient
        );

        System.out.println(
            "Number 1 as floating point: " +
            number1.toFloatingPointString(
                4
            )
        );
    }
}