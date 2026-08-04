import java.util.HashSet;
import java.util.Set;

public class Week2_Session10_JavaHashSet {
    public static void main(String[] args) {
        String[] left = {"john", "john", "john", "mary", "mary"};
        String[] right = {"tom", "mary", "tom", "anna", "anna"};

        Set<String> set = new HashSet<>();
        System.out.println("Processing pair count step-by-step:");

        for (int i = 0; i < left.length; i++) {
            set.add(left[i] + " " + right[i]);
            System.out.println("Pair added: (" + left[i] + ", " + right[i] + ") -> Total Unique Pairs: " + set.size());
        }
    }
}

/*
OUTPUT:
Processing pair count step-by-step:
Pair added: (john, tom) -> Total Unique Pairs: 1
Pair added: (john, mary) -> Total Unique Pairs: 2
Pair added: (john, tom) -> Total Unique Pairs: 2
Pair added: (mary, anna) -> Total Unique Pairs: 3
Pair added: (mary, anna) -> Total Unique Pairs: 3
*/
