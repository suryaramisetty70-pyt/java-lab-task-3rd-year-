import java.util.Arrays;

public class Week4_Session4_TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] result = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] transposed = transpose(matrix);

        System.out.println("Original Matrix:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("Transposed Matrix:");
        for (int[] row : transposed) {
            System.out.println(Arrays.toString(row));
        }
    }
}

/*
OUTPUT:
Original Matrix:
[1, 2, 3]
[4, 5, 6]
Transposed Matrix:
[1, 4]
[2, 5]
[3, 6]
*/
