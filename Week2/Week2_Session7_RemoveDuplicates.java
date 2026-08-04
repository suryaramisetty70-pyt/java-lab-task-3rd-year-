import java.util.Arrays;
import java.util.stream.IntStream;

public class Week2_Session7_RemoveDuplicates {
    public static int[] removeDuplicates(int[] nums) {
        return IntStream.of(nums)
                        .distinct()
                        .toArray();
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] result = removeDuplicates(nums);

        System.out.println("Original Sorted Array: " + Arrays.toString(nums));
        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
        System.out.println("Number of unique elements: " + result.length);
    }
}

/*
OUTPUT:
Original Sorted Array: [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
Array after removing duplicates: [0, 1, 2, 3, 4]
Number of unique elements: 5
*/
