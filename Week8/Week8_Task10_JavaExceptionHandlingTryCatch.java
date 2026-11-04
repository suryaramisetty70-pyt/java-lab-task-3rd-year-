import java.util.InputMismatchException;
import java.util.Scanner;

public class Week8_Task10_JavaExceptionHandlingTryCatch {
    public static void divide(String input) {
        Scanner sc = new Scanner(input);
        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x / y);
        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        } finally {
            sc.close();
        }
    }

    public static void main(String[] args) {
        divide("10 2");
        divide("10 0");
        divide("23.323 0");
    }
}

/*
OUTPUT:
5
java.lang.ArithmeticException: / by zero
java.util.InputMismatchException
*/
