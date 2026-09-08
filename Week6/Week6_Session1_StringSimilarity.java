public class Week6_Session1_StringSimilarity {
    public static long stringSimilarity(String s) {
        int n = s.length();
        int[] z = new int[n];
        int l = 0, r = 0;
        long totalSimilarity = n;

        for (int i = 1; i < n; i++) {
            if (i <= r) {
                z[i] = Math.min(r - i + 1, z[i - l]);
            }
            while (i + z[i] < n && s.charAt(z[i]) == s.charAt(i + z[i])) {
                z[i]++;
            }
            if (i + z[i] - 1 > r) {
                l = i;
                r = i + z[i] - 1;
            }
            totalSimilarity += z[i];
        }

        return totalSimilarity;
    }

    public static void main(String[] args) {
        String s = "ababaa";
        long result = stringSimilarity(s);

        System.out.println("String: \"" + s + "\"");
        System.out.println("Sum of String Similarities: " + result);
    }
}

/*
OUTPUT:
String: "ababaa"
Sum of String Similarities: 11
*/
