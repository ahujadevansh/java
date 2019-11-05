package arrays;
import java.util.Scanner;
class MeanVarSdDemo
{
	Scanner sc= new Scanner(System.in);
	double a[];
	int n;
	MeanVarSdDemo()
	{
		a=new double[1];
		n=1;
	}
	void read()
	{
		int i;
		System.out.print("enter number of terms: ");
		n=sc.nextInt();
		a=new double [n];
		System.out.println("enter data one by one: ");
		for(i=0;i<a.length;i++)
			a[i]=sc.nextDouble();
	}
	double mean()
	{
		double sum=0;
		int i;
		for(i=0;i<a.length;i++)
			sum=sum+a[i];
		return sum/a.length;
	}
	double variance()
	{
		double m=mean();
		double sum=0;
		int i;
		for(i=0;i<n;i++)
			sum=sum+(a[i]-m)*(a[i]-m);
		return sum/a.length;
	}
	
	double sd()
	{
		return Math.sqrt(variance());
	}
	
}


class MeanVarSd
{
	public static void main(String args[])
	{
		MeanVarSdDemo a =new MeanVarSdDemo();
		a.read();
		System.out.println("\nMean is "+a.mean());
		System.out.println("\nVariance is "+a.variance());
		System.out.println("\nStandard Deviation id "+a.sd());
		
	}
	
}