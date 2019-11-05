package arrays;

import java.util.Scanner;
class Matrix1
{
	Scanner sc = new Scanner(System.in);
	int a[][];
	Matrix1()
	{
		a=new int[2][2];
		a[1][1]=1;
	}
	void readMat()
	{
		int m,n,i,j;
		System.out.print("enter rows and column of matrix: ");
		m=sc.nextInt();
		n=sc.nextInt();
		a=new int[m][n];
		System.out.print("enter elements of matrix one by one: ");
		for(i=0;i<m;i++)
		for(j=0;j<n;j++)
			a[i][j]=sc.nextInt();
	}
	void printMat()
	{
		int i,j;
		System.out.println("matrix: ");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}	
	}
	Matrix1 add(Matrix1 x)
	{
		int i,j;
		if(a.length==x.a.length&&a[1].length==x.a[1].length)
		{
			Matrix1 temp= new Matrix1() ;
			temp.a=new int[a.length][a[1].length];
			for(i=0;i<a.length;i++)
			for(j=0;j<a[i].length;j++)
				temp.a[i][j]=a[i][j]+x.a[i][j];
			return temp;	
		}
		else
		{
			System.out.println("\n \t\t\t Addition is not possible\n \t\t\t order mis match\n");
			return null;
		}
	}
	
	Matrix1 subtract(Matrix1 x)
	{
		int i,j;
		if(a.length==x.a.length&&a[1].length==x.a[1].length)
		{
			Matrix1 temp= new Matrix1();
			temp.a=new int[a.length][a[1].length];
			for(i=0;i<a.length;i++)
			for(j=0;j<a[i].length;j++)
				temp.a[i][j]=a[i][j]-x.a[i][j];
			return temp;	
		}
		else
		{
			System.out.println("\n \t\t\t subtraction is not possible\n \t\t\t order mis match\n");
			return null;
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

class MatrixDemo1
{
	public static void main(String args[])
	{
		Matrix1 m1,m2,m3;
		m1=new Matrix1();
		m2=new Matrix1();
		Scanner sc = new Scanner(System.in);
		
		int option;

		do
		{
			System.out.println("1.Add\n2.subtract\n3.Multiply\n4.Exit\n");
			System.out.println("Enter your option:");
			option=sc.nextInt();
			switch(option)
			{
				case 1: m1.readMat();
						m2.readMat();
						m3=m1.add(m2);
						m3.printMat();	
						break;
						
				case 2: m1.readMat();
						m2.readMat();
						m3=m1.subtract(m2);
						m3.printMat();	
						break;
						
				case 3: m1.readMat();
						m2.readMat();
						m3=m1.multiply(m2);
						m3.printMat();	
						break;
				default:option=4;break;
			}
			
		}while(option!=4);
		
	}
}
