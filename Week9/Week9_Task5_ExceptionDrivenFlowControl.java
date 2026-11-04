import java.util.InputMismatchException;
import java.util.Scanner;

public class Week9_Task5_ExceptionDrivenFlowControl {
    public static void processDivision(String input) {
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
        processDivision("10 2");
        processDivision("10 0");
        processDivision("23.323 0");
    }
}

/*
OUTPUT:
5
java.lang.ArithmeticException: / by zero
java.util.InputMismatchException
*/
