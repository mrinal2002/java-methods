import java.util.Scanner;

public class Calendar {
    private static final String[] MONTHS = {"", "January", "February", "March", "April", "May", "June", "July",
            "August", "September", "October", "November", "December"};
    private static final int[] DAYS = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getFirstDay(int year, int month) {
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + (31 * m) / 12) % 7;
    }

    public static void displayCalendar(int year, int month) {
        System.out.println("   " + MONTHS[month] + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        int daysInMonth = (month == 2 && isLeapYear(year)) ? 29 : DAYS[month];
        int startDay = getFirstDay(year, month);

        for (int i = 0; i < startDay; i++) System.out.print("   ");
        for (int i = 1; i <= daysInMonth; i++) {
            System.out.printf("%2d ", i);
            if ((i + startDay) % 7 == 0) System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month and year: ");
        int month = sc.nextInt(), year = sc.nextInt();
        displayCalendar(year, month);
    }
}
