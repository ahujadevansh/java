class Table5 extends Thread
{
	int n;
	Table5(int n)
	{
		this.n=n;
	}
	
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(n+" * "+i+" = "+(n*i)+"\t\t");
			try
			{
				sleep(100);
			}
			catch(InterruptedException e)
			{}
		}
	}
}

class Table7 implements Runnable
{
	int n;
	Table7(int n)
	{
		this.n=n;
	}
	
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(n+" * "+i+" = "+(n*i)+"\t\t");
			try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException e)
			{}
		}
	}

}

class Table13 implements Runnable
{
	int n;
	Table13(int n)
	{
		Thread t=new Thread(this);
		this.n=n;
		t.start();
	}
	
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+" * "+i+" = "+(n*i));
			try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException e)
			{}
		}
	}

}




class Table
{
	public static void main(String args[])throws InterruptedException
	{
		Table5 t1=new Table5(5);
		Table7 t2=new Table7(7);
		
		
		Thread th1=new Thread(t2);
		t1.start();
		Thread.sleep(20);
		th1.start();
		Thread.sleep(20);
		Table13 t3=new Table13(13);
		
	}
}