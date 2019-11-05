import java.io.*;
class Shape1
{
	double a,b;
	Shape1(double x,double y)
	{
		a=x;
		b=y;
	}
	double area()
	{
		System.out.println("area undefined");
		return 0.0;
	}
}

class Rectangle1 extends Shape1
{
	Rectangle1(double x,double y)
	{
		super(x,y);
	}
	double area()
	{
		return a*b;
	}
}

class Triangle1 extends Shape1
{
	Triangle1(double x,double y)
	{
		super(x,y);
	}
	double area()
	{
		return 0.5*a*b;
	}
}

class Polymorphism1
{
	public static void main(String args[]) throws IOException
	{
		int option,x,y;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Shape1 ref=null;
		
		System.out.println("1.shape\n2.rectangle\n3.triangle\n");
		System.out.println("Enter option: ");
		
		option= Integer.parseInt(br.readLine());
		switch(option)
		{
			case 1:
			{
				Shape1 s= new Shape1(2,4);
				ref=s;
				break;
			}
			case 2:
			{
				System.out.println("enter height: ");
				x=Integer.parseInt(br.readLine());
				System.out.println("enter base: ");
				y=Integer.parseInt(br.readLine());
				Rectangle1 r= new Rectangle1(x,y);
				ref=r;
				break;
			}
			case 3:
			{
				System.out.println("enter height: ");
				x=Integer.parseInt(br.readLine());
				System.out.println("enter base: ");
				y=Integer.parseInt(br.readLine());
				Triangle1 t=new Triangle1(x,y);
				ref=t;
				break;
			}
			default : System.out.println("invalid option");
		}
		System.out.println("area is :"+ref.area());
		
	}
}
