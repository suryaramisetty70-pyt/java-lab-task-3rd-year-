import java.util.Set;

public class Week4_Session1_DetermineIfStringHalvesAreAlike {
    public static boolean halvesAreAlike(String s) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        int n = s.length();
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < n / 2; i++) {
            if (vowels.contains(s.charAt(i))) {
                count1++;
            }
            if (vowels.contains(s.charAt(i + n / 2))) {
                count2++;
            }
        }

        return count1 == count2;
    }

    public static void main(String[] args) {
        String str1 = "book";
        String str2 = "textbook";

        System.out.println("String: \"" + str1 + "\" -> Halves Alike? " + halvesAreAlike(str1));
        System.out.println("String: \"" + str2 + "\" -> Halves Alike? " + halvesAreAlike(str2));
    }
}

/*
OUTPUT:
String: "book" -> Halves Alike? true
String: "textbook" -> Halves Alike? false
*/
