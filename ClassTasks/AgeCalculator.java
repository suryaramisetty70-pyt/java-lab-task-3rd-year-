import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(2005, 5, 15);
        LocalDate currentDate = LocalDate.of(2026, 8, 7);

        Period period = Period.between(birthDate, currentDate);

        System.out.println("Birth Date: " + birthDate);
        System.out.println("Current Date: " + currentDate);
        System.out.println("Age: " + period.getYears() + " Years, " + period.getMonths() + " Months, " + period.getDays() + " Days");
    }
}

/*
OUTPUT:
Birth Date: 2005-05-15
Current Date: 2026-08-07
Age: 21 Years, 2 Months, 23 Days
*/
