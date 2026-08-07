import java.util.List;

public class SquaresOfEvenNumbersStream {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("Numbers: " + numbers);
        System.out.println("Squares of Even Numbers:");

        numbers.stream()
               .filter(n -> n % 2 == 0)
               .map(n -> n * n)
               .forEach(System.out::println);
    }
}

/*
OUTPUT:
Numbers: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Squares of Even Numbers:
4
16
36
64
100
*/
