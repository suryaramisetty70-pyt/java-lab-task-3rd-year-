public class Week7_Task8_JavaInheritance2 {
    static class Arithmetic {
        public int add(int a, int b) {
            return a + b;
        }
    }

    static class Adder extends Arithmetic {}

    public static void main(String[] args) {
        Adder adder = new Adder();

        System.out.println("My superclass is: " + adder.getClass().getSuperclass().getName());
        System.out.print(adder.add(10, 32) + " " + adder.add(10, 3) + " " + adder.add(10, 10) + "\n");
    }
}

/*
OUTPUT:
My superclass is: Week7_Task8_JavaInheritance2$Arithmetic
42 13 20
*/
