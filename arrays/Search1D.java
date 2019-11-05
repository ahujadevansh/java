import java.util.Scanner;
class Search1dDemo
{
	Scanner sc = new Scanner(System.in);
	int a[];
	 void read()
	 {
		int n,i;
		System.out.print("enter number of elements: ");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("enter elements one by one: ");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
	}
	
	 void print()
	{
		int i;
		System.out.println();
		System.out.println("Elements are: ");
		for(i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
	
	 int search(int key)
	{
		int i,flag=-1;
		for(i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{	
				flag=i;
				break;
			}
		}
		return flag;
	}
	 Search1dDemo merge(Search1dDemo x)
	{
		int i;
		Search1dDemo temp=new Search1dDemo();
		temp.a=new int[a.length+x.a.length];
		for(i=0;i<a.length;i++)
		{
			temp.a[i]=a[i];
		}
		for(i=a.length;i<a.length+x.a.length;i++)
		{
			temp.a[i]=x.a[i-a.length];
		}
		return temp;
	}

}

class Search1D
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Search1dDemo s1=new Search1dDemo();
		Search1dDemo s2=new Search1dDemo();
		Search1dDemo s3;
		s1.read();
		s2.read();
		s1.print();
		s2.print();
		s3=s1.merge(s2);
		System.out.println("merged array: ");
		s3.print();
		System.out.println("\nenter Element to be searched: ");
		int key;
		key=sc.nextInt();
		key=s3.search(key);
		if(key==-1)
		System.out.println("enter element is not present");
		else
		System.out.println("enter element is present at "+key);
	}
	
}