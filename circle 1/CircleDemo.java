class Circle
{
	private double r;
	private static final double PI=3.1415;
	Circle()
	{
		r=1;
	}
	Circle(double rr)
	{
		r=rr;
	}
	double area()
	{
		return PI*r*r;
	}
	double circumference()
	{
		return 2*PI*r;
	}
}

class CircleDemo
{
	public static void main(String args[])
	{
		Circle c1=new Circle(2.82098951713780);
		System.out.println("area of circle "+c1.area());
		System.out.println("circumference of circle "+c1.circumference());
	}
	
	
}