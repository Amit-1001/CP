package CoreJava.Thread_Info.Thread_TaskScheduler;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3); // only 3 task run concurrently
        for(int i=1;i<=5;i++){
            executorService.execute(new Task("Task"+i));
        }
        executorService.shutdown();
    }
}
