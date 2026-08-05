import java.time.LocalDate;

public class Week3_Session12_DayOfTheYear {
    public static int dayOfYear(String date) {
        return LocalDate.parse(date).getDayOfYear();
    }

    public static void main(String[] args) {
        String date = "2019-01-09";
        int dayNum = dayOfYear(date);

        System.out.println("Date: " + date);
        System.out.println("Day of the year: " + dayNum);
    }
}

/*
OUTPUT:
Date: 2019-01-09
Day of the year: 9
*/
