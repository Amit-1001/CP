package CoreJava.Java8_features.Default_Interfaces;

public interface Person {
    default void NameOfPerson(){ // not compulsion to implement it into child class
        System.out.println("This is default name");
    }
}
