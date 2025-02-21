package CoreJava.Syncronization;

public class SynchronizeBank {
    private int balance = 1000;
    public synchronized void Withdraw(int amount){
        if(balance>=amount){
            System.out.println(Thread.currentThread().getName()+" withdrawing "+amount);
            balance -=amount;
        }else{
            System.out.println("Insufficient fund "+Thread.currentThread().getName());
        }
    }

}
