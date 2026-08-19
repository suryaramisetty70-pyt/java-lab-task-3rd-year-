import java.util.List;

public class Week4_Session2_CompareTheTriplets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int alice = 0;
        int bob = 0;

        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                alice++;
            } else if (a.get(i) < b.get(i)) {
                bob++;
            }
        }

        return List.of(alice, bob);
    }

    public static void main(String[] args) {
        List<Integer> a = List.of(5, 6, 7);
        List<Integer> b = List.of(3, 6, 10);

        List<Integer> result = compareTriplets(a, b);

        System.out.println("Alice's Ratings: " + a);
        System.out.println("Bob's Ratings: " + b);
        System.out.println("Comparison Result [Alice, Bob]: " + result);
    }
}

/*
OUTPUT:
Alice's Ratings: [5, 6, 7]
Bob's Ratings: [3, 6, 10]
Comparison Result [Alice, Bob]: [1, 1]
*/
