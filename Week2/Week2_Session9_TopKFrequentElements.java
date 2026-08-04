import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Week2_Session9_TopKFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        return Arrays.stream(nums)
                     .boxed()
                     .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                     .entrySet()
                     .stream()
                     .sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue()))
                     .limit(k)
                     .mapToInt(Map.Entry::getKey)
                     .toArray();
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3, 3, 3, 3, 4};
        int k = 2;
        int[] topK = topKFrequent(nums, k);

        System.out.println("Input Array: " + Arrays.toString(nums));
        System.out.println("k: " + k);
        System.out.println("Top " + k + " Frequent Elements: " + Arrays.toString(topK));
    }
}

/*
OUTPUT:
Input Array: [1, 1, 1, 2, 2, 3, 3, 3, 3, 4]
k: 2
Top 2 Frequent Elements: [3, 1]
*/
