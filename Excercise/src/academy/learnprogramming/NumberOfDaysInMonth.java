package academy.learnprogramming;

public class NumberOfDaysInMonth {
    public static int getDaysInMonth(int month, int year) {
        int days = 30;
        if (month < 1 || month > 12) {
            days = -1;
        } else if (year < 1 || year > 9999) {
            days = -1;
        } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days = 31;
                    break;
                case 2:
                    boolean isLeapYear = LeapYear.isLeapYear(year);
                    days = isLeapYear ? 29 : 28;
                    break;
            }
        }

        return days;
    }
}
