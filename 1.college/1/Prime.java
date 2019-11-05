import java.util.*;

class Prime
{
	public static void main(String args[])
	{
		
		int n,flag=1,i;
		Scanner ad=new Scanner(System.in);
		System.out.println("enter number : ");
		n=ad.nextInt();
		if(n==1)
            flag=0;
        else
            for(i=2;i<n;i++)
                if(n%i==0)
                {
                    flag=0;
                    break;
                }
        if(flag==1)
            System.out.println(n+" is a prime number");
        else
            System.out.println(n+" is not a prime number");       
	}
}
