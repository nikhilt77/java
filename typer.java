import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class typer {

    public static void typeCounter(String sentence) {
        int str=0,in=0,dou=0;
        String stri[]=sentence.split(" ");
        for(String tokens:stri){
            try{
                Integer.parseInt(tokens);
                in++;
            }
            catch(NumberFormatException e){
                try{
                    Double.parseDouble(tokens);
                    dou++;
                }
                    catch(NumberFormatException e1){
                        str++;
                    }
                }
            }
        System.out.println("string "+str);
        System.out.println("integer "+in);
        System.out.println("double "+dou);            
        }
    }


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String sentence = bufferedReader.readLine();

        typer.typeCounter(sentence);

        bufferedReader.close();
    }
}
