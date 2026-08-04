public class DateAndTime {

    private int month;
    private int day;
    private int year;

    private int hour;
    private int minute;
    private int second;

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

    public DateAndTime(
        int month,
        int day,
        int year,
        int hour,
        int minute,
        int second
    ) {

        setDate(
            month,
            day,
            year
        );

        setTime(
            hour,
            minute,
            second
        );
    }

    public void setDate(
        int month,
        int day,
        int year
    ) {

        if (month < 1 ||
            month > 12) {

            throw new IllegalArgumentException(
                "Month must be 1-12"
            );
        }

        int maxDay =
            daysPerMonth[month];

        if (
            month == 2 &&
            isLeapYear(year)
        ) {

            maxDay = 29;
        }

        if (day < 1 ||
            day > maxDay) {

            throw new IllegalArgumentException(
                "Invalid day"
            );
        }

        this.month =
            month;

        this.day =
            day;

        this.year =
            year;
    }

    public void setTime(
        int hour,
        int minute,
        int second
    ) {

        if (hour < 0 ||
            hour >= 24) {

            throw new IllegalArgumentException(
                "Hour must be 0-23"
            );
        }

        if (minute < 0 ||
            minute >= 60) {

            throw new IllegalArgumentException(
                "Minute must be 0-59"
            );
        }

        if (second < 0 ||
            second >= 60) {

            throw new IllegalArgumentException(
                "Second must be 0-59"
            );
        }

        this.hour =
            hour;

        this.minute =
            minute;

        this.second =
            second;
    }

    public void tick() {

        second++;

        if (second >= 60) {

            second = 0;

            incrementMinute();
        }
    }

    public void incrementMinute() {

        minute++;

        if (minute >= 60) {

            minute = 0;

            incrementHour();
        }
    }

    public void incrementHour() {

        hour++;

        if (hour >= 24) {

            hour = 0;

            nextDay();
        }
    }

    public void nextDay() {

        day++;

        int maxDay =
            daysPerMonth[month];

        if (
            month == 2 &&
            isLeapYear(year)
        ) {

            maxDay = 29;
        }

        if (day > maxDay) {

            day = 1;

            month++;

            if (month > 12) {

                month = 1;

                year++;
            }
        }
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

    public String toUniversalString() {

        return String.format(
            "%02d/%02d/%04d %02d:%02d:%02d",
            month,
            day,
            year,
            hour,
            minute,
            second
        );
    }

    @Override
    public String toString() {

        return String.format(
            "%02d/%02d/%04d %d:%02d:%02d %s",
            month,
            day,
            year,
            (
                hour == 0 ||
                hour == 12
            )
                ? 12
                : hour % 12,
            minute,
            second,
            hour < 12
                ? "AM"
                : "PM"
        );
    }
}