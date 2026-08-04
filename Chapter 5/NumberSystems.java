public class NumberSystems {

    public static void main(String[] args) {

        System.out.printf(
            "%-10s %-15s %-15s %-15s%n",
            "Decimal",
            "Binary",
            "Octal",
            "Hexadecimal"
        );

        System.out.println(
            "-------------------------------------------------------"
        );

        for (int number = 1; number <= 256; number++) {

            String binary = Integer.toBinaryString(number);

            String octal = Integer.toOctalString(number);

            String hexadecimal = Integer.toHexString(number).toUpperCase();

            System.out.printf(
                "%-10d %-15s %-15s %-15s%n",
                number,
                binary,
                octal,
                hexadecimal
            );
        }
    }
}