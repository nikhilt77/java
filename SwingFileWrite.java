import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class SwingFileWrite extends JFrame implements ActionListener {
    JButton s;
    JTextField t;
    String str;
    Container c;
    int count = 0;

    public SwingFileWrite() {
        c = getContentPane();
        c.setLayout(new FlowLayout());
        c.setVisible(true);
        t = new JTextField(50);
        c.add(t);
        s = new JButton("save");
        s.addActionListener((ActionListener) this);
        c.add(s);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == s) {
            try {
            	File obj =new File("inputdata.txt");
                FileWriter fw = new FileWriter(obj, true);
                fw.write(t.getText());
                fw.close();
                // Close FileWriter after writing
                count=displayfiledetails();
                fw=new FileWriter("inputdata.txt",true);
                fw.write("No. of words:"+count);
                System.out.println(obj.getAbsolutePath());
                fw.close();
                
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public int displayfiledetails() throws IOException {
        FileReader fr = new FileReader("inputdata.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            StringTokenizer token = new StringTokenizer(line, " ");
            while (token.hasMoreTokens()) {
                count++;
                token.nextToken(); // Move to the next token
            }
        }
        br.close(); // Close BufferedReader after reading
        return count;
    }

    public static void main(String[] args) {
        SwingFileWrite sw = new SwingFileWrite();
        sw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sw.setSize(300, 300);
        sw.setVisible(true);
    }
}
