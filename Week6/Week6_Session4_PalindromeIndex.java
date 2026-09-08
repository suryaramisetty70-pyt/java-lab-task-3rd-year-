public class Week6_Session4_PalindromeIndex {
    public static int palindromeIndex(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                if (isPalindrome(s, l + 1, r)) {
                    return l;
                } else if (isPalindrome(s, l, r - 1)) {
                    return r;
                }
                return -1;
            }
            l++;
            r--;
        }

        return -1;
    }

    private static boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "aaab";
        String str2 = "baa";
        String str3 = "aaa";

        System.out.println("String: \"" + str1 + "\" -> Removal Index: " + palindromeIndex(str1));
        System.out.println("String: \"" + str2 + "\" -> Removal Index: " + palindromeIndex(str2));
        System.out.println("String: \"" + str3 + "\" -> Removal Index: " + palindromeIndex(str3));
    }
}

/*
OUTPUT:
String: "aaab" -> Removal Index: 3
String: "baa" -> Removal Index: 0
String: "aaa" -> Removal Index: -1
*/
