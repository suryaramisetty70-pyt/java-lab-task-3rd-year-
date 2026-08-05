import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Week3_Session11_DaysBetweenDates {
    public static int daysBetweenDates(String date1, String date2) {
        LocalDate d1 = LocalDate.parse(date1);
        LocalDate d2 = LocalDate.parse(date2);
        return (int) Math.abs(ChronoUnit.DAYS.between(d1, d2));
    }

    public static void main(String[] args) {
        String date1 = "2020-01-15";
        String date2 = "2020-02-20";

        int days = daysBetweenDates(date1, date2);

        System.out.println("Date 1: " + date1);
        System.out.println("Date 2: " + date2);
        System.out.println("Days between dates: " + days);
    }
}

/*
OUTPUT:
Date 1: 2020-01-15
Date 2: 2020-02-20
Days between dates: 36
*/
