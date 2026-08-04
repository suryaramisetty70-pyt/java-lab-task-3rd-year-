import java.util.Arrays;

public class Week2_Session8_MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int[] result = Arrays.stream(nums).boxed().reduce(
            new int[]{0, Integer.MIN_VALUE},
            (acc, x) -> {
                int current = Math.max(x, acc[0] + x);
                int max = Math.max(acc[1], current);
                return new int[]{current, max};
            },
            (acc1, acc2) -> acc2
        );
        return result[1];
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxAccumulatedSum = maxSubArray(nums);

        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Maximum Subarray Sum: " + maxAccumulatedSum);
    }
}

/*
OUTPUT:
Array: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
Maximum Subarray Sum: 6
*/
