package CoreJava.DsImplementation;

import java.util.Objects;

// with proper implementation of HashCode and Equals
public class EmployeeAsKeyInHashMap {
    final int id;
    String name;
    int salary;

    EmployeeAsKeyInHashMap(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
 // this is proper implementation of hashCode and equals method
    // not setter are used to assign value
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeAsKeyInHashMap that = (EmployeeAsKeyInHashMap) o;
        return id == that.id && salary == that.salary && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary);
    }
}
