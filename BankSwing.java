import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*;

public class BankSwing extends JFrame implements ActionListener {
	JTextField f1,f2,f3,f4;
	JButton w;
	Container c;
	BankSwing(){
		c=getContentPane();
		c.setLayout(new FlowLayout());
		f1=new JTextField("Account Number",50);
		f2=new JTextField("Account Holder",50);
		f3=new JTextField("Amount",50);
		f4=new JTextField(50);
		c.add(f1);
		c.add(f2);
		c.add(f3);
		c.add(f4);
		w=new JButton("Withdraw");
		w.addActionListener(this);
		c.add(w);
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==w) {
			int amount=Integer.parseInt(f3.getText());
			if(amount>25000) {
				f4.setText("The limit exceeded");
			}
			else {
				f4.setText("The transaction success");
			}
			try {
			FileWriter fw=new FileWriter("bankdetails.txt",true);
			fw.write("Account Number:"+f1.getText()+"\n");
			fw.write("Account Holder:"+f2.getText()+"\n");
			fw.write("Amount:"+f3.getText()+"\n");
			fw.write(f4.getText()+"\n");
			fw.close();
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	public static void main(String args[]) {
		BankSwing sw=new BankSwing();
		sw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sw.setSize(300,300);
		sw.setVisible(true);
	}

}
