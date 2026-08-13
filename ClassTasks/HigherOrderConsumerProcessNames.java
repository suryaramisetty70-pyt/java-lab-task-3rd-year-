import java.util.List;
import java.util.function.Consumer;

public class HigherOrderConsumerProcessNames {
    public static void processNames(List<String> names, Consumer<String> consumer) {
        for (String name : names) {
            consumer.accept(name);
        }
    }

    public static void main(String[] args) {
        List<String> nameList = List.of("Alice", "Bob", "Charlie", "David");
        Consumer<String> printGreeting = name -> System.out.println("Hello, " + name + "!");

        System.out.println("Processing names using Consumer:");
        processNames(nameList, printGreeting);
    }
}

/*
OUTPUT:
Processing names using Consumer:
Hello, Alice!
Hello, Bob!
Hello, Charlie!
Hello, David!
*/
