import java.util.function.UnaryOperator;

public class LambdaSquareNumber {
    public static void main(String[] args) {
        UnaryOperator<Integer> square = n -> n * n;

        int number = 8;
        int result = square.apply(number);

        System.out.println("Number: " + number);
        System.out.println("Square of " + number + " using Lambda: " + result);
    }
}

/*
OUTPUT:
Number: 8
Square of 8 using Lambda: 64
*/
