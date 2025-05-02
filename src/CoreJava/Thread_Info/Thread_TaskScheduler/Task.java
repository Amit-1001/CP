package CoreJava.Thread_Info.Thread_TaskScheduler;

import java.security.PrivateKey;

public class Task implements Runnable{
    private final String task;
    public Task(String task){
        this.task = task;

    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " executing task: " + task);
        try {
            Thread.sleep(2000); // Simulating task execution time
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(Thread.currentThread().getName() + " finished task: " + task);

    }
}
