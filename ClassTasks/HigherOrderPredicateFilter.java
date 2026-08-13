import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class HigherOrderPredicateFilter {
    public static List<Integer> filterNumbers(List<Integer> numbers, Predicate<Integer> predicate) {
        List<Integer> filtered = new ArrayList<>();
        for (int num : numbers) {
            if (predicate.test(num)) {
                filtered.add(num);
            }
        }
        return filtered;
    }

    public static void main(String[] args) {
        List<Integer> nums = List.of(5, 12, 18, 7, 24, 3, 30);
        Predicate<Integer> greaterThanTen = n -> n > 10;

        List<Integer> result = filterNumbers(nums, greaterThanTen);

        System.out.println("Original Numbers: " + nums);
        System.out.println("Filtered Numbers (> 10): " + result);
    }
}

/*
OUTPUT:
Original Numbers: [5, 12, 18, 7, 24, 3, 30]
Filtered Numbers (> 10): [12, 18, 24, 30]
*/
