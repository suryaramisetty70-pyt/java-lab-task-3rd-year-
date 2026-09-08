import java.util.ArrayList;
import java.util.List;

public class Week6_Session5_CircularPalindromes {
    public static List<Integer> circularPalindromes(String s) {
        List<Integer> result = new ArrayList<>();
        int n = s.length();
        String doubled = s + s;

        for (int i = 0; i < n; i++) {
            String rotation = doubled.substring(i, i + n);
            result.add(longestPalindromeLength(rotation));
        }

        return result;
    }

    private static int longestPalindromeLength(String s) {
        int maxLen = 1;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int l1 = expand(s, i, i);
            int l2 = expand(s, i, i + 1);
            maxLen = Math.max(maxLen, Math.max(l1, l2));
        }

        return maxLen;
    }

    private static int expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        String s = "aaaaabbbbaaaa";
        List<Integer> maxLengths = circularPalindromes(s);

        System.out.println("Circular String: \"" + s + "\"");
        System.out.println("Max Palindromic Lengths per Rotation: " + maxLengths);
    }
}

/*
OUTPUT:
Circular String: "aaaaabbbbaaaa"
Max Palindromic Lengths per Rotation: [13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13]
*/
