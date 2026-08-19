import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Week4_Session5_MatrixRotationAlgo {
    public static void matrixRotation(int[][] matrix, int r) {
        int m = matrix.length;
        int n = matrix[0].length;
        int layers = Math.min(m, n) / 2;

        for (int layer = 0; layer < layers; layer++) {
            List<Integer> list = new ArrayList<>();

            for (int j = layer; j < n - layer; j++) {
                list.add(matrix[layer][j]);
            }
            for (int i = layer + 1; i < m - layer; i++) {
                list.add(matrix[i][n - 1 - layer]);
            }
            for (int j = n - 2 - layer; j >= layer; j--) {
                list.add(matrix[m - 1 - layer][j]);
            }
            for (int i = m - 2 - layer; i > layer; i--) {
                list.add(matrix[i][layer]);
            }

            int size = list.size();
            int shift = r % size;

            List<Integer> rotated = new ArrayList<>();
            for (int idx = 0; idx < size; idx++) {
                rotated.add(list.get((idx + shift) % size));
            }

            int index = 0;
            for (int j = layer; j < n - layer; j++) {
                matrix[layer][j] = rotated.get(index++);
            }
            for (int i = layer + 1; i < m - layer; i++) {
                matrix[i][n - 1 - layer] = rotated.get(index++);
            }
            for (int j = n - 2 - layer; j >= layer; j--) {
                matrix[m - 1 - layer][j] = rotated.get(index++);
            }
            for (int i = m - 2 - layer; i > layer; i--) {
                matrix[i][layer] = rotated.get(index++);
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int rotations = 2;

        System.out.println("Original Matrix:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        matrixRotation(matrix, rotations);

        System.out.println("Matrix After " + rotations + " Layer Rotations:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}

/*
OUTPUT:
Original Matrix:
[1, 2, 3, 4]
[5, 6, 7, 8]
[9, 10, 11, 12]
[13, 14, 15, 16]
Matrix After 2 Layer Rotations:
[3, 4, 8, 12]
[2, 11, 10, 16]
[1, 7, 6, 15]
[5, 9, 13, 14]
*/
