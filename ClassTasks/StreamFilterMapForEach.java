import java.util.List;

public class StreamFilterMapForEach {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "kiwi", "mango", "fig", "dragonfruit");

        System.out.println("Collection: " + fruits);
        System.out.println("Filtered (length > 4) and Transformed (Uppercase):");

        fruits.stream()
              .filter(fruit -> fruit.length() > 4)
              .map(String::toUpperCase)
              .forEach(System.out::println);
    }
}

/*
OUTPUT:
Collection: [apple, banana, kiwi, mango, fig, dragonfruit]
Filtered (length > 4) and Transformed (Uppercase):
APPLE
BANANA
MANGO
DRAGONFRUIT
*/
