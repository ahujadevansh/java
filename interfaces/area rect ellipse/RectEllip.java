import java.util.Scanner;
interface Area
{
	double PI=3.1514;
	double area();
}

class Rectangle implements Area
{
	double x,y;
	Rectangle(double xx,double yy)
	{
		x=xx;
		y=yy;
	}
	public double area()
	{
		return x*y;
	}
}

class Ellipse implements Area
{
	double rx,ry;
	Ellipse(double xx,double yy)
	{
		rx=xx;
		ry=yy;
	}
	public double area()
	{
		return PI*rx*ry;
	}
}

class RectEllip
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Area ref=null;
		Rectangle r1=new Rectangle(5,4);
		Ellipse e1=new Ellipse(4,2);
		int option;
		System.out.print("1.Rectangle\n2.Ellipse\n\nEnter your option: ");
		option = sc.nextInt();
		switch(option)
		{
			case 1:	ref=r1;
					System.out.println("Rectangle");
					break;
			case 2:	ref=e1;
					System.out.println("Ellipse");
					break;
		}
		System.out.println("area is "+ref.area());
	}
}