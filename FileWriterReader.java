import java.util.*;
import java.io.*;
public class FileWriterReader{
    public static void main(String args[]) throws IOException{
    
    Scanner P=new Scanner(System.in);
    try{
    FileWriter fw=new FileWriter("samples.txt");
   
    System.out.println("Enter Line:");
    String str=P.nextLine();
    fw.write(str);
    fw.close();
    }
    catch(FileNotFoundException e){
        System.out.println(e);
    }
    try{
     FileWriter fw2=new FileWriter("sample2.txt");
    FileReader fr=new FileReader("sample.txt");
    BufferedReader bf=new BufferedReader(fr);
    String s2="";
    while((s2=bf.readLine())!=null){
        fw2.write(s2);
    }
    fw2.close();
    fr.close();
    }
   catch(FileNotFoundException e){
        System.out.println(e);
    }
}
}
