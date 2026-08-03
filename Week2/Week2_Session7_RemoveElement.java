import java.util.Arrays;
import java.util.stream.IntStream;

public class Week2_Session7_RemoveElement {
    public static int[] removeElement(int[] nums, int val) {
        return IntStream.of(nums)
                        .filter(x -> x != val)
                        .toArray();
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3, 4, 5, 3};
        int val = 3;
        int[] result = removeElement(nums, val);

        System.out.println("Original Array: " + Arrays.toString(nums));
        System.out.println("Value to remove: " + val);
        System.out.println("Filtered Array: " + Arrays.toString(result));
        System.out.println("New Length: " + result.length);
    }
}

/*
OUTPUT:
Original Array: [3, 2, 2, 3, 4, 5, 3]
Value to remove: 3
Filtered Array: [2, 2, 4, 5]
New Length: 4
*/
