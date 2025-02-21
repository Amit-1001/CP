package CoreJava.Comparable_and_Comparator;

import CoreJava.Comparable_and_Comparator.Employee;

import java.util.Comparator;

public class lastNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}
