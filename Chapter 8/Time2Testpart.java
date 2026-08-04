public class Time2Testpart {

    public static void main(String[] args) {

        Time2 time =
            new Time2(
                23,
                59,
                59
            );

        System.out.println(
            "Initial time: " +
            time
        );

        time.tick();

        System.out.println(
            "After tick: " +
            time
        );

        time.incrementMinute();

        System.out.println(
            "After incrementMinute: " +
            time
        );

        time.incrementHour();

        System.out.println(
            "After incrementHour: " +
            time
        );
    }
}