package CoreJava.Java8_features;
/**
 * Lambda expression are mainly used to implement functional interface
 * functional interface : interface having only one abstract method, it can have many static and default method in it.
 * pre-defined functional interface
 *     1.Runnable
 *     2.callable
 *     3.comparable
 *     4.ActionListener
 * Type of functional interface:
 *     1.Consumer - it consumes one value and return nothing.
 *     2.Predicate - it takes one argument and return boolean value, mainly used for filtering.
 *     3.Function - it takes one argument and return value after required processing.
 *     4.Supplier - it doesn't take any argument just return value
 *
 *
 * */


interface shape { // this is functional interface;
    void draw(); // single abstract methods
}

 class triangle implements shape {

    @Override
    public void draw() {
        System.out.println("this is triangle shape");

    }
}

public class functionalInterface {

    public static void main(String[] args) {
        triangle t = new triangle(); // this is one way to make use of functional interface
        t.draw();

        shape circle = () -> System.out.println("this is circle");
        circle.draw(); // this is another way to accessing functional interface using lambda expressions

    }

}
