import java.util.Scanner;
class word
{
	Scanner sc=new Scanner(System.in);
	int n;
	int a[];
	word()
	{
		n=sc.nextInt();
		a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		if(a[0]==0)
			a[0]=1;
	}
	int countDay()
	{
		int i,j,count=1,day=0;
		while(count<n)
		{
			day++;
			j=count;
			for(i=0;i<j&&count<=n;i++)
			{
				count+=a[i];
			}
		}
		return day;
	}
}

class SPREAD2
{
	public static void main(String args[])
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			int t;
			t=sc.nextInt();
			word w[]=new word[t];
			for(int i=0;i<t;i++)
			{
				w[i]=new word();
			}
			for(int i=0;i<t;i++)
			{
				System.out.println(w[i].countDay());
			}
		}
		catch(Exception e){
            return;
        }
		
	}
}