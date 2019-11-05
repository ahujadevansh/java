import java.util.*;
class Distance
{
	double m,cm;
	Scanner sc= new Scanner(System.in);
	Distance()
	{
		m=1;
		cm=1;
	}
	Distance(double mm,double cc)
	{
		m=mm;
		cm=cc;
	}
	Distance(Distance ob)
	{
		m=ob.m;
		cm=ob.cm;
	}
	void getDistance()
	{
		System.out.print("enter metres: ");
		m=sc.nextDouble();
		System.out.print("enter centimetres: ");
		cm=sc.nextDouble();
	}
	void display()
	{
		System.out.println("distance= "+m+" m " + cm+ "cm");
	}
	void add(Distance a,Distance b)
	{
		m=a.m+b.m;
		cm=a.cm+b.cm;
	}
	
}

class DistanceDemo
{
	public static void main(String args[])
	{
		Distance d1 = new Distance();
		Distance d2 = new Distance(6,4);
		Distance d3 = new Distance();
		d1.getDistance();
		d1.display();
		d2.display();
		d3.add(d1,d2);
		d3.display();	
	}
}