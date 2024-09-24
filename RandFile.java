import java.io.*;
import java.util.*;

public class RandFile {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        try {
            RandomAccessFile rf = new RandomAccessFile("f3.txt", "rw");
            FileOutputStream fps = new FileOutputStream("f3.txt");
            rf.writeBytes("Hello");
            System.out.println(
                "Enter strings to write to the file (type 'exit' to finish):"
            );
            String userInput;
            while (true) {
                userInput = scanner.nextLine();
                if (userInput.equalsIgnoreCase("exit")) {
                    break;
                }
                rf.writeBytes(userInput + "\n");
            }

            for (int i = 0; i < 10; i++) {
                rf.writeBytes("Numbers: " + i + "\n");
            }
            rf.seek(0);
            String ch;
            while ((ch = rf.readLine()) != null) {
                System.out.println(rf.readLine());
            }
            rf.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
