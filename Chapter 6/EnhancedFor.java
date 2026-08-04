public class EnhancedFor {

    public static void main(String[] args) {

        double sum = 0.0;

        for (String argument : args) {

            double value = Double.parseDouble(argument);

            sum += value;
        }

        System.out.println(
            "Sum = " + sum
        );
    }
}