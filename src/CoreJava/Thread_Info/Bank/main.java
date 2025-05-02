package CoreJava.Thread_Info.Bank;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); // initial balance of bank

        ExecutorService executor = Executors.newFixedThreadPool(4);// three thread

        // sequence of submission might vary while execution.
        executor.submit(()->account.withdraw(500));
        executor.submit(()->account.withdraw(500));
        executor.submit(()->account.deposit(1000));
        executor.submit(()->account.withdraw(2000));

        executor.shutdown();





    }
}
