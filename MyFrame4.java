import java.awt.*;
import java.awt.event.*;
import java.awt.AWTEvent.*;
import javax.swing.*;
class MyFrame4 extends JFrame
{

	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16;
	JTextField t1,t2,t3;
	JCheckBox cb1,cb2,cb3,cb4,cb5,cb6;
	JButton b1,b2;

	MyActionListener ml = new MyActionListener(this);


	MyFrame4()
	{
		//JFrame f = new JFrame();

		setSize(1000,680);
		setLayout(null);

		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();

		b1 = new JButton("Send");
		b2 = new JButton("Back");

		l1 = new JLabel("Fine");
		l2 = new JLabel("ID");
		l3 = new JLabel("Reg. No. :");
		l4 = new JLabel("Email ID :");
		l5 = new JLabel("Offences :");
		
		cb1 = new JCheckBox("Licence");
		cb2 = new JCheckBox("Helmet");
		cb3 = new JCheckBox("Signal");
		cb4 = new JCheckBox("Mask");
		cb5 = new JCheckBox("Wrong Side");
		cb6 = new JCheckBox("Over Speed");

		t1.setBounds(150,100,300,30);
		t2.setBounds(150,200,300,30);
		t3.setBounds(150,300,300,30);

		b1.setBounds(400,580,100,50);
		b2.setBounds(600,580,100,50);

		l1.setBounds(500,50,100,50);
		l2.setBounds(50,100,100,50);
		l3.setBounds(50,200,100,50);
		l4.setBounds(50,300,100,50);
		l5.setBounds(50,400,100,50);

		cb1.setBounds(110,400,100,50);
		cb2.setBounds(300,400,100,50);
		cb3.setBounds(110,470,100,50);
		cb4.setBounds(300,470,100,50);
		cb5.setBounds(110,540,100,50);
		cb6.setBounds(300,540,100,50);

		Font f1 = new Font("Arial",Font.BOLD,20);

		l1.setFont(f1);


		add(t1);
		add(t2);
		add(t3);
		add(b1);
		add(b2);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(cb1);
		add(cb2);
		add(cb3);
		add(cb4);
		add(cb5);
		add(cb6);

		setVisible(true);




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
		MyFrame4 mf4 = new MyFrame4();
		mf4.setVisible(true);
		//new MyFrame4();
	}
}