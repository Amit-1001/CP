package CoreJava.Comparable_and_Comparator;

import CoreJava.Comparable_and_Comparator.Employee;

import java.util.Comparator;

public class salaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getSalary() - o2.getSalary();
    }
}
