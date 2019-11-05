import java.util.*;
class Complex
{
	double x,y;
	Scanner sc= new Scanner(System.in);
	Complex()
	{
		x=1;
		y=1;
	}
	Complex(double xx,double yy)
	{
		x=xx;
		y=yy;
	}
	Complex(Complex ob)
	{
		x=ob.x;
		y=ob.y;
	}
	Complex(double a)
	{
		x=a;
		y=a;
	}
	void display()
	{
		System.out.println("compex number is: "+x+ "+i(" +y+ ")");
	}
	void getComplex()
	{
		System.out.print("enter real and imaginary part: ");
		x=sc.nextDouble();
		y=sc.nextDouble();
	}
	void add(Complex a,Complex b)
	{
		x=a.x+b.x;
		y=a.y+b.y;
	}
	void subtract(Complex a,Complex b)
	{
		x=a.x-b.x;
		y=a.y-b.y;
	}
	void multiply(Complex a,Complex b)
	{
		x=a.x*b.x-b.y*a.y;
		y=a.y*b.x+b.y*a.x;
	}
	void divide(Complex a,Complex b)
	{
		x=(a.x*b.x+b.y*a.y)/(b.x*b.x+b.y*b.y);
		y=(a.y*b.x-b.y*a.x)/(b.x*b.x+b.y*b.y);
	}
}

class ComplexDemo
{
	public static void main(String args[])
	{
		Complex c1,c2,c3;
		c1=new Complex();
		c2=new Complex(2,2);
		c3=new Complex();
		c1.display();
		c2.display();
		c3.getComplex();
		c3.display();
		
		c1.add(c2,c3);
		c1.display();
		
		c1.subtract(c2,c3);
		c1.display();
		
		c1.multiply(c2,c3);
		c1.display();
		
		c1.divide(c2,c3);
		c1.display();
	}
}