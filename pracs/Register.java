import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code="Register" height=600 width=600>
</applet>
*/
public class Register extends Applet implements ActionListener
{
	Label lname,lpassword;
	TextField tname,tpassword;
	Button ad1,ad2;
	boolean a;
	public void init()
	{
		this.setLayout(null);
		lname=new Label("NAME ");
		lpassword=new Label("PASSWORD ");
		tname=new TextField("");
		tpassword=new TextField("");
		Button ad1=new Button("OK");
		Button ad2=new Button("RESET");
		lname.setBounds(20,20,100,40);
		tname.setBounds(140,20,100,40);
		lpassword.setBounds(20,70,100,40);
		tpassword.setBounds(140,70,100,40);
		ad1.setBounds(40,140,100,40);
		ad2.setBounds(160,140,100,40);
		add(lname);
		add(tname);
		add(ad1);
		add(ad2);
		add(lpassword);
		add(tpassword);
		ad1.addActionListener(this);
		ad2.addActionListener(this);

	}
	 
	public void actionPerformed(ActionEvent e)
	{
		System.out.println(e.getSource());
		a=e.getSource()==ad1;
		System.out.println(a);
		if(e.getSource()==ad1)
		{
			System.out.println("okkk");
		lpassword.setVisible(false);
		tpassword.setVisible(false);
		//b1.setVisible(false);
		//b2.setVisible(false);
		}
		if(e.getSource()==ad2)
		{
		tname.setText(" ");
		tpassword.setText(" ");
		}
	}
}