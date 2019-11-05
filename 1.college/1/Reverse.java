import java.util.*;
class Reverse
{
	public static void main(String args[])
	{
		int n,rev=0,i;
        System.out.println("enter the number: ");
		Scanner a=new Scanner(System.in);
		n=a.nextInt();
		while(n!=0)
		{
			i=n%10;
			rev=10*rev+i;
			n=n/10;
		}
		System.out.println("Reverse of the number is="+rev);
	}
}
