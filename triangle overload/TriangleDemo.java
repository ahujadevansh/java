class Triangle
{
	static double area(double h,double b)
	{
		return 0.5*h*b;
	}
	
	static double area(double a,double b,double c)
	{
		double s=(a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
}

class TriangleDemo
{
	public static void main(String args[])
	{
		System.out.println("area of triangle: "+Triangle.area(5,3));
		System.out.println("area of triangle: "+Triangle.area(3,5,6));	

	}
}