import java.util.*;

public class main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", "IT"),
                new Employee("Alexander", "HR"),
                new Employee("Michael", "IT"),
                new Employee("Sophia", "Finance")
        );

        Optional<Employee> map = employees.stream().max(Comparator.comparingInt(e->e.getName().length()));
        List<String> names = Arrays.asList("john", "emma", "chris", "sophia");

        names.stream().map(String::toUpperCase).forEach(System.out::println);

        String input = "swiss";

        List<Integer> numbers = Arrays.asList(5, 3, 9, 7, 2, 9, 8);
        numbers.stream().distinct().sorted((a,b)-> b-a).skip(1).findFirst();
        
    }

    private static class Employee {
        private String name;
        private String department;
        public Employee(String name, String department) {
            this.name = name;
            this.department = department;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }
    }
}
