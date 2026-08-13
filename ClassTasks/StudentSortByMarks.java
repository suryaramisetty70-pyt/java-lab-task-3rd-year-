import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentSortByMarks {

    static class Student {
        private int id;
        private String name;
        private double marks;

        public Student(int id, String name, double marks) {
            this.id = id;
            this.name = name;
            this.marks = marks;
        }

        public int getId() { return id; }
        public String getName() { return name; }
        public double getMarks() { return marks; }

        @Override
        public String toString() {
            return "Student{id=" + id + ", name='" + name + "', marks=" + marks + "}";
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(
            new Student(101, "Suriya", 88.5),
            new Student(102, "Alex", 95.0),
            new Student(103, "Bob", 72.0),
            new Student(104, "Catherine", 91.5)
        ));

        System.out.println("Before Sorting:");
        students.forEach(System.out::println);

        students.sort(Comparator.comparing(Student::getMarks).reversed());

        System.out.println("\nAfter Sorting by Marks Descending:");
        students.forEach(System.out::println);
    }
}

/*
OUTPUT:
Before Sorting:
Student{id=101, name='Suriya', marks=88.5}
Student{id=102, name='Alex', marks=95.0}
Student{id=103, name='Bob', marks=72.0}
Student{id=104, name='Catherine', marks=91.5}

After Sorting by Marks Descending:
Student{id=102, name='Alex', marks=95.0}
Student{id=104, name='Catherine', marks=91.5}
Student{id=101, name='Suriya', marks=88.5}
Student{id=103, name='Bob', marks=72.0}
*/
