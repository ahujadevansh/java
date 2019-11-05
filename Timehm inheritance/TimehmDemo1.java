class Timehm1
{
	int min ,hour;
	
	Timehm1()
	{
		hour=0;
		min=1;
	}
	Timehm1(int h, int m)
	{
		hour=h;
		min=m;
	}
	Timehm1(int x)
	{
		hour=x;
		min=x;
	}
	Timehm1(Timehm1 ob)
	{
		hour=ob.hour;
		min=ob.min;
	}
	void display()
	{
		System.out.println("time: "+hour+ " Hrs " +min+ " mins");
	}
}

class Timehms1 extends Timehm1
{
	int sec;
	void display()
	{
		System.out.println("time: "+hour+ " Hrs " +min+ " mins " +sec+ " seconds ");
	}
	Timehms1()
	{
		super();
		sec=1;
	}
	Timehms1(int h,int m,int s)
	{
		super(h,m);
		sec=s;
	}
	Timehms1(int x)
	{
		super(x);
		sec=x;
	}
	Timehms1(int m,int s)
	{
		min=m;
		sec=s;
	}
	Timehms1(Timehms1 ob)
	{
		super(ob);
		sec=ob.sec;
	}
	
}

class TimehmDemo1
{
	public static void main(String args[])
	{
		Timehm1 t1 =new Timehm1();
		Timehm1 t2 =new Timehm1(5,4);
		Timehm1 t3 =new Timehm1(8);
		Timehms1 t4 =new Timehms1();
		Timehms1 t5 =new Timehms1(4,7,9);
		Timehms1 t6 =new Timehms1(7);
		
		t1.display();
		t2.display();
		t3.display();
		t4.display();
		t5.display();
		t6.display();
	}	
	
}