public class DateTest {

    public static void main(
        String[] args
    ) {

        Date date1 =
            new Date(
                6,
                14,
                1992
            );

        Date date2 =
            new Date(
                "June",
                14,
                1992
            );

        Date date3 =
            new Date(
                166,
                1992
            );

        System.out.println(
            "Date 1:"
        );

        System.out.println(
            date1.toString1()
        );

        System.out.println(
            date1.toString2()
        );

        System.out.println(
            date1.toString3()
        );

        System.out.println();

        System.out.println(
            "Date 2:"
        );

        System.out.println(
            date2.toString1()
        );

        System.out.println(
            date2.toString2()
        );

        System.out.println(
            date2.toString3()
        );

        System.out.println();

        System.out.println(
            "Date 3:"
        );

        System.out.println(
            date3.toString1()
        );

        System.out.println(
            date3.toString2()
        );

        System.out.println(
            date3.toString3()
        );
    }
}