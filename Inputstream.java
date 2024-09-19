import java.io.*;
import java.util.*;

public class Inputstream {

    public static void main(String args[]) {
        Float principal, rate, time;
        BufferedReader in = new BufferedReader(
            new InputStreamReader(System.in)
        );
        try {
            System.out.println("Enter principal amount:");
            principal = Float.valueOf(in.readLine());
            System.out.flush();
            System.out.println("Enter rate of interest:");
            rate = Float.valueOf(in.readLine());
            System.out.flush();
            System.out.println("Enter time:");
            time = Float.valueOf(in.readLine());
            System.out.flush();
            System.out.println(
                "Simple Interest=" + (principal * rate * time) / 100
            );
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
