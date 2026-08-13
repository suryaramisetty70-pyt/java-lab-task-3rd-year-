import java.util.function.Predicate;

public class LambdaCheckEven {
    public static void main(String[] args) {
        Predicate<Integer> isEven = num -> num % 2 == 0;

        int n1 = 14;
        int n2 = 21;

        System.out.println("Is " + n1 + " even? " + isEven.test(n1));
        System.out.println("Is " + n2 + " even? " + isEven.test(n2));
    }
}

/*
OUTPUT:
Is 14 even? true
Is 21 even? false
*/
