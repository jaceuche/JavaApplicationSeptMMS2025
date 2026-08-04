public class DateAndTimeTest {

    public static void main(
        String[] args
    ) {

        DateAndTime dateAndTime =
            new DateAndTime(
                12,
                31,
                2026,
                23,
                59,
                59
            );

        System.out.println(
            "Initial date and time:"
        );

        System.out.println(
            dateAndTime
        );

        System.out.println(
            "Universal format:"
        );

        System.out.println(
            dateAndTime.toUniversalString()
        );

        dateAndTime.incrementHour();

        System.out.println(
            "\nAfter incrementing hour:"
        );

        System.out.println(
            dateAndTime
        );

        System.out.println(
            "Universal format:"
        );

        System.out.println(
            dateAndTime.toUniversalString()
        );
    }
}