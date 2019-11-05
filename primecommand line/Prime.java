class Prime
{
	public static void main(String args[])
	{
		int n,flag=1;
		n=Integer.parseInt(args[0]);
		if(n==1)
			flag=0;
		else
			for(int i=2;i<n;i++)
				if(n%i==0)
					flag=0;
		
		if(flag==0)
			System.out.println(n+" is not a prime number");
		else
			System.out.println(n+" is a prime number");
	}
}