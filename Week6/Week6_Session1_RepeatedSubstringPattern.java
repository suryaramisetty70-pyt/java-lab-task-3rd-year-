public class Week6_Session1_RepeatedSubstringPattern {
    public static boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        return doubled.substring(1, doubled.length() - 1).contains(s);
    }

    public static void main(String[] args) {
        String s1 = "abab";
        String s2 = "aba";

        System.out.println("String: \"" + s1 + "\" -> Repeated Substring Pattern? " + repeatedSubstringPattern(s1));
        System.out.println("String: \"" + s2 + "\" -> Repeated Substring Pattern? " + repeatedSubstringPattern(s2));
    }
}

/*
OUTPUT:
String: "abab" -> Repeated Substring Pattern? true
String: "aba" -> Repeated Substring Pattern? false
*/
