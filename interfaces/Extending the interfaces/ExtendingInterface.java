interface Counting
{
	void increment();
}

interface Morecounting extends Counting
{
	void decrement();
}

interface Show
{
	void display();
}

class Counter implements Morecounting,Show
{
	int count;
	Counter(int c)
	{
		count=c;
	}
	public void increment()
	{
		count++;
	}
	public void decrement()
	{
		count--;
	}
	public void display()
	{
		System.out.println("count= "+count);
	}
}

class Time implements Counting,Show
{
	int hour,min;
	Time(int h,int m)
	{
		hour=h;
		min=m;
	}
	public void increment()
	{
		min++;
		if(min>=60)
		{
			hour++;
			min=min%60;
		}
		if(hour>=24)
			hour=min=0;
	}

	public void display()
	{
		System.out.println("time= "+hour+":"+min);
	}
}

class ExtendingInterface
{
	public static void main(String args[])
	{
		Counter c1=new Counter(5);
		Time t1=new Time(5,58);
		c1.display();
		c1.increment();
		c1.display();
		c1.decrement();
		c1.display();
		
		t1.display();
		t1.increment();
		t1.display();
		t1.increment();
		t1.display();
				
		Counter c2=new Counter(88);
		Time t2=new Time(23,58);
		
		Show s=null;
		Counting c=null;
		Morecounting m=null;
		
		m=c2;
		s=c2;
		s.display();
		m.increment();
		s.display();
		m.decrement();
		s.display();
		
		s=t2;
		c=t2;
		s.display();
		c.increment();
		s.display();
		c.increment();
		s.display();
	}
}