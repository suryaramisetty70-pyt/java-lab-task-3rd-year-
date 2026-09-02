public class Week5_Session3_StringToIntegerAtoi {
    public static int myAtoi(String s) {
        if (s == null || s.length() == 0) return 0;

        int i = 0, n = s.length();
        while (i < n && s.charAt(i) == ' ') i++;

        if (i >= n) return 0;

        int sign = 1;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        long result = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');
            if (sign == 1 && result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign == -1 && -result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }

        return (int) (result * sign);
    }

    public static void main(String[] args) {
        String str1 = "   -042";
        String str2 = "1337c0d3";

        System.out.println("String 1: \"" + str1 + "\" -> Converted Integer: " + myAtoi(str1));
        System.out.println("String 2: \"" + str2 + "\" -> Converted Integer: " + myAtoi(str2));
    }
}

/*
OUTPUT:
String 1: "   -042" -> Converted Integer: -42
String 2: "1337c0d3" -> Converted Integer: 1337
*/
