import javax.xml.crypto.Data;
import java.sql.Date;
import java.util.*;


class newThread extends Thread{
    Thread t1,t2;

    newThread(){
        t1 = new Thread(this,"Thread_1");
        t2 = new Thread(this,"Thread_2");

        t1.start();
        t2.start();
    }

    public  void run(){
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.equals(t2));
    }

}


class T{
    int t =20;
}

public class PractiseCode {


    public static void main(String[] args) {


    }
}
