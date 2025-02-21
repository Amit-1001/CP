package CoreJava.Thread_Info;

public class Thread_Demo extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+" Running");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread_Demo t1 = new Thread_Demo();
        Thread_Demo t2 = new Thread_Demo();

        t1.start();
        t1.sleep(2000);

        t2.start();
    }

}
