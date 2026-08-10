import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeSalaryAscending {

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
            new Employee(103, "Charlie", "Finance", 90000),
            new Employee(104, "David", "IT", 60000)
        ));

        System.out.println("Before Sorting:");
        employees.forEach(System.out::println);

        employees.sort(Comparator.comparing(Employee::getSalary));

        System.out.println("\nAfter Sorting by Salary Ascending:");
        employees.forEach(System.out::println);
    }
}

/*
OUTPUT:
Before Sorting:
Employee{id=101, name='Alice', dept='IT', salary=75000.0}
Employee{id=102, name='Bob', dept='HR', salary=50000.0}
Employee{id=103, name='Charlie', dept='Finance', salary=90000.0}
Employee{id=104, name='David', dept='IT', salary=60000.0}

After Sorting by Salary Ascending:
Employee{id=102, name='Bob', dept='HR', salary=50000.0}
Employee{id=104, name='David', dept='IT', salary=60000.0}
Employee{id=101, name='Alice', dept='IT', salary=75000.0}
Employee{id=103, name='Charlie', dept='Finance', salary=90000.0}
*/
