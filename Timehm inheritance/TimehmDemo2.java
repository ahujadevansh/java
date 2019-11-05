class Timehm2
{
	int min ,hour;
	
	Timehm2()
	{
		hour=1;
		min=1;
	}
	Timehm2(int h, int m)
	{
		hour=h;
		min=m;
	}
	Timehm2(int x)
	{
		hour=x;
		min=x;
	}
	Timehm2(Timehm2 ob)
	{
		hour=ob.hour;
		min=ob.min;
	}
	void display()
	{
		System.out.println("time: "+hour+ " Hrs " +min+ " mins");
	}
}

class Timehms2 extends Timehm2
{
	int sec;
	void display()
	{
		System.out.println("time: "+hour+ " Hrs " +min+ " mins " +sec+ " seconds ");
	}
	Timehms2()
	{
		super();
		sec=1;
	}
	Timehms2(int h,int m,int s)
	{
		super(h,s);
		sec=s;
	}
	Timehms2(int x)
	{
		super(x);
		sec=x;
	}
	Timehms2(int m,int s)
	{
		min=m;
		sec=s;
	}
	Timehms2(Timehms2 ob)
	{
		super(ob);
		sec=ob.sec;
	}
	
}
class Timehmsms2 extends Timehms2
{
	int ms;
	void display()
	{
		System.out.println("time: "+hour+ " Hrs " +min+ " mins " +sec+ " seconds "+ms+ " ms");
	}
	Timehmsms2()
	{
		super();
		ms=1;
	}
	Timehmsms2(int h,int m,int s,int mss)
	{
		super(h,m,s);
		ms=mss;
	}
	Timehmsms2(int x)
	{
		super(x);
		ms=x;
	}
	Timehmsms2(Timehmsms2 ob)
	{
		super(ob);
		ms=ob.ms;
	}
}


class TimehmDemo2
{
	public static void main(String args[])
	{
		Timehm2 t1 =new Timehm2();
		Timehm2 t2 =new Timehm2(5,4);
		Timehm2 t3 =new Timehm2(8);
		Timehms2 t4 =new Timehms2();
		Timehms2 t5 =new Timehms2(4,7,9);
		Timehms2 t6 =new Timehms2(7);
		Timehmsms2 t7 =new Timehmsms2();
		Timehmsms2 t8 =new Timehmsms2(4,3,8,45);
		Timehmsms2 t9 =new Timehmsms2(8);
		Timehmsms2 t10 =new Timehmsms2(t7);
		
		
		t1.display();
		t2.display();
		t3.display();
		t4.display();
		t5.display();
		t6.display();
		t7.display();
		t8.display();
		t9.display();
		t10.display();
	}	
	
}