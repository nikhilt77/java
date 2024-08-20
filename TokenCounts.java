import java.io.*;
import java.util.*;

public class TokenCounts {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        StringTokenizer tokens=new StringTokenizer(s," ''.!,?/");
        int count=tokens.countTokens();
        System.out.println(count);
        while(tokens.hasMoreTokens()){
            System.out.println(tokens.nextToken());
        }
        scan.close();
    }
}

