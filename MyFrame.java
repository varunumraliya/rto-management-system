//Vehicle Registration
import java.awt.*;
import java.awt.event.*;
import java.awt.AWTEvent.*;
import javax.swing.*;
class MyFrame extends JFrame
{
	//Component
	//JFrame f;
	JTextField t1,t2,t3,t4,t5;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
	JButton b1,b2,b3,b4,b5,b6,b7;
	JComboBox jcb1,jcb2,jcb3,jcb4,jcb5,jcb6,jcb7,jcb8,jcb9;

	MyActionListener ml = new MyActionListener(this);
	
	MyFrame()
	{
		super("Vehicle Registration");
		//JFrame f = new JFrame();

		String man[]={"Select",""};        
    	jcb1=new JComboBox(man);    
    	jcb1.setBounds(160,140,90,20);    
    	add(jcb1);

		String mod[]={"Select"};        
    	jcb2=new JComboBox(mod);    
    	jcb2.setBounds(160,200,90,20);    
    	add(jcb2);       

		String vtype[]={"Select","Two Wheeler","Four Wheeler","Three Wheeler"};        
    	jcb3=new JComboBox(vtype);    
    	jcb3.setBounds(160,260,90,20);    
    	add(jcb3);

		String btype[]={"Select","Metal","Fiber"};        
    	jcb4=new JComboBox(btype);    
    	jcb4.setBounds(160,320,90,20);    
    	add(jcb4);

    	String col[]={"Select"};        
    	jcb5=new JComboBox(col);    
    	jcb5.setBounds(160,380,90,20);    
    	add(jcb5);


    	String date[]={"Select"};        
    	jcb6=new JComboBox(date);    
    	jcb6.setBounds(680,80,90,20);    
    	add(jcb6);

		String fuel[]={"Select"};        
    	jcb7=new JComboBox(fuel);    
    	jcb7.setBounds(680,200,90,20);    
    	add(jcb7);

    	String ecap[]={"Select"};        
    	jcb8=new JComboBox(ecap);    
    	jcb8.setBounds(680,380,90,20);    
    	add(jcb8);

    	String etype[]={"Select"};        
    	jcb9=new JComboBox(etype);    
    	jcb9.setBounds(680,440,90,20);    
    	add(jcb9);



    	
    	
		//Initialized Components
		
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		t4 = new JTextField();
		t5 = new JTextField();
		b1 = new JButton("Save");
		b2 = new JButton("Modify");
		b3 = new JButton("Delete");
		b4 = new JButton("Reset");
		b5 = new JButton("Exit");
		b6 = new JButton("Search");
		b7 = new JButton("Get Vehicle Information");
		l1 = new JLabel("VEHICLE INFORMATION");
		l2 = new JLabel("Reg. No : ");
		l3 = new JLabel("Company : ");
		l4 = new JLabel("Vehicle Model : ");
		l5 = new JLabel("Vehicle Type : ");
		l6 = new JLabel("Body Type : ");
		l7 = new JLabel("Vehicle Color : ");
		l8 = new JLabel("Manufacturing Year : ");
		l9 = new JLabel("Date of Purchase : ");
		l10 = new JLabel("Price of Vehicle : ");
		l11 = new JLabel("Fuel : ");
		l12 = new JLabel("Title : ");
		l13 = new JLabel("Engine No : ");
		l14 = new JLabel("Engine Capacity : ");
		l15 = new JLabel("Engine Type : ");
		
		//Set Component
		l1.setBounds(20,20,500,50);
		
		
		l2.setBounds(40,40,100,100);
		t1.setBounds(160,70,350,30);
		

		l3.setBounds(40,100,100,100);
		l4.setBounds(40,160,100,100);
		l5.setBounds(40,220,100,100);
		l6.setBounds(40,280,100,100);
		l7.setBounds(40,340,100,100);
		l8.setBounds(40,400,120,100);
		t2.setBounds(160,440,350,30);
		l9.setBounds(550,40,120,100);
		l10.setBounds(550,100,100,100);
		t3.setBounds(680,140,350,30);
		l11.setBounds(550,160,100,100);
		l12.setBounds(550,220,100,100);
		t4.setBounds(680,255,350,30);
		l13.setBounds(550,280,100,100);
		t5.setBounds(680,310,350,30);
		l14.setBounds(550,340,100,100);
		l15.setBounds(550,400,100,100);
		
	
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
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		setSize(1200,680);
		setLayout(null); 
		setVisible(true);
		
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
		MyFrame mf = new MyFrame();
		mf.setVisible(true);
		//new MyFrame();
	}
}