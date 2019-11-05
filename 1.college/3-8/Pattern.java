import java.util.*;
class Pattern
{
	public static void main(String args[])
	{
		int n;
		Scanner a=new Scanner(System.in);
		System.out.println("enter number of rows: ");
		n=a.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print(" *");
		
			System.out.println();
		}
	}
}