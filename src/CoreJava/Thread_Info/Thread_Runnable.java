package CoreJava.Thread_Info;

public class Thread_Runnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Running");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread_Runnable tr = new Thread_Runnable();

        Thread t1 = new Thread(tr);
        Thread t2 = new Thread(tr);

        t1.start();
        t1.sleep(2000);

        t2.start();


    }
}
