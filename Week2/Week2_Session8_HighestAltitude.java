import java.util.Arrays;

public class Week2_Session8_HighestAltitude {
    public static int largestAltitude(int[] gain) {
        int[] result = Arrays.stream(gain).boxed().reduce(
            new int[]{0, 0},
            (acc, g) -> {
                int current = acc[0] + g;
                int max = Math.max(acc[1], current);
                return new int[]{current, max};
            },
            (acc1, acc2) -> acc2
        );
        return result[1];
    }

    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        int maxAlt = largestAltitude(gain);

        System.out.println("Gains: " + Arrays.toString(gain));
        System.out.println("Highest Altitude: " + maxAlt);
    }
}

/*
OUTPUT:
Gains: [-5, 1, 5, 0, -7]
Highest Altitude: 1
*/
