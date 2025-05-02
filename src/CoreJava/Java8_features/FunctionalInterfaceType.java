package CoreJava.Java8_features;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/** Type of functional interface:
        *     1.Consumer - it consumes one value and return nothing.
        *     2.Predicate - it takes one argument and return boolean value, mainly used for filtering.
        *     3.Function - it takes one argument and return value after required processing.
        *     4.Supplier - it doesn't take any argument just return value
        *
        *
        * */

public class FunctionalInterfaceType {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Amit");
        names.add("Mandar");
        names.add("Saurav");

        System.out.println("-----------------Consumer------------------");
        Consumer<String> consumer = (name) -> System.out.println(name);
        names.forEach(consumer); // this will print all names


        System.out.println("-----------------Predicates-----------------");
        Predicate<String> predicate = (name) -> !name.equals("Amit");
        System.out.println("Filtering "+ names.stream().filter(predicate).toList());

        List<String> person = Arrays.asList("Alice", "Bob", "alex", "Eve");

        List<String> predicate1 = person.stream().filter(s->s.startsWith("A")|| s.startsWith("a") && s.length()>3).collect(Collectors.toList());
        System.out.println(predicate1);

        boolean isPresent = predicate.test("Amit");
        System.out.println("Predicate value: "+isPresent +" ");


        System.out.println("-----------------Supplier----------------");
        Supplier<Double> getRandNumber = () -> Math.random();
        System.out.println("Random number:"+ getRandNumber.get());

        System.out.println("-------------------Function--------------");
        Function<String,Integer> stringLen = (s) -> s.length(); // function has <Target, Result> parameter
        int len = stringLen.apply("Amit"); // apply method is used to apply function on target
        System.out.println("Length of String :"+len);


    }
}
