class PracVector2
{
	public static void main(String args[])
	{
		Rectangle r1=new Rectangle();
		System.out.println(r1);
		Rectangle r2=new Rectangle();
		System.out.println(r2);
	}
}

class Rectangle
{
	int l=5,h=9;
	double area()
	{
		return l*h;
	}
}