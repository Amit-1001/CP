package CoreJava.Lamda;

import CoreJava.Comparable_and_Comparator.Employee;
import CoreJava.Comparable_and_Comparator.salaryComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LamdaUse {
    public LamdaUse(){

    }

    public static void info(){
        System.out.println("Lamda Execution");
        List<Employee> l = new ArrayList<>();
        l.add(new Employee("Amit","Nitnaware",10000));
        l.add(new Employee("Amit","Pande",100030));
        l.add(new Employee("Mandar","Shelke",400000));
        l.add(new Employee("Saurav","Paddy",30000));
        l.add(new Employee("Adi","Nobel",2000));

        Stream<Employee> res = l.stream().distinct().filter(e -> e.getSalary()>100);

        res.forEach(name -> System.out.println(name.getFirstName()+" "+name.getSalary()));
    }
}
