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
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(new Executive_Service());

        executorService.submit(new Executive_Service());

        executorService.shutdown();
    }
}
