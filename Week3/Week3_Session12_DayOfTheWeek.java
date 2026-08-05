import java.time.LocalDate;

public class Week3_Session12_DayOfTheWeek {
    public static String dayOfTheWeek(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        String name = date.getDayOfWeek().name();
        return name.charAt(0) + name.substring(1).toLowerCase();
    }

    public static void main(String[] args) {
        int day = 31, month = 8, year = 2019;
        String dayName = dayOfTheWeek(day, month, year);

        System.out.println("Date: " + day + "/" + month + "/" + year);
        System.out.println("Day of the week: " + dayName);
    }
}

/*
OUTPUT:
Date: 31/8/2019
Day of the week: Saturday
*/
