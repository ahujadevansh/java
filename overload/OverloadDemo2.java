class OverloadDemo2
{
	public static void main(String args[])
	{
		System.out.println(add(1,2,3));
		System.out.println(add(4,5));
		System.out.println(add(4.2F,5.2F));
		System.out.println(add(1212121212L,4));
		System.out.println(add(5.5,5));
		
	}
	static int add(int a,int b)
	{
		return a+b;
	}
	static float add(float a,float b)
	{
		return a+b;
	}
	static int add(int a,int b,int c)
	{
		return a+b+c;
	}
	static double add(double a,double b)
	{
		return a+b;
	}
	static long add(long a,long b)
	{
		return a+b;
	}
}