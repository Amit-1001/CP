package CoreJava.Thread_Info;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executive_Service implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println(Thread.currentThread().getName()+" Running");
        }


    }

    public static void main(String[] args) {
        // creates thread pool
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Executive_Service obj1  = new Executive_Service();
        Executive_Service obj2  = new Executive_Service();
        Executive_Service obj3  = new Executive_Service();

        executorService.submit(obj1);
        executorService.submit(obj2);
        executorService.submit(obj3);

        executorService.shutdown();

    }
}
