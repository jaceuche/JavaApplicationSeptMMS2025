public class Time2Test {

    public static void main(String[] args) {

        Time2 time = new Time2(
            13,
            27,
            6
        );

        System.out.println(
            "Universal time: " +
            time.toUniversalString()
        );

        System.out.println(
            "Standard time: " +
            time.toString()
        );

        time.setHour(15);

        time.setMinute(30);

        time.setSecond(45);

        System.out.println(
            "After modification:"
        );

        System.out.println(
            "Universal time: " +
            time.toUniversalString()
        );

        System.out.println(
            "Standard time: " +
            time.toString()
        );
    }
}