import java.util.List;

public class Week5_Session1_TheBirthdayBar {
    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        int currentSum = 0;

        for (int i = 0; i < s.size(); i++) {
            currentSum += s.get(i);
            if (i >= m) {
                currentSum -= s.get(i - m);
            }
            if (i >= m - 1 && currentSum == d) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        List<Integer> s = List.of(2, 2, 1, 3, 2);
        int d = 4;
        int m = 2;

        int result = birthday(s, d, m);

        System.out.println("Chocolate Bar: " + s);
        System.out.println("Day (Target Sum d): " + d);
        System.out.println("Month (Segment Length m): " + m);
        System.out.println("Valid Segments Count: " + result);
    }
}

/*
OUTPUT:
Chocolate Bar: [2, 2, 1, 3, 2]
Day (Target Sum d): 4
Month (Segment Length m): 2
Valid Segments Count: 2
*/
