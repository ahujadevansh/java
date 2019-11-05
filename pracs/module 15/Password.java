import java.util.Scanner;
class PasswordException extends Exception
{
	PasswordException(String message)
	{
		super(message);
	}
}

class Password
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String susername="vesit";
		String spassword="Nikita";
		String username="";
		String password="";
		System.out.println("Enter Username: ");
		username=sc.next();
		try
		{
			for(int i=1;i<=3;i++)
			{
				System.out.println("Enter password: ");
				password=sc.next();
				if(i==3&&(!(password.equals(spassword))))
					throw new PasswordException("limit exeded try again later");
				else
					if(!(password.equals(spassword)))
						System.out.println("\n wrong password ");
					else
					{
						System.out.println("password matched");
						break;
					}
			}
		}
		catch(PasswordException e)
		{
			System.out.println(e);
		}
		
			
	}
}