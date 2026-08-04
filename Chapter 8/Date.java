public class Date {

    private int month;
    private int day;
    private int year;

    private static final int[] daysPerMonth = {
        0,
        31,
        28,
        31,
        30,
        31,
        30,
        31,
        31,
        30,
        31,
        30,
        31
    };

    public Date(
        int month,
        int day,
        int year
    ) {

        if (month <= 0 ||
            month > 12) {

            throw new IllegalArgumentException(
                "month must be 1-12"
            );
        }

        if (day <= 0 ||
            day > daysPerMonth[month]) {

            if (!(month == 2 &&
                  day == 29 &&
                  isLeapYear(year))) {

                throw new IllegalArgumentException(
                    "Invalid day"
                );
            }
        }

        this.month = month;
        this.day = day;
        this.year = year;
    }

    private boolean isLeapYear(
        int year
    ) {

        return year % 400 == 0 ||
            (year % 4 == 0 &&
             year % 100 != 0);
    }

    public void nextDay() {

        day++;

        int daysInMonth =
            daysPerMonth[month];

        if (month == 2 &&
            isLeapYear(year)) {

            daysInMonth = 29;
        }

        if (day > daysInMonth) {

            day = 1;

            month++;

            if (month > 12) {

                month = 1;

                year++;
            }
        }
    }

    public String toString() {

        return String.format(
            "%02d/%02d/%04d",
            month,
            day,
            year
        );
    }
}