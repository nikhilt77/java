import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    public static void fizzBuzz(int n) {
        for(int i=1;i<=n;i++){
            int a=i;
            if(a%3==0&&a%5==0){
                System.out.println("FizzBuzz");
            }
            else if(a%3==0&&a%5!=0){
                System.out.println("Fizz");
            }
            else if(a%5==0&&a%3!=0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }

}

public class FizzBuzz {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.fizzBuzz(n);

        bufferedReader.close();
    }
}
