import java.util.*;

interface ATM {
    void getBalance();
    void deposit(int amount);
    void withdraw(int amount);
    void display();
}

class SBI implements ATM{
    private int balance=0;
    public void getBalance() {
        System.out.println("Your balance is: " + balance);
    }
    public void deposit(int amount) {
        balance += amount;
        System.out.println("Amount deposited successfully");
    }
    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn successfully");
        }
    }
    public void display() {
        System.out.println("Welcome to SBI Bank");
    }
}

class PNB implements ATM{
    private int balance=0;
    public void getBalance() {
        System.out.println("Your balance is: " + balance);
    }
    public void deposit(int amount) {
        balance += amount;
        System.out.println("Amount deposited successfully");
    }
    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn successfully");
        }
    }
    public void display() {
        System.out.println("Welcome to PNB Bank");
    }
}
class Bank{
    public ATM getBank(String bank){
        if(bank.equals("SBI")){
            return new SBI();
        }
        else if(bank.equals("PNB")){
            return new PNB();
        }
        return null;
    }
}
public class factoryDesign{
    public static void main(String args[]){

        Scanner P=new Scanner(System.in);
        Bank obj=new Bank();
        System.out.println("Enter the bank name: ");
        String bank=P.nextLine();
        ATM bank1=(ATM)obj.getBank(bank);
        bank1.display();
        System.out.print("Enter Deposit:");
        int deposit=P.nextInt();
        bank1.deposit(deposit);
        System.out.print("Enter Withdraw:");
        int withdraw=P.nextInt();
        bank1.withdraw(withdraw);
        bank1.getBalance();
    }
}
