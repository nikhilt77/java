import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class Synchro extends JFrame implements ActionListener  {
	JTextField t1;
	int n;
	JButton b;
	Container c;
	private final Object lock=new Object();
	Synchro(){
		createThread();
	}
	public void createThread() {
		c=getContentPane();
		c.setLayout(new FlowLayout());
		t1=new JTextField(50);
		c.add(t1);
		b=new JButton("PRINT");
		c.add(b);
		b.addActionListener(this);
	}
		public void actionPerformed(ActionEvent ae) {
			if(ae.getSource()==b) {
				n=Integer.parseInt(t1.getText());
				Thread thr=new Thread(new thr());
				Thread kck=new Thread(new kck());

				thr.start();
				
				kck.start();
			}
		}
		class thr implements Runnable{
					
					public void run() {
						synchronized(lock) {
							for(int i=0;i<n;i++) {
								System.out.println("Thrikkakara");

							}
						}
					}
				}
				class kck implements Runnable{
				 
					public void run() {
						synchronized(lock) {
							for(int i=0;i<n;i++) {
								System.out.println("KOchi");
							}
						}
					}
	}

			
	
	public static void main(String args[]) {
		Synchro sn=new Synchro();
		sn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sn.setSize(300,300);
		sn.setVisible(true);
	}

}
