import java.util.HashMap;
import java.util.Map;

public class Week7_Task3_DesignUndergroundSystem {
    static class CheckInInfo {
        String stationName;
        int time;

        CheckInInfo(String stationName, int time) {
            this.stationName = stationName;
            this.time = time;
        }
    }

    static class RouteInfo {
        double totalTime;
        int count;

        RouteInfo(double totalTime, int count) {
            this.totalTime = totalTime;
            this.count = count;
        }
    }

    private Map<Integer, CheckInInfo> checkIns = new HashMap<>();
    private Map<String, RouteInfo> routes = new HashMap<>();

    public void checkIn(int id, String stationName, int t) {
        checkIns.put(id, new CheckInInfo(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        CheckInInfo info = checkIns.remove(id);
        String routeKey = info.stationName + "->" + stationName;
        int duration = t - info.time;

        RouteInfo route = routes.getOrDefault(routeKey, new RouteInfo(0, 0));
        route.totalTime += duration;
        route.count++;
        routes.put(routeKey, route);
    }

    public double getAverageTime(String startStation, String endStation) {
        String routeKey = startStation + "->" + endStation;
        RouteInfo route = routes.get(routeKey);
        return route.totalTime / route.count;
    }

    public static void main(String[] args) {
        Week7_Task3_DesignUndergroundSystem undergroundSystem = new Week7_Task3_DesignUndergroundSystem();

        undergroundSystem.checkIn(45, "Leyton", 3);
        undergroundSystem.checkIn(32, "Paradise", 8);
        undergroundSystem.checkOut(45, "Waterloo", 15);
        undergroundSystem.checkOut(32, "Waterloo", 22);

        System.out.println("Avg Time Paradise -> Waterloo: " + undergroundSystem.getAverageTime("Paradise", "Waterloo"));
        System.out.println("Avg Time Leyton -> Waterloo: " + undergroundSystem.getAverageTime("Leyton", "Waterloo"));
    }
}

/*
OUTPUT:
Avg Time Paradise -> Waterloo: 14.0
Avg Time Leyton -> Waterloo: 12.0
*/
