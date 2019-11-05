package arrays;
import java.util.Scanner;
class Matrix2
{
	Scanner sc= new Scanner(System.in);
	int a[][];
	int n;
	void readMat()
	{
		System.out.print("enter order of Square matrix :");
		n=sc.nextInt();
		a=new int[n][n];
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
	Matrix2 transpose()
	{
		Matrix2 temp=new Matrix2();
		int temp1,i,j;
		temp.a=new int[a.length][a.length];
		for(i=0;i<a.length;i++)
		for(j=0;j<a[i].length;j++)
		{
			temp.a[i][j]=a[j][i];
		}
		return temp;
	}
	void checkSymmetric()
	{
		int i,j,flag=1;
		for (i=0;i<a.length;i++)
		{
			for (j=0;j<a[i].length;j++)
				if(a[i][j]!=a[j][i])
				{
					flag=0;
					break;
				}
			if (flag==0)
				break;
		}
		if(flag==1)
		{
			System.out.println("matrix is symmtric");
		}
		else
			System.out.println("matrix is not symmtric");
			
	}
	
}

class SymmetricDemo
{
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		Matrix2 m=null;
		int option;
		do
		{
			System.out.println("1.transpose\n2.check Symmtric\n3.exit\n");
			option= sc.nextInt();
			switch(option)
			{
				case 1:	m=new Matrix2();
						m.readMat();
						Matrix2 m2;
						m2=m.transpose();
						m2.display();
						break;
				case 2:	m=new Matrix2();
						m.readMat();
						m.checkSymmetric();
						break;
				default: option=3;break;
			}
		}
		while(option!=3);
	}
	
}