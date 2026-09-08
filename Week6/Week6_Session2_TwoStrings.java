import java.util.HashSet;
import java.util.Set;

public class Week6_Session2_TwoStrings {
    public static String twoStrings(String s1, String s2) {
        Set<Character> set = new HashSet<>();
        for (char c : s1.toCharArray()) {
            set.add(c);
        }
        for (char c : s2.toCharArray()) {
            if (set.contains(c)) {
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";

        String s3 = "hi";
        String s4 = "world";

        System.out.println("Strings: \"" + s1 + "\" & \"" + s2 + "\" -> Common Substring? " + twoStrings(s1, s2));
        System.out.println("Strings: \"" + s3 + "\" & \"" + s4 + "\" -> Common Substring? " + twoStrings(s3, s4));
    }
}

/*
OUTPUT:
Strings: "hello" & "world" -> Common Substring? YES
Strings: "hi" & "world" -> Common Substring? NO
*/
