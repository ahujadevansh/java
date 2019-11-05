class Triangle
{
	double h,b;
	double area()
	{
		return 0.5*h*b;
	}
	Triangle()
	{
		b=1;
		h=1;
	}
	Triangle(double bb,double hh)
	{
		b=bb;
		h=hh;
	}
	Triangle(Triangle ob)
	{
		b=ob.b;
		h=ob.h;
	}
	void equal(Triangle t)
	{
		if(b==t.b&&h==t.h)
			System.out.println("triangles are equal");
	}
}

class TriangleDemo
{
	public static void main(String args[])
	{
		Triangle t1,t2,t3;
		
		t1=new Triangle();
		t2=new Triangle(5,4);
		t3=new Triangle(t2);
		System.out.println("area of 1st triangle is "+t1.area());
		System.out.println("area of 2nd triangle is "+t2.area());
		System.out.println("area of 3rd triangle is "+t3.area());
		t2.equal(t3);
	}
}