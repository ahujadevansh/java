interface Show
{
	void display();
}

class Date implements Show
{
	int dd,mm,yy;
	Date(int d,int m,int y)
	{
		dd=d;
		mm=m;
		yy=y;
	}
	public void display()
	{
		System.out.println("date: "+dd+" /"+mm+" /"+yy);
	}
}

class Time implements Show
{
	int h,m,s;
	Time(int hh,int mm,int ss)
	{
		h=hh;
		m=mm;
		s=ss;
	}
	public void display()
	{
		System.out.println("Time: "+h+":"+m+":"+s);
	}
}

class Identity implements Show
{
	String name;
	Identity(String n)
	{
		name=n;
	}
	public void display()
	{
		System.out.println("Name: "+name);
	}
}

class NDTDemo
{
	public static void main(String args[])
	{
		Date a=new Date(24,9,2018);
		Time b=new Time(17,55,50);
		Identity c= new Identity("dev");
		Show ref=null;
		for(int i=1;i<=3;i++)
		{
			switch(i)
			{
				case 1:ref=a;break;
				case 2:ref=b;break;
				case 3:ref=c;break;
			}
			ref.display();
		}
		
	}
}