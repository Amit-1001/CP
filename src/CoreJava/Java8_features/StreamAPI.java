package CoreJava.Java8_features;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamAPI {

    public static void findEven(){
        List<Integer> list = Arrays.asList(10,2,4,3,5,6,20,5,223);

        // to collect as list
        List<Integer> res = list.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(res);

        System.out.println("---------------without collector------------");
        // to print
        list.stream().filter(n->n%2==0).forEach(System.out::println);
    }

    public static void noDuplicate(){
        System.out.println("-------------No duplicate----------------");
        List<Integer> myList = Arrays.asList(1, 1, 85, 6, 2, 3, 65, 6, 45, 45, 5662, 2582, 2, 2, 266, 666, 656);
        myList.stream().distinct().forEach(noDuplicateData -> System.out.print(noDuplicateData+" "));
    }

    public static void optionalable_demo() throws Exception {
        System.out.println("\n------------------------Optional Class---------------------------");
        List<String> list = Arrays.asList("Amit");
        Optional<List> option = Optional.ofNullable(list);
        Boolean str = option.stream().anyMatch(name->name.contains("Amit"));
        System.out.println(str);

    }


    public static void main(String[] args) throws Exception {
        findEven();
        noDuplicate();

        optionalable_demo();


    }
}
