import java.util.HashSet;
import java.util.Set;

public class Week5_Session4_LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            while (seen.contains(s.charAt(right))) {
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int len = lengthOfLongestSubstring(s);

        System.out.println("Input String: \"" + s + "\"");
        System.out.println("Length of Longest Substring Without Repeating Characters: " + len);
    }
}

/*
OUTPUT:
Input String: "abcabcbb"
Length of Longest Substring Without Repeating Characters: 3
*/
