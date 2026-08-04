public class Date {

    private int month;
    private int day;
    private int year;

    private static final String[] monthNames = {
        "",
        "January",
        "February",
        "March",
        "April",
        "May",
        "June",
        "July",
        "August",
        "September",
        "October",
        "November",
        "December"
    };

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

    // Constructor: MM/DD/YYYY
    public Date(
        int month,
        int day,
        int year
    ) {

        setDate(
            month,
            day,
            year
        );
    }

    // Constructor: June 14, 1992
    public Date(
        String monthName,
        int day,
        int year
    ) {

        int monthNumber = 0;

        for (int i = 1;
             i <= 12;
             i++) {

            if (
                monthNames[i]
                .equals(monthName)
            ) {

                monthNumber = i;

                break;
            }
        }

        if (monthNumber == 0) {

            throw new IllegalArgumentException(
                "Invalid month name."
            );
        }

        setDate(
            monthNumber,
            day,
            year
        );
    }

    // Constructor: DDD YYYY
    public Date(
        int dayOfYear,
        int year
    ) {

        if (
            dayOfYear < 1 ||
            dayOfYear >
            (isLeapYear(year)
                ? 366
                : 365)
        ) {

            throw new IllegalArgumentException(
                "Invalid day of year."
            );
        }

        this.year = year;

        month = 1;

        day = dayOfYear;

        while (
            day >
            getDaysInMonth(
                month,
                year
            )
        ) {

            day -=
                getDaysInMonth(
                    month,
                    year
                );

            month++;
        }
    }

    private void setDate(
        int month,
        int day,
        int year
    ) {

        if (
            month < 1 ||
            month > 12
        ) {

            throw new IllegalArgumentException(
                "Invalid month."
            );
        }

        int maxDay =
            getDaysInMonth(
                month,
                year
            );

        if (
            day < 1 ||
            day > maxDay
        ) {

            throw new IllegalArgumentException(
                "Invalid day."
            );
        }

        this.month = month;
        this.day = day;
        this.year = year;
    }

    private boolean isLeapYear(
        int year
    ) {

        return
            year % 400 == 0 ||
            (
                year % 4 == 0 &&
                year % 100 != 0
            );
    }

    private int getDaysInMonth(
        int month,
        int year
    ) {

        if (
            month == 2 &&
            isLeapYear(year)
        ) {

            return 29;
        }

        return daysPerMonth[month];
    }

    public String toString1() {

        return String.format(
            "%02d/%02d/%04d",
            month,
            day,
            year
        );
    }

    public String toString2() {

        return String.format(
            "%s %d, %d",
            monthNames[month],
            day,
            year
        );
    }

    public String toString3() {

        return String.format(
            "%03d %d",
            getDayOfYear(),
            year
        );
    }

    private int getDayOfYear() {

        int totalDays = day;

        for (int i = 1;
             i < month;
             i++) {

            totalDays +=
                getDaysInMonth(
                    i,
                    year
                );
        }

        return totalDays;
    }

    @Override
    public String toString() {

        return toString1();
    }
}