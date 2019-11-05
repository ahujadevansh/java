import java.io.*;
abstract class Shape2
{
	double a,b;
	Shape2(double x,double y)
	{
		a=x;
		b=y;
	}
	abstract double area();
}

class Rectangle2 extends Shape2
{
	Rectangle2(double x,double y)
	{
		super(x,y);
	}
	double area()
	{
		return a*b;
	}
}

class Triangle2 extends Shape2
{
	Triangle2(double x,double y)
	{
		super(x,y);
	}
	double area()
	{
		return 0.5*a*b;
	}
}

class Polymorphism2
{
	public static void main(String args[]) throws IOException
	{
		int option,x,y;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Shape2 ref=null;
		
		System.out.println("1.rectangle\n2.triangle\n");
		System.out.println("Enter option: ");
		
		option= Integer.parseInt(br.readLine());
		switch(option)
		{
			case 1:
			{
				System.out.println("enter height: ");
				x=Integer.parseInt(br.readLine());
				System.out.println("enter base: ");
				y=Integer.parseInt(br.readLine());
				Rectangle2 r= new Rectangle2(x,y);
				ref=r;
				break;
			}
			case 2:
			{
				System.out.println("enter height: ");
				x=Integer.parseInt(br.readLine());
				System.out.println("enter base: ");
				y=Integer.parseInt(br.readLine());
				Triangle2 t=new Triangle2(x,y);
				ref=t;
				break;
			}
			default : System.out.println("invalid option");
		}
		System.out.println("area is :"+ref.area());
		
	}
}
