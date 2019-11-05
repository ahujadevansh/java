import java.io.*;
class Counter
{
	BufferedReader br = new BufferedReader(new IxnputStreamReader(System.in));
	int count;
	Counter()
	{
		count=0;
	}
	Counter(int c)
	{
		count=c;
	}
	Counter(Counter ob)
	{
		count = ob.count;
	}
	void getCount() throws IOException
	{
		System.out.println("enter count: ");
		count= Integer.parseInt(br.readLine());
	}
	void display()
	{
		System.out.println("Count="+count);
	}
	void increment()
	{
		count++;
	}
	void decrement()
	{
		count--;
	}
}

class CounterDemo
{
	public static void main(String args[]) throws IOException
	{
		Counter c1,c2;
		c1=new Counter();
		c2=new Counter(4);
		
		c2.display();
		c2.decrement();
		c2.display();
		c2.increment();
		c2.display();
		
		c1.getCount();
		c1.display();
		c1.decrement();
		c1.display();
		c1.increment();
		c1.display();
	}
}