import java.util.*;
class Rootsofquad
{
	public static void main(String args[])
	{
	  double a,b,c,d,i,j,k,m;
	 Scanner n=new Scanner(System.in);
     System.out.println("enter the coeficients of quadratic equation: ");
	 a=n.nextDouble();
	 b=n.nextDouble();
	 c=n.nextDouble();
	 if(a==0)
	 {
		 if(b==0)
			 System.out.println("Invalid data");
		 else System.out.println("Root is "+(-c/b));
	 }
	 else {
		   d=b*b-4*a*c;
		   if(d==0)
		   {
			   i=-b/2*a;
			   System.out.println(i);
		   }
		   else if(d>0)
		   {
			   d=Math.sqrt(d);
			   i=((-b/2*a)+(d/2*a));
			   j=((-b/2*a)-(d/2*a));
			   System.out.println("Roots Are Real And Unequal");
			   System.out.println("Roots are "+i+" "+j);
		   }
		   else {d=Math.sqrt(-d);
		   i=(-b/2*a);
		   j=(d/2*a);
		   k=(-b/2*a);
		   m=(d/2*a);
		       System.out.println("Roots Are Imagionary");
			   System.out.println("Roots are "+i+"+i"+j+" "+k+"-i"+m);
		         }
		  }
		  
		  
	}
	 
}
