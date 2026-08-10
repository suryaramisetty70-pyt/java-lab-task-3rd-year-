import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeDeptSalaryDescending {

    static class Employee {
        private int id;
        private String name;
        private String department;
        private double salary;

        public Employee(int id, String name, String department, double salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public int getId() { return id; }
        public String getName() { return name; }
        public String getDepartment() { return department; }
        public double getSalary() { return salary; }

        @Override
        public String toString() {
            return "Employee{id=" + id + ", name='" + name + "', dept='" + department + "', salary=" + salary + "}";
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
            new Employee(101, "Alice", "IT", 75000),
            new Employee(102, "Bob", "HR", 50000),
            new Employee(103, "Charlie", "IT", 90000),
            new Employee(104, "David", "HR", 60000),
            new Employee(105, "Emma", "Finance", 80000)
        ));

        System.out.println("Before Sorting:");
        employees.forEach(System.out::println);

        employees.sort(
            Comparator.comparing(Employee::getDepartment)
                      .thenComparing(Comparator.comparing(Employee::getSalary).reversed())
        );

        System.out.println("\nAfter Sorting by Department Alphabetically + Salary Descending:");
        employees.forEach(System.out::println);
    }
}

/*
OUTPUT:
Before Sorting:
Employee{id=101, name='Alice', dept='IT', salary=75000.0}
Employee{id=102, name='Bob', dept='HR', salary=50000.0}
Employee{id=103, name='Charlie', dept='IT', salary=90000.0}
Employee{id=104, name='David', dept='HR', salary=60000.0}
Employee{id=105, name='Emma', dept='Finance', salary=80000.0}

After Sorting by Department Alphabetically + Salary Descending:
Employee{id=105, name='Emma', dept='Finance', salary=80000.0}
Employee{id=104, name='David', dept='HR', salary=60000.0}
Employee{id=102, name='Bob', dept='HR', salary=50000.0}
Employee{id=103, name='Charlie', dept='IT', salary=90000.0}
Employee{id=101, name='Alice', dept='IT', salary=75000.0}
*/
