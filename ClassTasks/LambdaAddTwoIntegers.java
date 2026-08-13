import java.util.function.BinaryOperator;

public class LambdaAddTwoIntegers {
    public static void main(String[] args) {
        BinaryOperator<Integer> add = (a, b) -> a + b;

        int num1 = 15;
        int num2 = 25;
        int result = add.apply(num1, num2);

        System.out.println("First Number: " + num1);
        System.out.println("Second Number: " + num2);
        System.out.println("Sum using Lambda: " + result);
    }
}

/*
OUTPUT:
First Number: 15
Second Number: 25
Sum using Lambda: 40
*/
