import java.util.*;

class ThreadA implements Runnable {
    private int n;

    public ThreadA(int n) {
        this.n = n;
    }

    public void run() {
        try {
            for (int i = 0; i < n; i++) {
                System.out.println("ThreadA:" + (i * i));
            }
        } catch (Exception e) {
            System.out.println("Exception in ThreadA");
        }
    }
}

class ThreadB implements Runnable {
    private int n;

    public ThreadB(int n) {
        this.n = n;
    }

    public void run() {
        try {
            for (int i = 0; i < n; i++) {
                System.out.println("ThreadB:" + (i * i * i));
            }
        } catch (Exception e) {
            System.out.println("Exception in ThreadB");
        }
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        ThreadA a = new ThreadA(n);
        ThreadB b = new ThreadB(n);
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        t1.start();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();
    }
}
