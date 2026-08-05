import java.util.Arrays;
import java.util.stream.IntStream;

public class Week3_Session15_SortThePeople {
    public static String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        Integer[] indices = IntStream.range(0, n).boxed().toArray(Integer[]::new);

        Arrays.sort(indices, (i, j) -> Integer.compare(heights[j], heights[i]));

        return Arrays.stream(indices).map(i -> names[i]).toArray(String[]::new);
    }

    public static void main(String[] args) {
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};

        String[] sortedNames = sortPeople(names, heights);

        System.out.println("Names: " + Arrays.toString(names));
        System.out.println("Heights: " + Arrays.toString(heights));
        System.out.println("Sorted People: " + Arrays.toString(sortedNames));
    }
}

/*
OUTPUT:
Names: [Mary, John, Emma]
Heights: [180, 165, 170]
Sorted People: [Mary, Emma, John]
*/
