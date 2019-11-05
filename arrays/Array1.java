package arrays;
class Array1
{
	public static void main(String args[])
	{
		int a[][];
		a= new int [10][];
		int i,j;
		
		for(i=0;i<a.length;i++)
		{
			a[i]=new int[i+1];
			for(j=0;j<a[i].length;j++)
				a[i][j]=(i+1)*(j+1);
		}
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			System.out.print(a[i][j]+" ");
			System.out.println();		
		}
	}
}