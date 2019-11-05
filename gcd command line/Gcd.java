class Gcd
{
	public static void main(String args[])
	{
		int m,n;
		
		m=Integer.parseInt(args[0]);
		n=Integer.parseInt(args[1]);
		
		int min;
		min=(m<n)?m:n;
		int gcd=1;
		for(int i=2;i<=min;i++)
			if(m%i==0&&n%i==0)
				gcd=i;
			
		System.out.println("gcd of"+m+ " "+n+ " is "+gcd);
		
	}
}