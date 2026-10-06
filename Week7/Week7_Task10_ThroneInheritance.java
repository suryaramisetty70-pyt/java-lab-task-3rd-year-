import java.util.*;

public class Week7_Task10_ThroneInheritance {
    private String king;
    private Map<String, List<String>> children = new HashMap<>();
    private Set<String> dead = new HashSet<>();

    public Week7_Task10_ThroneInheritance(String kingName) {
        this.king = kingName;
        children.put(kingName, new ArrayList<>());
    }

    public void birth(String parentName, String childName) {
        children.computeIfAbsent(parentName, k -> new ArrayList<>()).add(childName);
    }

    public void death(String name) {
        dead.add(name);
    }

    public List<String> getInheritanceOrder() {
        List<String> order = new ArrayList<>();
        dfs(king, order);
        return order;
    }

    private void dfs(String current, List<String> order) {
        if (!dead.contains(current)) {
            order.add(current);
        }
        if (children.containsKey(current)) {
            for (String child : children.get(current)) {
                dfs(child, order);
            }
        }
    }

    public static void main(String[] args) {
        Week7_Task10_ThroneInheritance t = new Week7_Task10_ThroneInheritance("king");

        t.birth("king", "andy");
        t.birth("king", "bob");
        t.birth("king", "catherine");
        t.birth("andy", "matthew");
        t.birth("bob", "alex");

        System.out.println("Inheritance Order 1: " + t.getInheritanceOrder());

        t.death("bob");
        System.out.println("Inheritance Order 2 (after Bob's death): " + t.getInheritanceOrder());
    }
}

/*
OUTPUT:
Inheritance Order 1: [king, andy, matthew, bob, alex, catherine]
Inheritance Order 2 (after Bob's death): [king, andy, matthew, alex, catherine]
*/
