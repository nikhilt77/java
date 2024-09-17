import java.util.*;
import java.io.*;
import java.lang.*;

class ThreadA implements Runnable{
    public void run(){
        for(int i=0;i<10;i+=2){
            System.out.println("Thread A: "+i);
        }
        System.out.println("Exiting Thread A");
    }
}
class ThreadB implements Runnable{
    public void run(){
        for(int i=10;i>=0;i-=2){
            System.out.println("Thread B: "+i);
        }
        System.out.println("Exiting Thread B");
    }
}
class ThreadC implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Thread C: "+i);
        }
        System.out.println("Exiting Thread C");
    }
}
public class mult{
    public static void main(String[] args){
        Thread T=new Thread(new ThreadA());
        Thread T1=new Thread(new ThreadB());
        Thread T2=new Thread(new ThreadC());
        T.start();
        T1.start();
        T2.start();
    }
}
