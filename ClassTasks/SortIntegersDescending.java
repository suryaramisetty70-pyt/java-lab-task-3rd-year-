import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortIntegersDescending {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(42, 12, 89, 5, 23, 67));

        System.out.println("Before Sorting: " + numbers);

        numbers.sort(Comparator.reverseOrder());

        System.out.println("After Sorting Descending: " + numbers);
    }
}

/*
OUTPUT:
Before Sorting: [42, 12, 89, 5, 23, 67]
After Sorting Descending: [89, 67, 42, 23, 12, 5]
*/
