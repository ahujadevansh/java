import java.util.*;
class Triangle
{
	double a,b,c;
	Scanner sc = new Scanner(System.in);
	
	Triangle(double aa,double bb, double cc)
	{
		a=aa;
		b=bb;
		c=cc;
	}
	void getSide()
	{
		System.out.print("enter sides : ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a+b<c||b+c<a||a+c<b)
		{
			System.out.println("Given sides doesnot form a triangle");
			a=b=c=1;
		}
	}
	
	
}