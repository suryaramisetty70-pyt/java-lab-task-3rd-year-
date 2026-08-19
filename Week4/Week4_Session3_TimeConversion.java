public class Week4_Session3_TimeConversion {
    public static String timeConversion(String s) {
        String period = s.substring(8);
        int hour = Integer.parseInt(s.substring(0, 2));
        String rest = s.substring(2, 8);

        if (period.equalsIgnoreCase("AM")) {
            if (hour == 12) {
                hour = 0;
            }
        } else {
            if (hour != 12) {
                hour += 12;
            }
        }

        return String.format("%02d", hour) + rest;
    }

    public static void main(String[] args) {
        String time12 = "07:05:45PM";
        String time24 = timeConversion(time12);

        System.out.println("12-Hour Time: " + time12);
        System.out.println("24-Hour Time: " + time24);
    }
}

/*
OUTPUT:
12-Hour Time: 07:05:45PM
24-Hour Time: 19:05:45
*/
