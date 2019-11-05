import java.util.Scanner;
class Fibbo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int f=0,s=1,t,n;
		System.out.println("Enter no of terms: ");
		n=sc.nextInt();
		if(n==1)
			System.out.print("\n 0");
		else
			if(n==2)
				System.out.print("\n 0 1");
			else
			{
				System.out.print("\n 0 1 ");
				for(int i=3;i<n;i++)
				{
					t=f+s;
					f=s;
					s=t;
				   System.out.print(t+" ");
				}
			}
	}
}