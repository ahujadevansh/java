import java.util.Scanner;
class MergeArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[],b[],c[];
		int n;
		System.out.println("Enter no of elements 1st array: ");
		n=sc.nextInt();
		a=new int [n];
		System.out.println("enter elements: ");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		System.out.println("Enter no of elements 2st array: ");
		n=sc.nextInt();
		b=new int [n];
		System.out.println("enter elements: ");
		for(int i=0;i<b.length;i++)
			b[i]=sc.nextInt();
		
		c=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
			c[i]=a[i];
		for(int i=a.length;i<a.length+b.length;i++)
			c[i]=b[i-a.length];
		for(int i=0;i<c.length;i++)
			System.out.print(c[i]+" ");
		
	}
}