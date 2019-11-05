import java.util.*;

class Fibbo
{
	public static void main(String args[])
	{
		
		int n;
		Scanner ad=new Scanner(System.in);
		System.out.println("enter number of terms: ");
		n=ad.nextInt();
		
		int f=0,s=1,t,i;
		
		if(n==1)
			System.out.print("0");
		else
			if(n==2)
			System.out.print("0 1");
		else
		{
			System.out.print("0 1");
			for(i=3;i<=n;i++)
			{
				t=f+s;
				System.out.print(" "+t);
				f=s;
				s=t;
				
			}	
		}
	}
}
