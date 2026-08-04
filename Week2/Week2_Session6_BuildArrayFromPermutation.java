import java.util.Arrays;
import java.util.stream.IntStream;

public class Week2_Session6_BuildArrayFromPermutation {
    public static int[] buildArray(int[] nums) {
        return IntStream.range(0, nums.length)
                        .map(i -> nums[nums[i]])
                        .toArray();
    }

    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] result = buildArray(nums);

        System.out.println("Input Array: " + Arrays.toString(nums));
        System.out.println("Output Array: " + Arrays.toString(result));
    }
}

/*
OUTPUT:
Input Array: [0, 2, 1, 5, 3, 4]
Output Array: [0, 1, 2, 4, 5, 3]
*/
