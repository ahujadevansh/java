import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Login extends Applet implements Runnable 
{   
    Label ltitle1,ltitle2,ltitle3;
    Button b1,b2;
    
    public void init()
    {
        this.setLayout(null);
        this.setSize(800,800);
        this.setLocation(100,100);
        
        Font f1 = new Font("courier",Font.BOLD,15);
        Font f2 = new Font("courier",Font.BOLD,30);
        Font f3= new Font("courier",Font.BOLD,20);
        
        ltitle1=new Label("Arise! Awake! And Stop Not Till The Goal Is Reached");
        ltitle1.setFont(f1);
        ltitle1.setForeground(Color.BLACK);
        ltitle2=new Label("VIVEKANAND EDUCATION SOCIETY");
        ltitle2.setFont(f2);
        ltitle2.setForeground(Color.red);
        ltitle3=new Label("Institute Of Technology");
        ltitle3.setFont(f3);
        ltitle3.setForeground(Color.red);
        b1=new Button("REGISTER");
        b2=new Button ("LOGIN");
        ltitle1.setBounds(88,10,600,10);
        ltitle2.setBounds(60,20,650,45);
        ltitle3.setBounds(165,63,550,20);
        b1.setBounds(250,200,70,35);
        b2.setBounds(320,200,70,35);
        
        add(ltitle1);
        add(ltitle2);
        add(ltitle3);
        add(b1);
        add(b2);
    }