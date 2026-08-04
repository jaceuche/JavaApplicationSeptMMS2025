public class DateTest {

    public static void main(String[] args) {

        Date date =
            new Date(
                12,
                30,
                2026
            );

        for (int i = 0;
             i < 5;
             i++) {

            System.out.println(
                date
            );

            date.nextDay();
        }

        System.out.println();

        Date newYear =
            new Date(
                12,
                30,
                2026
            );

        for (int i = 0;
             i < 5;
             i++) {

            System.out.println(
                newYear
            );

            newYear.nextDay();
        }
    }
}