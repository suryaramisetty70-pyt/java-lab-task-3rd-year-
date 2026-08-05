import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class Student {
    private final int id;
    private final String name;
    private final double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getCgpa() { return cgpa; }
}

public class Week3_Session13_JavaPriorityQueue {
    public static List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> pq = new PriorityQueue<>(
            Comparator.comparing(Student::getCgpa).reversed()
                      .thenComparing(Student::getName)
                      .thenComparing(Student::getId)
        );

        for (String event : events) {
            String[] parts = event.split(" ");
            if (parts[0].equals("ENTER")) {
                String name = parts[1];
                double cgpa = Double.parseDouble(parts[2]);
                int id = Integer.parseInt(parts[3]);
                pq.add(new Student(id, name, cgpa));
            } else if (parts[0].equals("SERVED")) {
                pq.poll();
            }
        }

        List<Student> students = new ArrayList<>();
        while (!pq.isEmpty()) {
            students.add(pq.poll());
        }
        return students;
    }

    public static void main(String[] args) {
        List<String> events = List.of(
            "ENTER John 3.75 50",
            "ENTER Mark 3.8 24",
            "ENTER Shafaet 3.7 35",
            "SERVED",
            "ENTER Samiha 3.85 36",
            "SERVED",
            "ENTER Ashley 3.9 42",
            "ENTER Maria 3.6 46",
            "ENTER Anisha 3.85 47",
            "SERVED"
        );

        List<Student> remaining = getStudents(events);
        System.out.println("Remaining Students:");
        for (Student s : remaining) {
            System.out.println(s.getName());
        }
    }
}

/*
OUTPUT:
Remaining Students:
Anisha
John
Shafaet
Maria
*/
