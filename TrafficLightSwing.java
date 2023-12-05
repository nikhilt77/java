import java.swing.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import java.awt.*;
import java.awt.event.*;

public class TrafficLightSwing extends JFrame implements ActionListener {
    JButton b1, b2, b3;
    JLabel l1;

    public TrafficLightSwing() {
        b1 = new JButton("Red");
        b2 = new JButton("Yellow");
        b3 = new JButton("Green");
        l1 = new JLabel("Traffic Light");
        setLayout(new FlowLayout());
        add(l1);
        add(b1);
        add(b2);
        add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            // l1.setText("Stop");
            l1.setOpaque(true);
            l1.setBackground(Color.RED);
        }
        if (ae.getSource() == b2) {
            // l1.setText("Ready");
            l1.setOpaque(true);
            l1.setBackground(Color.YELLOW);
        }
        if (ae.getSource() == b3) {
            // l1.setText("Go");
            l1.setOpaque(true);
            l1.setBackground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        TrafficLightSwing t = new TrafficLightSwing();
        t.setSize(400, 400);
        t.setVisible(true);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
