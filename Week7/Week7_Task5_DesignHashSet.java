public class Week7_Task5_DesignHashSet {
    private boolean[] set;

    public Week7_Task5_DesignHashSet() {
        set = new boolean[1000001];
    }

    public void add(int key) {
        set[key] = true;
    }

    public void remove(int key) {
        set[key] = false;
    }

    public boolean contains(int key) {
        return set[key];
    }

    public static void main(String[] args) {
        Week7_Task5_DesignHashSet myHashSet = new Week7_Task5_DesignHashSet();

        myHashSet.add(1);
        myHashSet.add(2);

        System.out.println("Contains 1: " + myHashSet.contains(1));
        System.out.println("Contains 3: " + myHashSet.contains(3));

        myHashSet.add(2);
        System.out.println("Contains 2: " + myHashSet.contains(2));

        myHashSet.remove(2);
        System.out.println("Contains 2 after removal: " + myHashSet.contains(2));
    }
}

/*
OUTPUT:
Contains 1: true
Contains 3: false
Contains 2: true
Contains 2 after removal: false
*/
