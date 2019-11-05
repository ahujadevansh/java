import java.util.Scanner;
class Matrix3
{
	Scanner sc= new Scanner(System.in);
	int a[][];
	int n;
	void read()
	{
		System.out.print("enter order of Square matrix :");
		n=sc.nextInt();
		a=new int [n][n];
		int i,j;
		System.out.println("enter matrix elements row wise:");
		for (i=0;i<n;i++)
		for (j=0;j<n;j++)
				a[i][j]=sc.nextInt();
	}
	void display()
	{
		int i,j;
		System.out.println("Square matrix :");
		for (i=0;i<a.length;i++)
		{
			for (j=0;j<a[i].length;j++)
				System.out.print(a[i][j]+"  ");
			System.out.println();
		}
	}
	double trace()
	{
		int i,j;
		double sum=0;
		for (i=0;i<n;i++)
		for (j=0;j<n;j++)
			if(i==j)
				sum=sum+a[i][j];
		return sum;
	}
	double norm()
	{
		int i,j;
		double sum=0;
		for (i=0;i<n;i++)
		for (j=0;j<n;j++)
				sum=sum+a[i][j]*a[i][j];
		return Math.sqrt(sum);
	}
	
	
}

class TraceAndNorm
{
	
	public static void main(String args[])
	{
		Matrix3 m1=null;
		m1=new Matrix3();
		m1.read();
		m1.display();
		System.out.println("\n Trace and Norm of matrix is "+m1.trace()+" , "+m1.norm());
	}
	
}