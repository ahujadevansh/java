import java.util.*;
class Circle
{
	double radius;
	static final double PI=3.1415; 
	Scanner sc = new Scanner(System.in);
	Circle()
	{
		radius=1;
	}
	Circle(double r)
	{
		radius=r;
	}
	void getRadius()
	{
		System.out.print("enter radius: ");
		radius= sc.nextInt();
	}
	void display()
	{
		System.out.println("Radius = "+radius);
	}
	double circumference()
	{
		return 2*PI*radius;
	}
	double diameter()
	{
		return 2*radius;
	}
	double area()
	{
		return PI*radius*radius;
	}
}

class CircleDemo
{
	public static void main(String args[])
	{
		Circle c1,c2;
		c1=new Circle();
		c2=new Circle(5);
		
		c1.getRadius();
		c1.display();
		System.out.println("Area of c1 = "+c1.area());
		System.out.println("Circumference = "+c1.circumference());
		System.out.println("Diameter = "+c1.diameter());
		
		c2.display();
		System.out.println("Area of c1 = "+c2.area());
		System.out.println("Circumference = "+c2.circumference());
		System.out.println("Diameter = "+c2.diameter());
		
		
	}
}