import java.util.*;
import java.io.*;
public class TryCatchFinallyThrows{
    public static void main(String args[])throws IOException{
        try{
            int b=1;
            int a=3;
            System.out.println(a/b);
            for(int i=0;i<4;i++){
                System.out.println(args[i]);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Hehe");
        }
    
    }
}
