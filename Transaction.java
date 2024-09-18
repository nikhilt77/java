import java.util.*;
import java.io.*;
import java.lang.*;

class Account {
    public int balance;
    public int AccountNo;

    void displayBalance() {
        System.out.println("Account Number: " + AccountNo + " Balance: " + balance);
    }

    synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
        displayBalance();
    }

    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
            displayBalance();
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

class Deposit implements Runnable {
    Account ac;
    int amount;

    Deposit(Account ac, int amount) {
        this.ac = ac;
        this.amount = amount;
    }

    public void run() {
        ac.deposit(amount);
    }
}

class Withdraw implements Runnable {
    Account ac;
    int amount;

    Withdraw(Account ac, int amount) {
        this.ac = ac;
        this.amount = amount;
    }

    public void run() {
        ac.withdraw(amount);
    }
}

public class Transaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account ac = new Account();
        ac.AccountNo = 123456;
        ac.balance = 1000;
        ac.displayBalance();

        System.out.print("Enter amount to deposit: ");
        int depositAmount = sc.nextInt();

        System.out.print("Enter amount to withdraw: ");
        int withdrawAmount = sc.nextInt();

        new Thread(new Deposit(ac, depositAmount)).start();
        new Thread(new Withdraw(ac, withdrawAmount)).start();

        sc.close();
    }
}
