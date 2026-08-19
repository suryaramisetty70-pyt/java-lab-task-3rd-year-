import java.util.Arrays;

public class Week4_Session1_Lapindromes {
    public static boolean isLapindrome(String s) {
        int n = s.length();
        int half = n / 2;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (int i = 0; i < half; i++) {
            freq1[s.charAt(i) - 'a']++;
        }

        int startSecond = (n % 2 == 0) ? half : half + 1;
        for (int i = startSecond; i < n; i++) {
            freq2[s.charAt(i) - 'a']++;
        }

        return Arrays.equals(freq1, freq2);
    }

    public static void main(String[] args) {
        String str1 = "gaga";
        String str2 = "abcde";

        System.out.println("String: \"" + str1 + "\" -> Lapindrome? " + isLapindrome(str1));
        System.out.println("String: \"" + str2 + "\" -> Lapindrome? " + isLapindrome(str2));
    }
}

/*
OUTPUT:
String: "gaga" -> Lapindrome? true
String: "abcde" -> Lapindrome? false
*/
