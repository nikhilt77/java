import java.util.*;
import java.io.*;

public class File2 {
    public static void main(String args[]) {
        try {
            File f = new File("hello.txt");
            FileOutputStream fis = new FileOutputStream(f);
            DataOutputStream dis = new DataOutputStream(fis);
            
            // Writing command-line arguments to the file
            for (int i = 0; i < args.length; i++) {
                dis.writeUTF(args[i]);
            }
            
            dis.flush();
            dis.close();
            fis.close();
            
            // Reading from the file
            FileInputStream fis1 = new FileInputStream(f);
            DataInputStream dis1 = new DataInputStream(fis1);
            
            while (dis1.available() > 0) {
                System.out.println(dis1.readUTF());
            }
            
            dis1.close();
            fis1.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
