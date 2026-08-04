import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Week2_Session10_JavaDeque {
    public static int maxUniqueInSubarray(int[] nums, int m) {
        Deque<Integer> deque = new ArrayDeque<>();
        Map<Integer, Integer> map = new HashMap<>();
        int maxUnique = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            deque.addLast(num);
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (deque.size() == m) {
                maxUnique = Math.max(maxUnique, map.size());
                int removed = deque.removeFirst();
                int count = map.get(removed);
                if (count == 1) {
                    map.remove(removed);
                } else {
                    map.put(removed, count - 1);
                }
            }
        }
        return maxUnique;
    }

    public static void main(String[] args) {
        int[] nums = {5, 3, 5, 2, 3, 2};
        int m = 3;
        int result = maxUniqueInSubarray(nums, m);

        System.out.println("Array: [5, 3, 5, 2, 3, 2]");
        System.out.println("Subarray Size (m): " + m);
        System.out.println("Maximum unique integers in any contiguous subarray of size " + m + ": " + result);
    }
}

/*
OUTPUT:
Array: [5, 3, 5, 2, 3, 2]
Subarray Size (m): 3
Maximum unique integers in any contiguous subarray of size 3: 3
*/
