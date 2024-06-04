import java.awt.*;
import java.awt.event.*;
import java.awt.AWTEvent.*;
import javax.swing.*;
class MyFrame5 extends JFrame
{

	JLabel l1,l2;
	JTextField t1,t2;
	JButton b1,b2,b3,b4,b5,b6,b7;

	MyActionListener ml = new MyActionListener(this);


	MyFrame5()
	{
		JFrame f = new JFrame();

		f.setSize(1000,680);
		f.setLayout(null);

		t1 = new JTextField();
		t2 = new JTextField();

		b1 = new JButton("Search by Reg. No");
		b2 = new JButton("Delete by Reg. No");
		b3 = new JButton("Search by Fine ID");
		b4 = new JButton("Delete by Fine ID");
		b5 = new JButton("Display Report");
		b6 = new JButton("Display All Reports");
		b7 = new JButton("Exit");

		l1 = new JLabel("Reg. No. :");
		l2 = new JLabel("Fine ID :");


		l1.setBounds(50,50,100,50);
		l2.setBounds(50,200,100,50);

		t1.setBounds(150,50,300,30);
		t2.setBounds(150,200,300,30);

		b1.setBounds(200,100,140,30);
		b2.setBounds(400,100,140,30);
		b3.setBounds(200,250,140,30);
		b4.setBounds(400,250,140,30);
		b5.setBounds(100,400,140,50);
		b6.setBounds(400,400,140,50);
		b7.setBounds(500,500,100,50);


		f.add(t1);
		f.add(t2);

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);

		f.add(l1);
		f.add(l2);

		f.setVisible(true);




		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
	
	
	public static void main(String args[])
	{
		new MyFrame5();
	}
}