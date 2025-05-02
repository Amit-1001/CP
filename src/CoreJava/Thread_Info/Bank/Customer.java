package CoreJava.Thread_Info.Bank;

public class Customer extends Thread{
    private BankAccount account;
    private boolean isDeposited;
    private int amount;

    public Customer(BankAccount account,boolean isDeposited,int amount,String name){
        super(name);// thread name;
        this.isDeposited = isDeposited;
        this.amount = amount;
        this.account = account;
    }


    @Override
    public void run() {
        if(isDeposited){
            account.deposit(amount);
        }else{
            account.withdraw(amount);
        }

    }
}
