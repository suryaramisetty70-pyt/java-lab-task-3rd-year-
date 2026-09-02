import java.util.*;

public class Week5_Session4_FindAndReplacePattern {
    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (matches(word, pattern)) {
                result.add(word);
            }
        }
        return result;
    }

    private static boolean matches(String word, String pattern) {
        Map<Character, Character> m1 = new HashMap<>();
        Map<Character, Character> m2 = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char w = word.charAt(i);
            char p = pattern.charAt(i);

            if (!m1.containsKey(w)) m1.put(w, p);
            if (!m2.containsKey(p)) m2.put(p, w);

            if (m1.get(w) != p || m2.get(p) != w) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"abc", "deq", "mee", "aqq", "dkd", "ccc"};
        String pattern = "abb";

        List<String> result = findAndReplacePattern(words, pattern);

        System.out.println("Words: " + Arrays.toString(words));
        System.out.println("Pattern: \"" + pattern + "\"");
        System.out.println("Matching Words: " + result);
    }
}

/*
OUTPUT:
Words: [abc, deq, mee, aqq, dkd, ccc]
Pattern: "abb"
Matching Words: [mee, aqq]
*/
