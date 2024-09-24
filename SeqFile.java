import java.io.*;
import java.util.*;

public class SeqFile {

    public static void main(String args[]) {
        try {
            FileInputStream fis1 = new FileInputStream("f1.txt");
            FileInputStream fis2 = new FileInputStream("f2.txt");
            SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
            FileOutputStream fps = new FileOutputStream("f3.txt");
            BufferedInputStream bufR = new BufferedInputStream(sis);
            BufferedOutputStream bufO = new BufferedOutputStream(System.out);
            int ch;
            while ((ch = bufR.read()) != -1) {
                bufO.write((char) ch);
                fps.write((char) ch);
            }
            bufR.close();
            fps.close();
            bufO.close();
            fis1.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
