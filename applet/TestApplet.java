import java.awt.*;
import java.applet.*;

public class TestApplet extends Applet
{
	String str;
	public void init()  
	{
		Font f;
		f= new Font("Serif",Font.BOLD|Font.PLAIN,15);
		setFont(f);
		setBackground(Color.cyan);
		setForeground(Color.red);
		str="within init()";
	}
	public void start()
	{
		str+="within start()";
	}
	public void stop()
	{
		str+="within stop()";
	}
	public void destroy()
	{
		str+="within destroy()";
		System.out.println("within destroy()");
	}
	public void paint(Graphics g)
	{
		str+="within paint()";
		g.drawString(str,10,150);
	}
}