import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Week9_Task1_FactoryTemperatureMonitor {
    public static int[] findNextGreaterTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                ans[stack.pop()] = temperatures[i];
            }
            stack.push(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] temperatures = {28, 35, 30, 25, 40, 38, 42};
        int[] nextGreater = findNextGreaterTemperatures(temperatures);

        System.out.println("Machine Temperatures: " + Arrays.toString(temperatures));
        System.out.print("Next Greater Temperatures: ");
        for (int i = 0; i < nextGreater.length; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(nextGreater[i]);
        }
        System.out.println();
    }
}

/*
OUTPUT:
Machine Temperatures: [28, 35, 30, 25, 40, 38, 42]
Next Greater Temperatures: 35 40 40 40 42 42 -1
*/
