import java.util.*;

abstract class Banker {

    abstract void getBalance();

    abstract void deposit();

    abstract void withdraw();

    void display() {
        System.out.println("Welcome to the Bank");
    }
}

class SBI extends Banker {

    int balance = 0;

    void getBalance() {
        System.out.println("Your balance is: " + balance);
    }

    void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to deposit: ");
        int amount = sc.nextInt();
        balance += amount;
        System.out.println("Amount deposited successfully");
    }

    void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw: ");
        int amount = sc.nextInt();
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn successfully");
        }
    }

    void display() {
        System.out.println("Welcome to SBI Bank");
    }
}

class ICICI extends Banker {

    int balance = 0;

    void getBalance() {
        System.out.println("Your balance is: " + balance);
    }

    void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to deposit: ");
        int amount = sc.nextInt();
        balance += amount;
        System.out.println("Amount deposited successfully");
    }

    void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw: ");
        int amount = sc.nextInt();
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn successfully");
        }
    }

    void display() {
        System.out.println("Welcome to ICICI Bank");
    }
}

public class Bank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bank name: ");
        String bank = sc.nextLine();
        if (bank.equals("SBI")) {
            SBI sbi = new SBI();
            sbi.display();
            sbi.getBalance();
            sbi.deposit();
            sbi.getBalance();
            sbi.withdraw();
            sbi.getBalance();
        } else if (bank.equals("ICICI")) {
            ICICI icici = new ICICI();
            icici.display();
            icici.getBalance();
            icici.deposit();
            icici.getBalance();
            icici.withdraw();
            icici.getBalance();
        } else {
            System.out.println("Invalid bank name");
        }
    }
}
