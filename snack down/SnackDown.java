import java.util.Scanner;
class Elimination
{
	Scanner sc=new Scanner(System.in);
	int n,k;
	int s[];
	Elimination()
	{
		int i,j,temp;
		n=sc.nextInt();
		k=sc.nextInt();
		s=new int[n];
		for(i=0;i<n;i++)
			s[i]=sc.nextInt();
		for(i=0;i<n-1;i++)
		for(j=0;j<n-1-i;j++)
			if(s[j]<s[j+1])
			{
				temp=s[j];
				s[j]=s[j+1];
				s[j+1]=temp;
			}
		temp=s[k-1];
		for(i=k;i<n;i++)
		{
			if(s[i]==temp)
				k++;
		}
		
	}
}


class SnackDown
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t,i;
		t=sc.nextInt();
		Elimination e[]=new Elimination[t];
		for(i=0;i<t;i++)
		{
			e[i]=new Elimination();
		}
		for(i=0;i<t;i++)
			System.out.println(e[i].k);
	}
}