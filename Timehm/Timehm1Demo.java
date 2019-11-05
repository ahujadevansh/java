import java.util.*;
class Timehm
{
	Scanner sc = new Scanner (System.in);
	int hour,min;
	Timehm()
	{
		hour=0;
		min=0;
	}
	Timehm(int hour,int min)
	{
		this.hour=hour;
		this.min=min;
	}
	Timehm(int hour)
	{
		this.hour=hour;
	}
	Timehm(Timehm ob)
	{
		hour=ob.hour;
		min=ob.min;
	}
	void display()
	{
		System.out.println("\ntime= "+hour+ " : " +min);
	}
	void setTime()
	{
		System.out.print("\n Enter hour: ");
		hour= sc.nextInt();
		System.out.print("\n Enter minutes: ");
		min= sc.nextInt();
	}
	void add(Timehm ob1,Timehm ob2)
	{
		hour= ob1.hour+ob2.hour;
		min=  ob1.min+ob2.min;
	}
}

class Timehm1Demo
{
	public static void main(String args[])
	{
		Timehm t1=new Timehm();
		Timehm t2=new Timehm(5,55);
		Timehm t3=new Timehm(7);
		Timehm t4=new Timehm(t2);
		t1.display();
		t2.display();
		t3.display();
		t4.display();
		t1.setTime();
		t4.add(t2,t1);
		t4.display();
	}
}