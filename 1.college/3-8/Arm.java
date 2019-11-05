import java.util.*;
class Arm
{
	public static void main(String args[])
	{
		int x,y,z,w,i;
		System.out.println("FOLLOWING ARE THE ARMSTRONG NUMBER: ");
		for(i=100;i<=999;i++)
		{
			x=i/100;
			w=i%100;
			y=w/10;
			z=w%10;
		  if(x*x*x+y*y*y+z*z*z==i)
			System.out.println(i);
		}
	}
}