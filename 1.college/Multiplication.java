import java.util.Scanner;
class Matrix1
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
	
	Matrix1 multiply(Matrix1 x)
	{
		int i,j,k;
		if(a[1].length==x.a.length)
		{
			Matrix1 temp= new Matrix1();
			temp.a=new int[a.length][x.a[1].length];
			for(i=0;i<a.length;i++)
			for(j=0;j<x.a[i].length;j++)
			{
				temp.a[i][j]=0;
				for(k=0;k<a[1].length;k++)
					temp.a[i][j]=temp.a[i][j]+a[i][k]*x.a[k][j];
			}
			return temp;	
		}
		else
		{
			System.out.println("\n \t\t\t multiplication is not possible\n \t\t\t order mis match\n");
			return null;
		}
	}
	
}

class Multiplication
{
	
	public static void main(String args[])
	{
		Matrix1 m=null,m1,m2;
		m1=new Matrix1();
		m2=new Matrix1();
		m1.read();
		m2.read();
		m1.display();
		m2.display();
		m=m1.multiply(m2);
		System.out.println("Multiplication matrix is:");
		m.display();
		
	}
	
}