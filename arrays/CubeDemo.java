package arrays;
class Cube 
{
	double side;
	Cube()
	{
		side=0;
	}
	Cube(double s)
	{
		side=s;
	}
	double volume()
	{
		return side*side*side;
	}
}

class CubeDemo
{
	public static void main(String args[])
	{
		Cube a[];
		a= new Cube[5];
		int i;
		for(i=0;i<5;i++)
		{
			a[i]=new Cube(i+1);
			System.out.println("side and volume of cume"+(i+1)+"is :"+a[i].volume() );
		}
		
	}
}