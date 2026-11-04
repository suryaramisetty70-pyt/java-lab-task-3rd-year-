public class Week8_Task9_JavaExceptionHandling {
    static class MyCalculator {
        long power(int n, int p) throws Exception {
            if (n < 0 || p < 0) {
                throw new Exception("n or p should not be negative.");
            }
            if (n == 0 && p == 0) {
                throw new Exception("n and p should not be zero.");
            }
            return (long) Math.pow(n, p);
        }
    }

    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        int[][] testCases = {
            {3, 5},
            {2, 4},
            {0, 0},
            {-1, -2},
            {-1, 3}
        };

        for (int[] tc : testCases) {
            try {
                System.out.println(myCalculator.power(tc[0], tc[1]));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

/*
OUTPUT:
243
16
java.lang.Exception: n and p should not be zero.
java.lang.Exception: n or p should not be negative.
java.lang.Exception: n or p should not be negative.
*/
