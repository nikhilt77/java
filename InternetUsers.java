import java.util.*;

class InternetUsers1 {
    static int count = 0;
    static int happyCustomers = count + 1;
    final static int MAX_TIME = 2;
    String name, mood;

    InternetUsers1(String name, String mood) {
        this.name = name;
        this.mood = mood;
    }

    void compute() {
        if (mood.equalsIgnoreCase("Happy")) {
            happyCustomers = ++count + 1;
        } else {
            count++;
        }
    }

    public static void show() {
        System.out.println("Internet users: " + count);
        System.out.println("Happy Customers: " + happyCustomers);
    }

    static {
        System.out.println("Let's start browsing");
        System.out.println("Maximum allotted time for browsing: " + MAX_TIME + " hrs");
    }
}

public class InternetUsers {
    public static void main(String args[]) {
        Scanner P = new Scanner(System.in);
        while (true) {
            System.out.println("Enter mood:");
            String mood = P.nextLine();
            System.out.println("Enter name:");
            String name = P.nextLine();
            InternetUsers1 user = new InternetUsers1(name, mood);
            user.compute();
            InternetUsers1.show();
        }
    }
}

