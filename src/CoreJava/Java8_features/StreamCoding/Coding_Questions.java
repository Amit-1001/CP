package CoreJava.Java8_features.StreamCoding;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{
    private String name;
    private double salary;
    private String department;



    public Employee(String name,String department , double salary) {
        this.name = name;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}


class Manager {
    int id;
    String name;
    String department;
    double salary;

    public Manager(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class Coding_Questions {

    public static void nonRepeating(){
        String str = "aabbcde";
        Character result = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
        System.out.println("First non-repeating character: " + result);

        Character nonRepeating_result = str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> str.indexOf(c) == str.lastIndexOf(c))
                .findFirst()
                .orElse(null);
        System.out.println("Non repeating :"+nonRepeating_result);
    }
    public static void ConvertStringToUppercase(){
        List<String> list = Arrays.asList("Amit", "Mandar","Saurav","Ram");

        Stream<String> strings = list.stream().map(String::toUpperCase);
        strings.forEach(System.out::println);
    }
    public static void main(String[] args) {
        ConvertStringToUppercase();
        List<Employee> employeeList = Arrays.asList(new Employee("Amit","DEV",10000000),
                                                    new Employee("Mandar","HR",12000000),
                                                    new Employee("Saurav","HR",101010000));

        System.out.println("-------------------Second Highest Salary--------------------");
//        Optional<Employee> secondHighest = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();
//        System.out.println(secondHighest);

        Optional<Employee> second = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();
        System.out.println(second);

        System.out.println("------------------Employees salary greater than 50000-------------------");
//        Map<String , List<Employee>> empGreaterThan50k = employeeList.stream().filter((employee1 -> employee1.getSalary()>1000000)).collect(Collectors.groupingBy(Employee::getName));
//        for (Map.Entry<String, List<Employee>> m: empGreaterThan50k.entrySet()){
//            System.out.println(m.getValue());
//
//        }

        Map<String , List<Employee>> listEmpGreaterThan50K = employeeList.stream().filter(employee -> employee.getSalary()>5000).collect(Collectors.groupingBy(Employee::getName));
        for (Map.Entry<String, List<Employee>> m : listEmpGreaterThan50K.entrySet()){
            System.out.println(m.getValue());
        }


        System.out.println("--------------------Grouping-------------------------");


        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", 60000),
                new Employee("Bob", "IT", 80000),
                new Employee("Charlie", "HR", 70000)
        );

        // find highest salary based on department
        System.out.println("----------------highest salary based on Department---------------");
//        Map<String, Optional<Employee>> map = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
//        map.forEach((name,list)-> System.out.println(name+" "+list.get()));

        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));

        // Calculate average salary per department.
        System.out.println("---------------------Average salary based on department--------------");
//         Map<String , Double> averageSalary = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
//        System.out.println(averageSalary);
        Map<String,Double> averSalary= employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));


        List<Manager> managerList = Arrays.asList(new Manager(1,"Amit","IT",123130),
                new Manager(2,"Saurav","IT",12000),
                new Manager(3,"Mandar","HR",12000),
                new Manager(4,"Ram","CTO",1000));

        System.out.println("-----------Group by department----------");
        Map<String, List<Manager>>  manager= managerList.stream().collect(Collectors.groupingBy(Manager::getDepartment));
         manager.forEach((dept,mList)-> System.out.println(dept +" "+mList));


        System.out.println("-----------------------Count by Department--------------------");

        Map<String,Long> managerDepart = managerList.stream().collect(Collectors.groupingBy(Manager::getDepartment,Collectors.counting()));
        System.out.println(managerDepart);


        System.out.println("----count length of name and group based on same length---");

//        Map<Integer, Long> map7 =  managerList.stream().map(Manager::getName)
//                .collect(Collectors.groupingBy(String::length,Collectors.counting()));
//        System.out.println(map7);

        managerList.stream().map(Manager::getName).collect(Collectors.groupingBy(String::length,Collectors.counting()));

        // display names as well
        System.out.println("-------------Display name having same length------------");
        Map<Integer,List<String>> map1 = managerList.stream().map(Manager::getName).collect(Collectors.groupingBy(String::length));
        System.out.println(map1);

        /// return duplicate
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        System.out.println("----------------------Duplicate-------------------");
        Set<String> set =  words.stream().filter(word -> Collections.frequency(words,word)>1).collect(Collectors.toSet());
        System.out.println(set);


        List<String> names = Arrays.asList("John", "Alice", "Bob", "Eve");

        System.out.println("------------------Sort by length if length is same then sort alphabetical descending order-------------");
        System.out.println("Before: "+ names);
        names.sort(
                Comparator.comparingInt(String::length)          // Sort by length (ascending)
                        .thenComparing(Comparator.reverseOrder()) // Then sort alphabetically (descending)
        );

        System.out.println("After;"+names); // Output: [Eve, Bob, John, Alice]


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("-----------Reverse order----------------");
        System.out.println("Before:"+numbers);
        numbers.sort(Comparator.reverseOrder());
        System.out.println("After:"+numbers);

        System.out.println("-------------find second highest-----------");
        Optional secondHighestNumber = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(secondHighestNumber.get());

        System.out.println("-------------------Partition even odd------------------");
        Map<Boolean,List<Integer>> map4 = numbers.stream().collect(Collectors.partitioningBy((n)->n%2==0));
        System.out.println(map4);
        map4.forEach((key,value)-> {
            if(key == true){
                System.out.println("Even"+value);
            }else{
                System.out.println("Odd"+value);
            }
        });


        List<String> agents = Arrays.asList("Alice", "bob", "Anna", "alex", "Charlie");

        agents.stream().filter((str)->str.toLowerCase().startsWith("A")).collect(Collectors.toList());



        List<String> Words = Arrays.asList("Apple", "Ant", "axe", "Ape", "Cat", "Airplane");

        Words.stream().filter(Str ->!Str.isEmpty()).map(String::toUpperCase).sorted();

        Long count = Words.stream().filter((str)->str.length()>3 && str.toLowerCase().startsWith("a")).count();








    }
}
