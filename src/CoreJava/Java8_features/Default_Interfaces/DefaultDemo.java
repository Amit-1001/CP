package CoreJava.Java8_features.Default_Interfaces;

public class DefaultDemo implements Person{
    public static void main(String[] args) {
        DefaultDemo obj = new DefaultDemo();
        obj.NameOfPerson(); // this is default method available for this class
        // we have can even provide our own implementation for default method
    }
}
