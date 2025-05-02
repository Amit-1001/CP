package CoreJava.Java8_features;

import java.util.function.Supplier;

public class StringNotFound extends RuntimeException  {
    public StringNotFound(String msg){
        super(msg);
    }
}
