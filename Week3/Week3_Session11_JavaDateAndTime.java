import java.time.LocalDate;

public class Week3_Session11_JavaDateAndTime {
    public static String findDay(int month, int day, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().name();
    }

    public static void main(String[] args) {
        int month = 8;
        int day = 5;
        int year = 2026;

        String dayOfWeek = findDay(month, day, year);

        System.out.println("Date: " + month + "/" + day + "/" + year);
        System.out.println("Day of the week: " + dayOfWeek);
    }
}

/*
OUTPUT:
Date: 8/5/2026
Day of the week: WEDNESDAY
*/
