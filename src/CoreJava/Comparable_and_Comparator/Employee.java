package CoreJava.Comparable_and_Comparator;

//Comparable
public class Employee implements Comparable<Employee>{

    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    private String lastName;
    private int salary;

    public Employee(String firstName, String lastName,int salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    @Override
    public int compareTo(Employee o) {
            // sorting based on lastName
            return this.lastName.compareTo(o.lastName);

    }

    @Override
    public String toString() {
        return this.firstName + " " +this.lastName + " " + this.salary;
    }


}
