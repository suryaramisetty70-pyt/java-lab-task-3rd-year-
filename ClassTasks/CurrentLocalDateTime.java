import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CurrentLocalDateTime {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.of(2026, 8, 7);
        LocalTime currentTime = LocalTime.of(12, 4, 13);
        LocalDateTime currentDateTime = LocalDateTime.of(currentDate, currentTime);

        System.out.println("Current Date: " + currentDate);
        System.out.println("Current Time: " + currentTime);
        System.out.println("Current Date and Time: " + currentDateTime);
    }
}

/*
OUTPUT:
Current Date: 2026-08-07
Current Time: 12:04:13
Current Date and Time: 2026-08-07T12:04:13
*/
