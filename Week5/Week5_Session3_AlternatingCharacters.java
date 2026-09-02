public class Week5_Session3_AlternatingCharacters {
    public static int alternatingCharacters(String s) {
        int deletions = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                deletions++;
            }
        }
        return deletions;
    }

    public static void main(String[] args) {
        String str1 = "AAAA";
        String str2 = "BABABA";

        System.out.println("String: \"" + str1 + "\" -> Deletions Required: " + alternatingCharacters(str1));
        System.out.println("String: \"" + str2 + "\" -> Deletions Required: " + alternatingCharacters(str2));
    }
}

/*
OUTPUT:
String: "AAAA" -> Deletions Required: 3
String: "BABABA" -> Deletions Required: 0
*/
