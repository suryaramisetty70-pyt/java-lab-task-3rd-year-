import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Week9_Task2_IntelligentCPUTaskScheduler {
    static class Task {
        char id;
        int ready;

        Task(char id, int ready) {
            this.id = id;
            this.ready = ready;
        }
    }

    public static int leastInterval(char[] tasks, int k) {
        Map<Character, Integer> count = new HashMap<>();
        for (char c : tasks) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> Integer.compare(count.get(b), count.get(a)));
        pq.addAll(count.keySet());

        Queue<Task> cool = new ArrayDeque<>();
        int time = 0;

        while (!pq.isEmpty() || !cool.isEmpty()) {
            time++;
            while (!cool.isEmpty() && cool.peek().ready <= time) {
                pq.offer(cool.poll().id);
            }
            if (!pq.isEmpty()) {
                char c = pq.poll();
                int left = count.get(c) - 1;
                count.put(c, left);
                if (left > 0) {
                    cool.offer(new Task(c, time + k + 1));
                }
            }
        }

        return time;
    }

    public static void main(String[] args) {
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'C', 'D', 'D'};
        int k = 2;
        int minTime = leastInterval(tasks, k);

        System.out.println("Tasks: A A A B B C D D");
        System.out.println("Cooldown (K): " + k);
        System.out.println("Minimum Execution Time: " + minTime);
    }
}

/*
OUTPUT:
Tasks: A A A B B C D D
Cooldown (K): 2
Minimum Execution Time: 8
*/
