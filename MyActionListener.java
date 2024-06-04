import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class MyActionListener implements ActionListener
{
	MyFrame mf;
	MyFrame1 mf1;
	MyFrame2 mf2;
	MyFrame3 mf3;
	MyFrame4 mf4;
	MyFrame5 mf5;
	//MyFrame2 mf2;


	MyActionListener(MyFrame m){
		this.mf = m;
	}

	MyActionListener(MyFrame1 m){
		this.mf1 = m;
	}

	MyActionListener(MyFrame2 m){
		this.mf2 = m;
	}

	MyActionListener(MyFrame3 m){
		this.mf3 = m;
	}

	MyActionListener(MyFrame4 m){
		this.mf4 = m;
	}

	MyActionListener(MyFrame5 m){
		this.mf5 = m;
	}


	public void actionPerformed(ActionEvent e)
	{
			
		if(e.getActionCommand().equals("Save"))
		{
			mf1 = new MyFrame1();
			
			this.mf1.setVisible(true);
			this.mf.setVisible(false);
			System.out.println("entered");
		}

        if(e.getActionCommand().equals("SAVE"))
		{
			mf3 = new MyFrame3();
			
			this.mf3.setVisible(true);
			this.mf1.setVisible(false);
			System.out.println("entered");
		}

		if(e.getActionCommand().equals("Save1"))
		{
			mf4 = new MyFrame4();
			
			this.mf4.setVisible(true);
			this.mf3.setVisible(false);
			System.out.println("entered");
		}

		
		
       /* if(e.getActionCommand().equals("Save"))
		{
			mf1 = new MyFrame1();
			this.mf.setVisible(false);
			this.mf1.setVisible(true);
		}

        if(e.getActionCommand().equals("Save"))
		{
			mf1 = new MyFrame1();
			this.mf.setVisible(false);
			this.mf1.setVisible(true);
		}

        if(e.getActionCommand().equals("Save"))
		{
			mf1 = new MyFrame1();
			this.mf.setVisible(false);
			this.mf1.setVisible(true);
		}*/

		


		//System.out.println(e.getActionCommand());
	}
}