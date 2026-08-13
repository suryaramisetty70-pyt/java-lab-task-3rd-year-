import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortNamesByLength {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Christopher", "Ana", "Elizabeth", "Bob", "Daniel"));

        System.out.println("Before Sorting: " + names);

        names.sort(Comparator.comparing(String::length));

        System.out.println("After Sorting by Length: " + names);
    }
}

/*
OUTPUT:
Before Sorting: [Christopher, Ana, Elizabeth, Bob, Daniel]
After Sorting by Length: [Ana, Bob, Daniel, Christopher, Elizabeth]
*/
