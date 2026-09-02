import java.util.Arrays;

public class Week5_Session2_MaximumSumCircularSubarray {
    public static int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int maxSoFar = nums[0], currentMax = 0;
        int minSoFar = nums[0], currentMin = 0;

        for (int num : nums) {
            currentMax = Math.max(num, currentMax + num);
            maxSoFar = Math.max(maxSoFar, currentMax);

            currentMin = Math.min(num, currentMin + num);
            minSoFar = Math.min(minSoFar, currentMin);

            totalSum += num;
        }

        return maxSoFar > 0 ? Math.max(maxSoFar, totalSum - minSoFar) : maxSoFar;
    }

    public static void main(String[] args) {
        int[] nums = {5, -3, 5};
        int result = maxSubarraySumCircular(nums);

        System.out.println("Input Circular Array: " + Arrays.toString(nums));
        System.out.println("Maximum Sum Circular Subarray: " + result);
    }
}

/*
OUTPUT:
Input Circular Array: [5, -3, 5]
Maximum Sum Circular Subarray: 10
*/
