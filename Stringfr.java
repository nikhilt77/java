import java.io.*;
import java.util.*;

public class Stringfr {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int Al=A.length();
        int Bl=B.length();
        System.out.println(Al+Bl);        
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        String ogA=A.substring(0,1).toUpperCase()+A.substring(1);
        String ogB=B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.println(ogA+" "+ogB); 
    }
}
