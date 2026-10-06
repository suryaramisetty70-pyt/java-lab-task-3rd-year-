import java.util.ArrayList;
import java.util.List;

public class Week7_Task6_GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> rounded = new ArrayList<>();

        for (int grade : grades) {
            if (grade < 38) {
                rounded.add(grade);
            } else {
                int nextMultiple = ((grade / 5) + 1) * 5;
                if (nextMultiple - grade < 3) {
                    rounded.add(nextMultiple);
                } else {
                    rounded.add(grade);
                }
            }
        }

        return rounded;
    }

    public static void main(String[] args) {
        List<Integer> grades = List.of(73, 67, 38, 33);
        List<Integer> result = gradingStudents(grades);

        System.out.println("Original Grades: " + grades);
        System.out.println("Rounded Grades:  " + result);
    }
}

/*
OUTPUT:
Original Grades: [73, 67, 38, 33]
Rounded Grades:  [75, 67, 40, 33]
*/
