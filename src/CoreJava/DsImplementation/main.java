package CoreJava.DsImplementation;

import java.util.HashMap;

public class main {
    public static void main(String[] args) {
        HashMap<EmployeeWithImproperHashCode, String> employeeMap = new HashMap<>();
        // Employee class has overridden hashcode and equals method
        // as we are using class as key in HashMap
        EmployeeWithImproperHashCode emp1 = new EmployeeWithImproperHashCode(1, "Sneh", 20000); // each object will have hashcode
        EmployeeWithImproperHashCode emp2 = new EmployeeWithImproperHashCode(2, "Sneha", 20000);

        employeeMap.put(emp1, "First");
        employeeMap.put(emp2, "Second");

        emp1.setName("Mujo"); // when we change name of emp1 then hashcode is also changed
        // this is breaking HashMap functionality
        // this is common pitfall
        // changing value after putting it into map

        System.out.println(employeeMap.get(emp1)); // we won't get any value for emp1 return null

        // with proper implementation of HashMap
        System.out.println("------------------------Proper HashMap----------------------------");
        HashMap<EmployeeAsKeyInHashMap,String> map1 = new HashMap<>();


        EmployeeAsKeyInHashMap e1 = new EmployeeAsKeyInHashMap(1,"Amit",15000);
        EmployeeAsKeyInHashMap e2 = new EmployeeAsKeyInHashMap(1,"Amit",15000);
        // above both object will have same hashCode as all values are same
        // equal method will return true

        EmployeeAsKeyInHashMap e3 = new EmployeeAsKeyInHashMap(2,"Amit",15000);
        // this will have different hashCode as id is different

        map1.put(e1,"First Employee");
        map1.put(e2,"Second Employee");
        map1.put(e3,"Third Employee");

        map1.put(e1,"Changed Value"); // now value for key e1 is changed
        System.out.println("e2 value will also get Changed :"+ map1.get(e2)); // as both have same HashCode

        System.out.println("e3 Value:"+map1.get(e3));








    }
}
