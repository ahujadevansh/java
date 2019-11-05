class Triangle
{
	double b,h;
	double area()
	{
		return 0.5*h*b;
	}
	Triangle()
	{
		b=1;
		h=1;
	}
	Triangle(int bb,int hh)
	{
		b=bb;
		h=hh;
	}
	Triangle(int hh)
	{
		b=1;
		h=hh;
	}
	Triangle(Triangle ob)
	{
		b=ob.b;
		h=ob.h;
	}
}
class TriangleDemo
{
	public static void main(String args[])
	{
		Triangle t1,t2,t3,t4;
	t1=new Triangle();
	t2=new Triangle(5,7);
	t3=new Triangle(4);
	t4=new Triangle(t2);
	
	System.out.println("area of 1st triangle is "+t1.area());
	System.out.println("area of 2nd triangle is "+t2.area());
	System.out.println("area of 3rd triangle is "+t3.area());
	System.out.println("area of 4th triangle is "+t4.area());
	
	}
}