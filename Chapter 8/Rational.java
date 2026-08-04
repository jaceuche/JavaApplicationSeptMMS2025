public class Rational {

    private int numerator;
    private int denominator;

    public Rational() {

        this(
            0,
            1
        );
    }

    public Rational(
        int numerator,
        int denominator
    ) {

        if (denominator == 0) {

            throw new IllegalArgumentException(
                "Denominator cannot be zero."
            );
        }

        if (denominator < 0) {

            numerator = -numerator;

            denominator = -denominator;
        }

        int gcd =
            gcd(
                Math.abs(numerator),
                denominator
            );

        this.numerator =
            numerator / gcd;

        this.denominator =
            denominator / gcd;
    }

    private static int gcd(
        int a,
        int b
    ) {

        while (b != 0) {

            int remainder =
                a % b;

            a = b;

            b = remainder;
        }

        return a;
    }

    public static Rational add(
        Rational r1,
        Rational r2
    ) {

        return new Rational(
            r1.numerator *
                r2.denominator
            +
            r2.numerator *
                r1.denominator,

            r1.denominator *
                r2.denominator
        );
    }

    public static Rational subtract(
        Rational r1,
        Rational r2
    ) {

        return new Rational(
            r1.numerator *
                r2.denominator
            -
            r2.numerator *
                r1.denominator,

            r1.denominator *
                r2.denominator
        );
    }

    public static Rational multiply(
        Rational r1,
        Rational r2
    ) {

        return new Rational(
            r1.numerator *
                r2.numerator,

            r1.denominator *
                r2.denominator
        );
    }

    public static Rational divide(
        Rational r1,
        Rational r2
    ) {

        if (r2.numerator == 0) {

            throw new ArithmeticException(
                "Cannot divide by zero."
            );
        }

        return new Rational(
            r1.numerator *
                r2.denominator,

            r1.denominator *
                r2.numerator
        );
    }

    public String toFractionString() {

        return numerator +
            "/" +
            denominator;
    }

    public String toFloatingPointString(
        int precision
    ) {

        return String.format(
            "%." +
            precision +
            "f",
            (double) numerator /
            denominator
        );
    }

    @Override
    public String toString() {

        return toFractionString();
    }
}