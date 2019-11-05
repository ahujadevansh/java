class Circle
{
	double r;
	static final double PI=3.1415;
	
	double area()
	{
		return PI*r*r;
	}
	Circle()
	{
		r=1;
	}
	Circle(int r)
	{
		this.r=r;
	}
	Circle(Circle ob)
	{
		r=ob.r;
	}
}

class CircleDemo
{
	public static void main(String args[])
	{
		Circle c1,c2,c3;
		c1=new Circle();
		c2=new Circle(5);
		c3=new Circle(c2);
		System.out.println("area of 1st circle is "+c1.area());
		System.out.println("area of 2nd circle is "+c2.area());
		System.out.println("area of 3rd circle is "+c3.area());
	
	}
}