import java.util.Arrays;
import java.util.Comparator;

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        if (a.score != b.score) {
            return Integer.compare(b.score, a.score);
        }
        return a.name.compareTo(b.name);
    }
}

public class Week3_Session14_JavaComparator {
    public static void main(String[] args) {
        Player[] players = {
            new Player("amy", 100),
            new Player("david", 100),
            new Player("heramb", 50),
            new Player("aakansha", 75),
            new Player("aleksa", 150)
        };

        Arrays.sort(players, new Checker());

        System.out.println("Sorted Players:");
        for (Player p : players) {
            System.out.println(p.name + " " + p.score);
        }
    }
}

/*
OUTPUT:
Sorted Players:
aleksa 150
amy 100
david 100
aakansha 75
heramb 50
*/
