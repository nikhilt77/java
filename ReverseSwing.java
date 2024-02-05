import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Frame extends JFrame implements ActionListener {
    JButton b1;
    JTextField t1, t2;
    JLabel l1, l2;
    Container c;

    Frame() {
        c = getContentPane();
        c.setLayout(new FlowLayout());
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        b1 = new JButton("Reverse");
        l1 = new JLabel("Enter String:");

        b1.addActionListener(this);

        c.add(l1);
        c.add(t1);
        c.add(b1);
        c.add(t2);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Reverse")) {
            String str = t1.getText();
            String words[] = str.split(" ");
            String revS = "";

            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                String revw = "";

                for (int j = word.length() - 1; j >= 0; j--) {
                    revw = revw + word.charAt(j);
                }
                revS = revS + revw + " ";
            }
            t2.setText(revS.trim());
        }
    }
}

class ReverseSwing {
    public static void main(String args[]) {
        Frame f = new Frame();
        f.setSize(250, 250);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
