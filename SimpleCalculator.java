import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class SimpleCalculator extends JFrame implements ActionListener {
    Double first, second, result;
    String operator;
    JButton b;
    JTextField t;
    Container c;

    SimpleCalculator() {
        String buttons[] = {"=","+", "-", "*", "/", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "DEL", "CLR"};

        c = getContentPane();
        c.setBackground(Color.red);
        c.setLayout(new FlowLayout());
       
        for (String button : buttons) {
            b = new JButton(button);
            b.setBackground(Color.CYAN);
            c.add(b);
            b.addActionListener(this);
        }

        t = new JTextField(20);
        t.setBounds(150,150,150,150);
        c.add(t);

        setSize(300, 300);
        setVisible(true);
      
    }

    public void actionPerformed(ActionEvent ae) {
        JButton s = (JButton) ae.getSource();
        String str = s.getText();
        switch (str) {
            case "+":
            case "-":
            case "*":
            case "/":
                operator = str;
                first = Double.parseDouble(t.getText());
                t.setText("");
                break;
            case "=":
                second = Double.parseDouble(t.getText());
                result = performOperation(operator);
                t.setText(String.valueOf(result));
                break;
            case "CLR":
                t.setText("");
                break;
            default:
                t.setText(t.getText() + str);
        }
    }

    private double performOperation(String operator) {
        switch (operator) {
            case "+":
                return first + second;
            case "-":
                return first - second;
            case "/":
                if (second == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                } else {
                    return first / second;
                }
            case "*":
                return first * second;
            default:
                return second;
        }
    }

    public static void main(String args[]) {
        SimpleCalculator s=new SimpleCalculator();
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
