public class Complex {

    private double realPart;

    private double imaginaryPart;

    public Complex() {

        this(
            0.0,
            0.0
        );
    }

    public Complex(
        double realPart,
        double imaginaryPart
    ) {

        this.realPart =
            realPart;

        this.imaginaryPart =
            imaginaryPart;
    }

    public Complex add(
        Complex other
    ) {

        return new Complex(
            realPart +
            other.realPart,

            imaginaryPart +
            other.imaginaryPart
        );
    }

    public Complex subtract(
        Complex other
    ) {

        return new Complex(
            realPart -
            other.realPart,

            imaginaryPart -
            other.imaginaryPart
        );
    }

    public void print() {

        System.out.printf(
            "(%.2f, %.2f)%n",
            realPart,
            imaginaryPart
        );
    }
}