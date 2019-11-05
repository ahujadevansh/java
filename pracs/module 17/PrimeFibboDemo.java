import java.util.*;
class Prime extends Thread
{
	long time;
	boolean checkPrime(int n)
	{
		for(int i=2;i<n;i++)
			if(n%i==0)
				return false;
		return true;
	}
	
	public void run()
	{
		Date d1=new Date();
		int count=0;
		for(int i=2;count<=20;i++)
			if(checkPrime(i))
			{
				System.out.print("\t"+i+"\t");
				count++;
				try
				{
					sleep(100);
				}
				catch(InterruptedException e)
				{}
			}
		Date d2 = new Date();
		time=d2.getTime()-d1.getTime();
	}
	
}

class Fibbo extends Thread
{
	long time;
	public void run()
	{
		Date d1=new Date();
		try
		{
			int f=0,s=1,t;
			System.out.println("\t"+f);
			sleep(100);
			System.out.println("\t"+s);
			sleep(100);
			for(int i=3;i<=20;i++)
			{
				t=f+s;
				f=s;
				s=t;
				if(i<=15)
					System.out.println("\t"+t);
				else
					System.out.println();
				sleep(100);
			}
		}
		catch(InterruptedException e)
		{}
		Date d2 = new Date();
		time=d2.getTime()-d1.getTime();
	}
}
class PrimeFibboDemo
{
	public static void main(String args[]) throws InterruptedException
	{
		Prime p=new Prime();
		Fibbo f=new Fibbo();
		p.start();
		Thread.sleep(20);
		f.start();
		p.join();
		f.join();
		System.out.println(p.time+"\n"+f.time);
		
	}
}