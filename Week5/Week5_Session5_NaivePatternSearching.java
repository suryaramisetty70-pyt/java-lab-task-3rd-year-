import java.util.ArrayList;
import java.util.List;

public class Week5_Session5_NaivePatternSearching {
    public static List<Integer> searchPattern(String txt, String pat) {
        List<Integer> result = new ArrayList<>();
        int n = txt.length();
        int m = pat.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (txt.charAt(i + j) != pat.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String txt = "AABAACAADAABAABA";
        String pat = "AABA";

        List<Integer> indices = searchPattern(txt, pat);

        System.out.println("Text: \"" + txt + "\"");
        System.out.println("Pattern: \"" + pat + "\"");
        System.out.println("Pattern Found at Indices: " + indices);
    }
}

/*
OUTPUT:
Text: "AABAACAADAABAABA"
Pattern: "AABA"
Pattern Found at Indices: [0, 9, 12]
*/
