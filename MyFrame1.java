//Licence Registration
//package myBookStore;
import java.awt.*;
import java.awt.event.*;
import java.awt.AWTEvent.*;
import javax.swing.*;
class MyFrame1 extends JFrame
{
	//Component
	//JFrame f;
	JTextField t1,t2,t3,t4,t5,t6;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16;
	JButton b1,b2,b3,b4,b5,b6,b7;
	JComboBox jcb1,jcb2,jcb3,jcb4,jcb5,jcb6;

	MyActionListener ml = new MyActionListener(this);
	
	MyFrame1()
	{
		//JFrame f = new JFrame();
		CheckboxGroup cbg = new CheckboxGroup();


		String man[]={"Select"};        
    	jcb1=new JComboBox(man);    
    	jcb1.setBounds(160,120,90,20);    
    	add(jcb1);

		String mod[]={"Select"};        
    	jcb2=new JComboBox(mod);    
    	jcb2.setBounds(160,160,90,20);    
    	add(jcb2);       

		String vtype[]={"Select"};        
    	jcb3=new JComboBox(vtype);    
    	jcb3.setBounds(160,230,90,20);    
    	add(jcb3);

		String btype[]={"Select"};        
    	jcb4=new JComboBox(btype);    
    	jcb4.setBounds(160,260,90,20);    
    	add(jcb4);

    	String col[]={"Select"};        
    	jcb5=new JComboBox(col);    
    	jcb5.setBounds(680,140,90,20);    
    	add(jcb5);


    	String date[]={"Select"};        
    	jcb6=new JComboBox(date);    
    	jcb6.setBounds(680,260,90,20);    
    	add(jcb6);

		//Initialized Components
		
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		t4 = new JTextField();
		t5 = new JTextField();
		t6 = new JTextField();

		b1 = new JButton("SAVE");
		b2 = new JButton("Modify");
		b3 = new JButton("Delete");
		b4 = new JButton("Reset");
		b5 = new JButton("Exit");
		b6 = new JButton("Search");
		b7 = new JButton("Get Vehicle Information");

		l1 = new JLabel("LICENCE INFORMATION");
		l2 = new JLabel("Licence No : ");
		l3 = new JLabel("Licence Status : ");
		l4 = new JLabel("Vehicle Type : ");
		l5 = new JLabel("VALIDITY ");
		l6 = new JLabel("From : ");
		l7 = new JLabel("Till : ");
		l8 = new JLabel("PERSONAL INFORMATION ");
		l9 = new JLabel("Name : ");
		l10 = new JLabel("Blood Group : ");
		l11 = new JLabel("Image : ");
		l12 = new JLabel("DOB : ");
		l13 = new JLabel("ID : ");
		l14 = new JLabel("Address : ");
		l15 = new JLabel("Contact No. : ");
		l16 = new JLabel("Gender : ");

		Checkbox checkBox1 = new Checkbox("Male", cbg, false);    
        checkBox1.setBounds(680,460, 50,50);    
        Checkbox checkBox2 = new Checkbox("Female", cbg, false);    
        checkBox2.setBounds(800,460, 50,50);    
		
		//Set Component
		l1.setBounds(20,20,500,50);
		
		
		l2.setBounds(40,40,100,100);
		t1.setBounds(160,70,350,30);
		

		l3.setBounds(40,80,100,100);
		l4.setBounds(40,120,100,100);
		l5.setBounds(20,160,100,100);
		l6.setBounds(40,190,100,100);
		l7.setBounds(40,220,100,100);
		l8.setBounds(550,20,260,50);
		
		l9.setBounds(550,40,120,100);
		t2.setBounds(680,70,350,30);

		l10.setBounds(550,100,100,100);
		
		l11.setBounds(550,160,100,100);
		t3.setBounds(680,190,350,30);


		l12.setBounds(550,220,100,100);
		

		l13.setBounds(550,280,100,100);
		t4.setBounds(680,310,350,30);

		
		l14.setBounds(550,340,100,100);
		t5.setBounds(680,370,350,30);

		l15.setBounds(550,400,100,100);
		t6.setBounds(680,430,350,30);

		l16.setBounds(550,430,100,100);

		
	
		b1.setBounds(150,575,100,50);
		b2.setBounds(260,575,100,50);
		b3.setBounds(370,575,100,50);
		b4.setBounds(480,575,100,50);
		b5.setBounds(590,575,100,50);
		b6.setBounds(150,500,100,50);
		b7.setBounds(400,500,200,50);
		
		Font f1 = new Font("Arial",Font.BOLD,20);
		//Font f2 = new Font("Arial",Font.ITALIC,75);
		////SetFont
		l1.setFont(f1);
		l5.setFont(f1);
		l8.setFont(f1);
		//l2.setFont(f1);
		//t1.setFont(f1);
		//t2.setFont(f1);
		//b1.setFont(f2);
		//b2.setFont(f2);
		//b3.setFont(f2);
		//b4.setFont(f2);
		//b5.setFont(f2);
		//b6.setFont(f2);
		//b7.setFont(f2);
		//Add Component to Frame
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(t5);
		add(t6);

		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(l8);
		add(l9);
		add(l10);
		add(l11);
		add(l12);
		add(l13);
		add(l14);
		add(l15);
		add(l16);


		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);

		add(checkBox1);    
        add(checkBox2);  

		setSize(1200,680);
		setLayout(null); 
		//setVisible(true);
		
		b1.addActionListener(ml);
		b2.addActionListener(ml);
		
		//When Frames X Button Pressed
		addWindowListener(new WindowAdapter()
			{
				//use closing method Not Closed
				public void windowClosing(WindowEvent e)
				{
					System.exit(0);
				}
			});
	}
	
	
	public static void main(String args[])
	{
		MyFrame1 mf1 = new MyFrame1();
		mf1.setVisible(true);
		//new MyFrame1();
	}
}