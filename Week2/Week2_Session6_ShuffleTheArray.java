import java.util.Arrays;
import java.util.stream.IntStream;

public class Week2_Session6_ShuffleTheArray {
    public static int[] shuffle(int[] nums, int n) {
        return IntStream.range(0, 2 * n)
                        .map(i -> (i % 2 == 0) ? nums[i / 2] : nums[n + i / 2])
                        .toArray();
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] result = shuffle(nums, n);

        System.out.println("Input Array: " + Arrays.toString(nums));
        System.out.println("n: " + n);
        System.out.println("Shuffled Array: " + Arrays.toString(result));
    }
}

/*
OUTPUT:
Input Array: [2, 5, 1, 3, 4, 7]
n: 3
Shuffled Array: [2, 3, 5, 4, 1, 7]
*/
