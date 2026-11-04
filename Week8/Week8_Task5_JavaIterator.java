import java.util.ArrayList;
import java.util.Iterator;

public class Week8_Task5_JavaIterator {
    public static Iterator<Object> func(ArrayList<Object> mylist) {
        Iterator<Object> it = mylist.iterator();
        while (it.hasNext()) {
            Object element = it.next();
            if (element instanceof String && element.equals("###")) {
                break;
            }
        }
        return it;
    }

    public static void main(String[] args) {
        ArrayList<Object> mylist = new ArrayList<>();
        mylist.add(42);
        mylist.add(10);
        mylist.add("###");
        mylist.add("Hello");
        mylist.add("Java");

        Iterator<Object> it = func(mylist);
        while (it.hasNext()) {
            Object element = it.next();
            System.out.println((String) element);
        }
    }
}

/*
OUTPUT:
Hello
Java
*/
