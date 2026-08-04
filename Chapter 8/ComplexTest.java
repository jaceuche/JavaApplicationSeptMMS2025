public class ComplexTest {

    public static void main(
        String[] args
    ) {

        Complex number1 =
            new Complex(
                3.5,
                2.5
            );

        Complex number2 =
            new Complex(
                1.5,
                4.5
            );

        System.out.print(
            "Complex number 1: "
        );

        number1.print();

        System.out.print(
            "Complex number 2: "
        );

        number2.print();

        Complex sum =
            number1.add(
                number2
            );

        System.out.print(
            "Sum: "
        );

        sum.print();

        Complex difference =
            number1.subtract(
                number2
            );

        System.out.print(
            "Difference: "
        );

        difference.print();

        Complex defaultNumber =
            new Complex();

        System.out.print(
            "Default complex number: "
        );

        defaultNumber.print();
    }
}