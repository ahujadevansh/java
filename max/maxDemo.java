class max
{
	static int maxx(int a,int b)
	{
		return (a>b)?a:b;
	}
	static double maxx(double a,double b)
	{
		return (a>b)?a:b;
	}
	static long maxx(long a,long b)
	{
		return (a>b)?a:b;
	}
	static char maxx(char a,char b)
	{
		return (a>b)?a:b;
	}
}

class maxDemo
{
	public static void main(String args[])
	{
		System.out.println(max.maxx(1,5));
		System.out.println(max.maxx(4.5F,8));
		System.out.println(max.maxx(4.5,8.8));
		System.out.println(max.maxx('a','f'));
		System.out.println(max.maxx(12589632587L,1458976587L));
	}
}