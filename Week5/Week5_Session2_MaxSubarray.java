import java.util.Arrays;
import java.util.List;

public class Week5_Session2_MaxSubarray {
    public static List<Integer> maxSubarray(int[] arr) {
        int maxSubarraySum = arr[0];
        int currentMax = arr[0];
        int maxSubsequenceSum = 0;
        int maxElement = arr[0];
        boolean hasPositive = false;

        for (int num : arr) {
            if (num > 0) {
                maxSubsequenceSum += num;
                hasPositive = true;
            }
            maxElement = Math.max(maxElement, num);
        }

        if (!hasPositive) {
            maxSubsequenceSum = maxElement;
        }

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSubarraySum = Math.max(maxSubarraySum, currentMax);
        }

        return List.of(maxSubarraySum, maxSubsequenceSum);
    }

    public static void main(String[] args) {
        int[] arr = {2, -1, 2, 3, 4, -5};
        List<Integer> result = maxSubarray(arr);

        System.out.println("Input Array: " + Arrays.toString(arr));
        System.out.println("Max Subarray Sum: " + result.get(0));
        System.out.println("Max Subsequence Sum: " + result.get(1));
    }
}

/*
OUTPUT:
Input Array: [2, -1, 2, 3, 4, -5]
Max Subarray Sum: 10
Max Subsequence Sum: 11
*/
