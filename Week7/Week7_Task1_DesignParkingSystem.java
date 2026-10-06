public class Week7_Task1_DesignParkingSystem {
    private int big;
    private int medium;
    private int small;

    public Week7_Task1_DesignParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        if (carType == 1) {
            if (big > 0) {
                big--;
                return true;
            }
        } else if (carType == 2) {
            if (medium > 0) {
                medium--;
                return true;
            }
        } else if (carType == 3) {
            if (small > 0) {
                small--;
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Week7_Task1_DesignParkingSystem parkingSystem = new Week7_Task1_DesignParkingSystem(1, 1, 0);

        System.out.println("Add Big Car (1): " + parkingSystem.addCar(1));
        System.out.println("Add Medium Car (2): " + parkingSystem.addCar(2));
        System.out.println("Add Small Car (3): " + parkingSystem.addCar(3));
        System.out.println("Add Big Car (1): " + parkingSystem.addCar(1));
    }
}

/*
OUTPUT:
Add Big Car (1): true
Add Medium Car (2): true
Add Small Car (3): false
Add Big Car (1): false
*/
