import java.util.*;
class SwitchDemo
{
	public static void main(String args[])
	{
		int x,y,option;
		Scanner a=new Scanner(System.in);
		System.out.println("1.logical\t2.bitwise\3.relational");
		System.out.println("enter the option: ");
		option=a.nextInt();
		switch (option)
		{
			case 1:
			{
				boolean xx,yy;
				System.out.println("enter two boolean value");
				xx=a.nextBoolean();
				yy=a.nextBoolean();
				System.out.println(xx+"&"+yy+"="+(xx&yy));
				System.out.println(xx+"|"+yy+"="+(xx|yy));
			}break;
			case 2:
			{
				System.out.println("enter two number");
				x=a.nextInt();
				y=a.nextInt();
				System.out.println("right shift of "+x+"by one bit="+(x>>>1));
				System.out.println("left shift of "+y+"by one bit="+(y<<1));
			}break;
			case 3:
			{
				System.out.println("enter two numbers");
				x=a.nextInt();
				y=a.nextInt();
				if(x>y)	System.out.println(x+" is greeater than "+y);
				else if(y>x) System.out.println(y+" is greeater than "+x);
				else 	System.out.println(x+"and"+y+"are equal");
			}break;
		}

	}
}