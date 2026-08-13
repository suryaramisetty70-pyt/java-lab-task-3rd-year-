import java.util.Comparator;

public class LambdaCompareStringsByLength {
    public static void main(String[] args) {
        Comparator<String> compareByLength = (s1, s2) -> Integer.compare(s1.length(), s2.length());

        String str1 = "Elephant";
        String str2 = "Cat";

        int result = compareByLength.compare(str1, str2);

        System.out.println("String 1: " + str1 + " (Length: " + str1.length() + ")");
        System.out.println("String 2: " + str2 + " (Length: " + str2.length() + ")");
        System.out.println("Comparison Result: " + result);
    }
}

/*
OUTPUT:
String 1: Elephant (Length: 8)
String 2: Cat (Length: 3)
Comparison Result: 1
*/
