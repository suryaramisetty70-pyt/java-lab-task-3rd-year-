import java.util.*;

public class Week5_Session5_StringMatchingInAnArray {
    public static List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[j].contains(words[i])) {
                    result.add(words[i]);
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] words = {"mass", "as", "hero", "superhero"};
        List<String> result = stringMatching(words);

        System.out.println("Input Words: " + Arrays.toString(words));
        System.out.println("Matching Substrings: " + result);
    }
}

/*
OUTPUT:
Input Words: [mass, as, hero, superhero]
Matching Substrings: [as, hero]
*/
