import java.util.*;
class Roots
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		double a,b,c,d;
		System.out.print("enter coefficients of quadratic equations(ax²+bx+c=0): ");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		
		d=b*b-4*a*c;
		if(a==0&&b==0)
		{
			System.out.println("incorrect equation");
		}
		else 
			if(a==0)
				{
					System.out.println("this is linear equation with root: "+-b/c);
				}			
			else 
				if(d==0)
				{
					System.out.println("roots are real & equal: "+-b/2*a);
				}
				else
					if(d>0)
					{
						d=Math.sqrt(d);
						double root1=(-b+d)/(2*a);
						double root2=(-b-d)/(2*a);
						System.out.println("roots are real & unequal: ");
						System.out.println("root 1= "+root1);
						System.out.println("root 2= "+root2);
					}
					else
					{
						d=Math.sqrt(-d);
						double root1=-b/(2*a);
						double root2=d/(2*a);
						System.out.println("roots are not real");
						System.out.println("root 1= "+root1+"+ i*("+root2+")");
						System.out.println("root 2= "+root1+"- i*("+root2+")");
					}
	}
}