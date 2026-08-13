import java.util.function.Function;

public class HigherOrderFunctionSequentialComposition {
    public static Function<Integer, Integer> applySequentially(
            Function<Integer, Integer> f1,
            Function<Integer, Integer> f2) {
        return f1.andThen(f2);
    }

    public static void main(String[] args) {
        Function<Integer, Integer> addFive = x -> x + 5;
        Function<Integer, Integer> multiplyByThree = x -> x * 3;

        Function<Integer, Integer> combined = applySequentially(addFive, multiplyByThree);

        int input = 10;
        int result = combined.apply(input);

        System.out.println("Input: " + input);
        System.out.println("Result after adding 5 then multiplying by 3: " + result);
    }
}

/*
OUTPUT:
Input: 10
Result after adding 5 then multiplying by 3: 45
*/
