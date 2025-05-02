package CoreJava.Java8_features;

import java.util.Optional;

public class optionalClass {

    public static void main(String[] args) throws StringNotFound {

        String user1 = "Amit3";
        Optional<String> optional = Optional.of(user1); // this is mostly used when we are sure that value is not null
        System.out.println(optional);
        // to get value from optional call we use get() method
        System.out.println(optional.get());

        String user2 = "Mandar";
        Optional<String> optional1 = Optional.ofNullable(user2); // this method is used when we are not sure whether value is null or not
        System.out.println(optional1); // ofNullable will handle null point exception

        String user3 = "Saurav";
        Optional<String> optional3 = Optional.ofNullable(user3);
        String res = optional3.orElse("This is another user"); // is user3 is null then or else value is used
        System.out.println(res);

        String user4 = null;
        Optional<String> optional4 = Optional.ofNullable(user4);
        //String res1 = optional4.orElseThrow(()-> new StringNotFound("String not found"));
        //System.out.println(res1);

        String result = "Pass ";
        Optional<String> op = Optional.of(result); // map take functional interface
        op.filter(str ->str.equals("Pass "))
                .map(String::trim)
                .ifPresent(System.out::println);



    }
}
