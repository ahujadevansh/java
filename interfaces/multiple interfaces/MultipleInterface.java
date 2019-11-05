interface Show
{
	void display();
}

interface Calculations
{
	double PI=3.14159;
	double surfacearea();
	double volume();
}
class Cylinder implements Show,Calculations
{
	double r,h;
	Cylinder(double rr,double hh)
	{
		r=rr;
		h=hh;
	}
	public double surfacearea()
	{
		return 2*PI*r*h;
	}
	public double volume()
	{
		return PI*r*r*h;
	}
	public void display()
	{
		System.out.println("Cylinder");
		System.out.println("Radius: "+r);
		System.out.println("Height:"+h);
	}
}

class Sphere implements Show,Calculations
{
	double r;
	Sphere(double rr)
	{
		r=rr;
	}
	public double surfacearea()
	{
		return 4*PI*r*r;
	}
	public double volume()
	{
		return (4.0/3)*PI*r*r*r;
	}
	public void display()
	{
		System.out.println("Sphere");
		System.out.println("Radius: "+r);
	}
}
	
class Cone implements Show,Calculations
{
	double r,h;
	Cone(double rr,double hh)
	{
		r=rr;
		h=hh;
	}
	public double surfacearea()
	{
		return PI*r*r+PI*r*Math.sqrt(r*r+h*h);
	}
	public double volume()
	{
		return (1.0/3)*PI*r*r*h;
	}
	public void display()
	{
		System.out.println("Cone");
		System.out.println("Radius: "+r);
		System.out.println("Height:"+h);
	}
}


class MultipleInterface
{
	public static void main (String args[])
	{
		int option,i;
		Show ref1=null;
		Calculations ref2=null;
		for(i=1;i<=3;i++)
		{
			switch(i)
			{
				case 1:	Cylinder c1=new Cylinder(4,5);
						ref1=c1;
						ref2=c1;
						break;
				case 2:	Sphere c2=new Sphere(8);
						ref1=c2;
						ref2=c2;
						break;
				case 3:	Cone c3=new Cone(5,7);
						ref1=c3;
						ref2=c3;
						break;
						
			}
			ref1.display();
			System.out.println("Surface area : "+ref2.surfacearea());
			System.out.println("Volume: "+ref2.volume());
		}
	}
}