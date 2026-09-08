public class Week6_Session2_RotateString {
    public static boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";

        System.out.println("String s: \"" + s + "\", Goal: \"" + goal + "\"");
        System.out.println("Is Valid Rotation? " + rotateString(s, goal));
    }
}

/*
OUTPUT:
String s: "abcde", Goal: "cdeab"
Is Valid Rotation? true
*/
