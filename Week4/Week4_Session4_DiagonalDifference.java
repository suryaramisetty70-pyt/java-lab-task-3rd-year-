import java.util.List;

public class Week4_Session4_DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int n = arr.size();
        int primarySum = 0;
        int secondarySum = 0;

        for (int i = 0; i < n; i++) {
            primarySum += arr.get(i).get(i);
            secondarySum += arr.get(i).get(n - 1 - i);
        }

        return Math.abs(primarySum - secondarySum);
    }

    public static void main(String[] args) {
        List<List<Integer>> matrix = List.of(
            List.of(11, 2, 4),
            List.of(4, 5, 6),
            List.of(10, 8, -12)
        );

        int diff = diagonalDifference(matrix);

        System.out.println("Matrix:");
        for (List<Integer> row : matrix) {
            System.out.println(row);
        }
        System.out.println("Absolute Diagonal Difference: " + diff);
    }
}

/*
OUTPUT:
Matrix:
[11, 2, 4]
[4, 5, 6]
[10, 8, -12]
Absolute Diagonal Difference: 15
*/
