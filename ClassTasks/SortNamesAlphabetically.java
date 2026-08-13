import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortNamesAlphabetically {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Zachary", "Alice", "David", "Bob", "Charlie"));

        System.out.println("Before Sorting: " + names);

        names.sort(Comparator.naturalOrder());

        System.out.println("After Sorting Alphabetically: " + names);
    }
}

/*
OUTPUT:
Before Sorting: [Zachary, Alice, David, Bob, Charlie]
After Sorting Alphabetically: [Alice, Bob, Charlie, David, Zachary]
*/
