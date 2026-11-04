import java.util.HashSet;
import java.util.Set;

public class Week8_Task7_JavaHashSet {
    public static void main(String[] args) {
        String[] left = {"john", "john", "john", "mary", "mary"};
        String[] right = {"tom", "mary", "tom", "anna", "anna"};

        Set<String> set = new HashSet<>();
        for (int i = 0; i < left.length; i++) {
            set.add(left[i] + " " + right[i]);
            System.out.println(set.size());
        }
    }
}

/*
OUTPUT:
1
2
2
3
3
*/
