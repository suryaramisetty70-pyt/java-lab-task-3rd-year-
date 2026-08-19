import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Week4_Session2_ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 1};
        int[] arr2 = {1, 2, 3, 4};

        System.out.println("Array 1: " + Arrays.toString(arr1) + " -> Contains Duplicate? " + containsDuplicate(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2) + " -> Contains Duplicate? " + containsDuplicate(arr2));
    }
}

/*
OUTPUT:
Array 1: [1, 2, 3, 1] -> Contains Duplicate? true
Array 2: [1, 2, 3, 4] -> Contains Duplicate? false
*/
