import java.util.*;

class ThreadA implements Runnable {
    private int n;
    private Random random;
    static int number;

    public ThreadA(int n) {
        this.n = n;
        this.random = new Random();
    }

    public synchronized void run() {
        try {
            for (int i = 0; i < n; i++) {
                number = random.nextInt(n);
                Thread.sleep(1000);
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

    public synchronized void run() {
        try {
            for (int i = 0; i < n; i++) {
                int square = ThreadA.number * ThreadA.number;
                System.out.println("ThreadB: " + square);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Exception in ThreadB");
        }
    }
}

class ThreadC implements Runnable {
    private int n;

    public ThreadC(int n) {
        this.n = n;
    }

    public synchronized void run() {
        try {
            for (int i = 0; i < n; i++) {
                int cube = ThreadA.number * ThreadA.number * ThreadA.number;
                System.out.println("ThreadC: " + cube);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Exception in ThreadC");
        }
    }
}

public class MultiThreadSynchronized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        ThreadA a = new ThreadA(n);
        ThreadB b = new ThreadB(n);
        ThreadC c = new ThreadC(n);
        new Thread(a).start();
        new Thread(b).start();
        new Thread(c).start();
        sc.close();
    }
}
