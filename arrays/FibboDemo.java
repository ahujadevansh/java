package arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Fibbo
{
	BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
	int a[],n;
	Fibbo()
	{
		a=new int[2];
		n=2;
		a[0]=0;
		a[1]=1;
	}
	
	void Read() throws IOException
	{
		int i;
		System.out.print("enter number of terms :");
		n= Integer.parseInt(br.readLine() );
		a=new int[n];
		calculate();
	}
	
	void display()
	{
		int i;
		System.out.println("folling are the "+n+ "terms of fibbonacii : ");
		for (i=0;i<n;i++)
			System.out.print(a[i]+"  ");
	}
	
	void calculate()
	{
		int i;
		a[0]=0;
		a[1]=1;
		for(i=2;i<a.length;i++)
			a[i]=a[i-1]+a[i-2];
	}
	
}


class FibboDemo
{
	public static void main (String args[])throws IOException
	{
		Fibbo f =new Fibbo();
		f.Read();
		f.calculate();
		f.display();
	}
}