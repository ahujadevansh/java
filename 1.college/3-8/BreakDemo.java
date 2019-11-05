import java.util.*;
class BreakDemo
{
	public static void main(String args[])
	{
		First:
		for(int i=1;i<=5;i++)
		{	Second:
			for(int j=1;j<3;j++)
			{
				System.out.println("i="+i+"\tj="+j);
				if(i==2)
				break First;
			
			}
		
		}
	}
}