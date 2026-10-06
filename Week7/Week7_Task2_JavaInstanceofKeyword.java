import java.util.ArrayList;

public class Week7_Task2_JavaInstanceofKeyword {
    static class Student {}
    static class Rockstar {}
    static class Hacker {}

    public static String countTypes(ArrayList<Object> mylist) {
        int a = 0, b = 0, c = 0;
        for (Object element : mylist) {
            if (element instanceof Student) a++;
            if (element instanceof Rockstar) b++;
            if (element instanceof Hacker) c++;
        }
        return a + " " + b + " " + c;
    }

    public static void main(String[] args) {
        ArrayList<Object> mylist = new ArrayList<>();
        mylist.add(new Student());
        mylist.add(new Rockstar());
        mylist.add(new Hacker());
        mylist.add(new Hacker());

        System.out.println("Counts (Student, Rockstar, Hacker): " + countTypes(mylist));
    }
}

/*
OUTPUT:
Counts (Student, Rockstar, Hacker): 1 1 2
*/
