class Overload1
{
	int add(int a,int b)
	{
		return a+b;
	}
	float add(float a,float b)
	{
		return a+b;
	}
	int add(int a,int b,int c)
	{
		return a+b+c;
	}
	double add(double a,double b)
	{
		return a+b;
	}
	long add(long a,long b)
	{
		return a+b;
	}
}

class OverloadDemo1
{
	public static void main(String args[])
	{
		Overload obj=new Overload();
		System.out.println(obj.add(1,2,3));
		System.out.println(obj.add(4,5));
		System.out.println(obj.add(4.2F,5.2F));
		System.out.println(obj.add(1212121212L,4));
		System.out.println(obj.add(5.5,5));
		
	}
}