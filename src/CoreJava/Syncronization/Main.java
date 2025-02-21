package CoreJava.Syncronization;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // this avoids race condition
        SynchronizeBank obj = new SynchronizeBank();

        Thread c1 = new Thread(() -> obj.Withdraw(500), "Customer1");
        Thread c2 = new Thread(() -> obj.Withdraw(500), "Customer2");
        Thread c3 = new Thread(() -> obj.Withdraw(500), "Customer3");

        c1.start();
        c2.start();
        c3.start();

        c1.join(); //
        c2.join(); // c2 wait till c1 finish job

    }
}
