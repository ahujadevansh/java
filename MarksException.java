import java.util.Scanner;
class MarksOutOfBoundsException extends Throwable
{
	MarksOutOfBoundsException(String message)
	{
		super(message);
	}
}
class MarksException
{
	public static void main(String args[])
	{
		String name,date;
		int seatno,m1=0,m2=0,m3=0,centerno;
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter your name: ");
		name=sc.nextLine();
		System.out.print("\nEnter your seat no: ");
		seatno=sc.nextInt();
		System.out.print("\nEnter your center no: ");
		centerno=sc.nextInt();
		try
		{
			System.out.print("\nEnter your marks of SemI");
			m1=sc.nextInt();
			System.out.print("\nEnter your marks of SemII");
			m2=sc.nextInt();
			System.out.print("\nEnter your marks of SemIII");
			m3=sc.nextInt();
			if(m1<0||m1>100)
				throw new MarksOutOfBoundsException("Invalid marks of sem I");
			if(m2<0||m2>100)
				throw new MarksOutOfBoundsException("Invalid marks of sem II");
			if(m3<0||m3>100)
				throw new MarksOutOfBoundsException("Invalid marks of sem III");
		}
		catch(MarksOutOfBoundsException ad)
		{
			System.out.println(ad);
		}
		finally
		{
			System.out.print("\nyour name: "+name);
			System.out.print("\nyour seat no: "+seatno);
			System.out.print("\nyour center no: "+centerno);
			if(m1>=0&&m1<=100)
			System.out.print("\nEnter your marks of SemI: "+m1);
			if(m2>=0&&m2<=100)
			System.out.print("\nEnter your marks of SemII: "+m2);
			if(m3>=0&&m3<=100)
			System.out.print("\nEnter your marks of SemIII: "+m3);
		}
	}
}
