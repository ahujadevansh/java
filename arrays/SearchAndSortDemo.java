package arrays;
import java.io.*;
class SearchAndSort
{
	BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
	
	int a[];
	int n;
	
	SearchAndSort()
	{
		a=new int[1];
		n=1;
	}
	void read() throws IOException
	{
		System.out.print("enter size of array: ");
		n= Integer.parseInt(br.readLine());
		a=new int[n];
		System.out.println("enter array elementsone by one:");
		int i;
		for(i=0;i<a.length;i++)
		{
			a[i]=Integer.parseInt(br.readLine() );
		}
	}
	
	void display()
	{
		int i;
		System.out.println("array elements are: ");
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ "  ");
		}
		System.out.println();
	}
	
	int Search() throws IOException
	{
		int x, i=0,flag=0;
		System.out.print("enter element to be searched: ");
		x= Integer.parseInt(br.readLine() );
		for(i=0;i<a.length;i++)
		{
			if(a[i]==x)
			{
				flag=1;
				break;
			}
		}
		
		if(flag==1)
			System.out.println(x+" is present in at "+i);
		else
			System.out.println(x+" is not present");
		
		return i;
	}
	
	void sort()
	{
		int i,j;
		for(i=0;i<a.length-1;i++)
		for(j=0;j<a.length-1-i;j++)
		{
			if(a[j]>a[j+1])
			{
				int temp;
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	
}

class SearchAndSortDemo
{
	public static void main( String args[] ) throws IOException
	{
		SearchAndSort a1=new SearchAndSort();
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in) );
		int option;
		do
		{
			System.out.println("1.read\n2.display\n3.search\n4.sort\n5.exit\n");
			option =Integer.parseInt(br.readLine());
			switch(option)
			{
				case 1:a1.read();break;
				case 2:a1.display();break;
				case 3:a1.Search();break;
				case 4:a1.sort();break;
				default: option=5;break;
			}
		}
		while(option!=5);
	}
	
}