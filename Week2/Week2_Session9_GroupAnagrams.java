import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Week2_Session9_GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        return Arrays.stream(strs)
                     .collect(Collectors.groupingBy(s -> {
                         char[] ca = s.toCharArray();
                         Arrays.sort(ca);
                         return new String(ca);
                     }))
                     .values()
                     .stream()
                     .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> grouped = groupAnagrams(strs);

        System.out.println("Input Strings: " + Arrays.toString(strs));
        System.out.println("Grouped Anagrams: " + grouped);
    }
}

/*
OUTPUT:
Input Strings: [eat, tea, tan, ate, nat, bat]
Grouped Anagrams: [[eat, tea, ate], [bat], [tan, nat]]
*/
