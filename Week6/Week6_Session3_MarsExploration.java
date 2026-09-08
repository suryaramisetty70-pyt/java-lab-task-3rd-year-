public class Week6_Session3_MarsExploration {
    public static int marsExploration(String s) {
        String target = "SOS";
        int changed = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != target.charAt(i % 3)) {
                changed++;
            }
        }

        return changed;
    }

    public static void main(String[] args) {
        String message = "SOSSPSSQSSOR";
        int count = marsExploration(message);

        System.out.println("Received Message: \"" + message + "\"");
        System.out.println("Changed Characters Count: " + count);
    }
}

/*
OUTPUT:
Received Message: "SOSSPSSQSSOR"
Changed Characters Count: 3
*/
