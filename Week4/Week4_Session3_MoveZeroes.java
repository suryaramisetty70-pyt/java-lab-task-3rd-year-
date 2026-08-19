import java.util.Arrays;

public class Week4_Session3_MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int insertPos = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        System.out.println("Before Moving Zeroes: " + Arrays.toString(nums));
        moveZeroes(nums);
        System.out.println("After Moving Zeroes:  " + Arrays.toString(nums));
    }
}

/*
OUTPUT:
Before Moving Zeroes: [0, 1, 0, 3, 12]
After Moving Zeroes:  [1, 3, 12, 0, 0]
*/
