public class Week7_Task9_JavaGenerics {
    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };

        System.out.println("Generic Print Integer Array:");
        printArray(intArray);

        System.out.println("\nGeneric Print String Array:");
        printArray(stringArray);
    }
}

/*
OUTPUT:
Generic Print Integer Array:
1
2
3

Generic Print String Array:
Hello
World
*/
