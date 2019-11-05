import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface Method
{
	double area();
}
abstract class Polygon
{
	double x,y;
	abstract void display();
	Polygon(double xx,double yy)
	{
		x=xx;
		y=yy;
	}
}
class Rectangle extends Polygon implements Method 
{
	Rectangle(double xx,double yy)
	{
		super(xx,yy);
	}
	public double area()
	{
		return x*y;
	}
	void display()
	{
		System.out.println("Rectangle has four sides");
	}
}

class Triangle extends Polygon implements Method 
{
	Triangle(double xx,double yy)
	{
		super(xx,yy);
	}
	public double area()
	{
		return 0.5*x*y;
	}
	void display()
	{
		System.out.println("Triangle has three sides");
	}
}

class Ellipse implements Method 
{
	double rx,ry;
	Ellipse(double xx,double yy)
	{
		rx=xx;
		ry=yy;
	}
	public double area()
	{
		return 3.14159*rx*ry;
	}
}

class InterfaceDemo
{
	public static void main(String args[]) throws IOException
	{
		Method ref1=null;
		Polygon ref2=null;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int option;
		System.out.print("1.Rectangle\n2.Triangle\n3.Ellipse\n\nEnter your option: ");
		option = Integer.parseInt(br.readLine());
		switch(option)
		{
			case 1:	Rectangle r1=new Rectangle(8,7);
					ref1=r1;
					ref2=r1;
					ref2.display();
					System.out.println("Rectangle");
					break;
			case 2:	Triangle t1=new Triangle(8,6);
					ref1=t1;
					ref2=t1;
					ref2.display();
					System.out.println("Triangle");
					break;
			case 3:	Ellipse e1=new Ellipse(4,5);
					ref1=e1;
					System.out.println("Ellipse");
					break;
		}
		System.out.println("area is "+ref1.area());
	}
}
