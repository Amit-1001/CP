import CoreJava.Comparable_and_Comparator.Employee;
import CoreJava.Comparable_and_Comparator.salaryComparator;
import CoreJava.Lamda.LamdaUse;

import java.util.*;

public class Main {

    public static void main(String aargs[]) {


        List<Employee> l = new ArrayList<>();
        l.add(new Employee("Amit","Nitnaware",10000));
        l.add(new Employee("Amit","Pande",100030));
        l.add(new Employee("Mandar","Shelke",400000));
        l.add(new Employee("Saurav","Paddy",30000));
        l.add(new Employee("Adi","Nobel",2000));

        Collections.sort(l); // this will look for comparable class

        for(Employee e : l){
            System.out.println(e.toString());
        }

        // comparator user
        Collections.sort(l,new salaryComparator()); // sorting based on last name
        System.out.println("\nLast name sort\n");

        for(Employee e : l){
            System.out.println(e.toString());
        }


        System.out.println("==========================");
        LamdaUse.info();


    }



}
