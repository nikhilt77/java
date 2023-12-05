import java.swing.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import java.awt.*;
import java.awt.event.*;

public class CalculatorSwing extends JFrame {
    JTextField t1, t2, t3;
    JButton b1, b2, b3, b4;
    JLabel l1, l2, l3;

    public CalculatorSwing() {
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        b1 = new JButton("+");
        b2 = new JButton("-");
        b3 = new JButton("*");
        b4 = new JButton("/");
        l1 = new JLabel("First Number");
        l2 = new JLabel("Second Number");
        l3 = new JLabel("Result");
        setLayout(new FlowLayout());
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        b1.addActionListener(new ActionListener()) {
            public void actionPerformed(ActionEvent ae) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a + b;
                t3.setText(String.valueOf(c));
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a - b;
                t3.setText(String.valueOf(c));
            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a * b;
                t3.setText(String.valueOf(c));
            }
        });
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a / b;
                t3.setText(String.valueOf(c));
            }
        });
    }

    public static void main(String[] args) {
        // SwingUtilities.invokeLater(new Runnable() {
        CalculatorSwing c = new CalculatorSwing();
        c.setSize(400, 400);
        c.setVisible(true);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
