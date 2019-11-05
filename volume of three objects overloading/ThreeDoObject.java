class VolumeDemo
{
	static final double PI=3.1415;
	static double volume(double r)
	{
		return (4.0/3)*PI*r*r*r;
	}
	static double volume(double r,double h)
	{
		return PI*r*r*h;
	}
	static double volume(double r1,double r2, double h)
	{
		return (1/3.0)*PI*(r1*r1+r1*r2+r2*r2)*h;
	}
}

class ThreeDoObject
{
	public static void main(String args[])
	{
		System.out.println("volume of sphere: "+VolumeDemo.volume(5));
		System.out.println("volume of Cylinder: "+VolumeDemo.volume(5,4));
		System.out.println("volume of Bucket: "+VolumeDemo.volume(5,5,4));
	}
}