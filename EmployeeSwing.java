import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
public class EmployeeSwing extends JFrame implements ActionListener{
	JTextField f1,f2,f3,f4,f5,f6;
	Double total;
	JButton b1,b2;;
	JLabel l1,l2,l3,l4,l5;
	Container c;
	EmployeeSwing(){
		c=getContentPane();
		c.setLayout(new GridLayout(7,3));
		
		c.setName("Employee");
		f1=new JTextField(50);
		l1=new JLabel("EmpID");
		c.add(f1);
		c.add(l1);
		f2=new JTextField(50);
		l2=new JLabel("name");
		c.add(f2);
		c.add(l2);
		f3=new JTextField(50);
		l3=new JLabel("BasicPay");
		c.add(f3);
		c.add(l3);
		f4=new JTextField(50);
		l4=new JLabel("DA");
		c.add(f4);
		c.add(l4);
		f5=new JTextField(50);
		l5=new JLabel("HRA");
		c.add(f5);
		c.add(l5);
		b1=new JButton("Save");
		c.add(b1);
		b2=new JButton("Total");
		c.add(b2);
		f6=new JTextField(50);
		c.add(f6);
    f6.setVisible(false);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1) {
			try {
				FileWriter fw=new FileWriter("details.txt",true);
				fw.write("---------------------------------------------------------"+"\n");
				fw.write("EmpID"+"\t"+"Name"+"\t"+"Basic Pay"+"\t"+"DA"+"\t"+"HRA"+"\n");
				fw.write("---------------------------------------------------------"+"\n");
				fw.write(f1.getText()+"\t"+f2.getText()+"\t"+f3.getText()+"\t"+f4.getText()+"\t"+f5.getText()+"\n");
				fw.close();
			}
			catch(IOException e) {
				System.out.println(e);
			}
		}
		if(ae.getSource()==b2) {
			
			
			total=Double.parseDouble(f3.getText())+Double.parseDouble(f4.getText())+Double.parseDouble(f5.getText());
			
			f6.setVisible(true);
			f6.setText(Double.toString(total));
			
			
		}
		
	}

	public static void main(String args[]) {
		EmployeeSwing es=new EmployeeSwing();
		es.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		es.setSize(300,300);
		es.setVisible(true);
	}

}
