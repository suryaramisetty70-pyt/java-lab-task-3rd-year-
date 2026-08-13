import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortIntegersAscending {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(42, 12, 89, 5, 23, 67));

        System.out.println("Before Sorting: " + numbers);

        numbers.sort(Comparator.naturalOrder());

        System.out.println("After Sorting Ascending: " + numbers);
    }
}

/*
OUTPUT:
Before Sorting: [42, 12, 89, 5, 23, 67]
After Sorting Ascending: [5, 12, 23, 42, 67, 89]
*/
