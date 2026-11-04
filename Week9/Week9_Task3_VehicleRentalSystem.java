import java.util.ArrayList;
import java.util.List;

public class Week9_Task3_VehicleRentalSystem {
    abstract static class Vehicle {
        protected String vehicleNumber;
        protected double rentPerDay;

        public Vehicle(String vehicleNumber, double rentPerDay) {
            this.vehicleNumber = vehicleNumber;
            this.rentPerDay = rentPerDay;
        }

        public String getVehicleNumber() {
            return vehicleNumber;
        }

        public abstract double calculateRent(int days);
    }

    static class Car extends Vehicle {
        public Car(String vehicleNumber, double rentPerDay) {
            super(vehicleNumber, rentPerDay);
        }

        @Override
        public double calculateRent(int days) {
            return rentPerDay * days;
        }
    }

    static class Bike extends Vehicle {
        public Bike(String vehicleNumber, double rentPerDay) {
            super(vehicleNumber, rentPerDay);
        }

        @Override
        public double calculateRent(int days) {
            return rentPerDay * days * 0.90;
        }
    }

    static class Truck extends Vehicle {
        public Truck(String vehicleNumber, double rentPerDay) {
            super(vehicleNumber, rentPerDay);
        }

        @Override
        public double calculateRent(int days) {
            return rentPerDay * days * 1.20;
        }
    }

    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        List<Integer> daysList = new ArrayList<>();

        vehicles.add(new Car("CAR101", 2000));
        daysList.add(3);

        vehicles.add(new Bike("BIKE201", 500));
        daysList.add(4);

        vehicles.add(new Truck("TRUCK301", 3000));
        daysList.add(2);

        for (int i = 0; i < vehicles.size(); i++) {
            Vehicle v = vehicles.get(i);
            int days = daysList.get(i);
            System.out.printf("%s %.2f\n", v.getVehicleNumber(), v.calculateRent(days));
        }
    }
}

/*
OUTPUT:
CAR101 6000.00
BIKE201 1800.00
TRUCK301 7200.00
*/
