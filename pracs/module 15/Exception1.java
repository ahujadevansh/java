import java.io.*;
class Exception1
{
	public static void main(String args[]) throws IOException
	{
		int x=5,y=4;
		try
		{
			System.out.println(x/y);
			throw new NullPointerException();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println((x+y));
		}
	}
	
}