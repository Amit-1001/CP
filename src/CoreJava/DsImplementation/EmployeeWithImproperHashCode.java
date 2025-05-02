package CoreJava.DsImplementation;
// good practice to make class as final when used as key in HashMap
public final class EmployeeWithImproperHashCode {
    int id;
     String name;
    int salary;

    public EmployeeWithImproperHashCode(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name) { // this is breaking HashMap
        this.name = name;
    }
    @Override
    public int hashCode() {
        return name.hashCode(); // name included
        // only for name hashcode will be generated
        // ideally all attribute should be considered for hash node
        // Object.hash(id,name,salary)
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof EmployeeWithImproperHashCode)) return false;
        EmployeeWithImproperHashCode e = (EmployeeWithImproperHashCode) obj;
        return this.name.equals(e.name); // name comparison
        //this is only comparing name to equality

        // ideally it should check for all attribute
//        // 3. Cast and compare significant fields
//        Employee employee = (Employee) o;
//        return id == employee.id &&
//                salary == employee.salary &&
//                Objects.equals(name, employee.name);
    }


}
