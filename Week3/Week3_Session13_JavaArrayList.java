import java.util.ArrayList;
import java.util.List;

public class Week3_Session13_JavaArrayList {
    public static void main(String[] args) {
        List<List<Integer>> lines = new ArrayList<>();

        lines.add(List.of(41, 77, 74, 22, 44));
        lines.add(List.of(12));
        lines.add(List.of(37, 34, 36, 52));
        lines.add(List.of());
        lines.add(List.of(20, 22, 33, 11));

        int[][] queries = {
            {1, 3},
            {3, 4},
            {3, 1},
            {4, 3},
            {5, 5}
        };

        System.out.println("Query Results:");
        for (int[] q : queries) {
            int x = q[0] - 1;
            int y = q[1] - 1;

            if (x >= 0 && x < lines.size() && y >= 0 && y < lines.get(x).size()) {
                System.out.println(lines.get(x).get(y));
            } else {
                System.out.println("ERROR!");
            }
        }
    }
}

/*
OUTPUT:
Query Results:
74
52
37
ERROR!
ERROR!
*/
