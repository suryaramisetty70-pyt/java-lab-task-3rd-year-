import java.util.List;

public class UppercaseNamesStream {
    public static void main(String[] args) {
        List<String> names = List.of("suriya", "ram", "john", "alex");

        System.out.println("Original Names: " + names);
        System.out.println("Names in Uppercase:");

        names.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}

/*
OUTPUT:
Original Names: [suriya, ram, john, alex]
Names in Uppercase:
SURIYA
RAM
JOHN
ALEX
*/
