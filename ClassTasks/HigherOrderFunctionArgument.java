import java.util.function.Function;

public class HigherOrderFunctionArgument {
    public static int processNumber(int value, Function<Integer, Integer> function) {
        return function.apply(value);
    }

    public static void main(String[] args) {
        Function<Integer, Integer> doubleValue = x -> x * 2;

        int input = 10;
        int result = processNumber(input, doubleValue);

        System.out.println("Input Value: " + input);
        System.out.println("Processed Output (Doubled): " + result);
    }
}

/*
OUTPUT:
Input Value: 10
Processed Output (Doubled): 20
*/
