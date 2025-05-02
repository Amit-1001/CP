package CoreJava.Thread_Info.Bank;

import javax.swing.*;
import javax.swing.plaf.TableHeaderUI;

public class BankAccount {
    private int balance;

    public BankAccount(int balance){
        this.balance = balance;
    }


    public synchronized void deposit(int amount){
        System.out.println(Thread.currentThread().getName()+" has deposited amount!");
        balance = balance+amount;
        System.out.println("New bank balance:"+balance);
    }

    public synchronized void withdraw(int amount){
        if(balance<=amount){
            System.out.println(Thread.currentThread().getName()+" "+" can not withdraw amount, Insufficient Fund!");
        }else{
            System.out.println(Thread.currentThread().getName()+" "+" has withdraw amount:"+amount);
            balance-=amount;
            System.out.println("Current Bank Balance: "+balance);
        }
    }
}
