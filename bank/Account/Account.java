import java.util.*;
class AccountDemo
{
	int acc_no;
	String name,type_of_acc;
	float balance,temp;
	Scanner ad=new Scanner(System.in);
	void getDetails()
	{
		System.out.print("\nEnter your name: ");
		name=ad.nextLine();
		System.out.print("\nEnter your account number: ");
		acc_no=ad.nextInt();
		System.out.print("\nEnter your account type: ");
		type_of_acc=ad.next();
		System.out.print("\nEnter your balance:");
		balance=ad.nextFloat();
	}
	void depositBal()
	{
		System.out.println("\nyour current balance is Rs."+balance);
		System.out.print("\nEnter amount to be deposit:");
		temp=ad.nextFloat();
		balance=balance+temp;
		System.out.println("\nRs."+temp+" is succesfully deposit");
		System.out.println("\nyour current balance is Rs."+balance);
	}
	void withdrawBal()
	{
		System.out.println("\nyour current balance is Rs."+balance);

		System.out.print("\nEnter amount to be withdraw:");
		temp=ad.nextFloat();
		if(temp>balance)
			System.out.println("\nyour account balance is less than "+temp);
		else
		{
			balance=balance-temp;
			System.out.println("\nRs."+temp+" is succesfully debited");
			System.out.println("\nyour current balance is Rs."+balance);
		}
	}
	void displayDetails()
	{
		System.out.println("\nname: "+name);
		System.out.println("\naccount numbere: "+acc_no);
		System.out.println("\nyour current balance is Rs."+balance);
	}

}

class Account
{
	public static void main(String arg[])
	{
		AccountDemo ac=new AccountDemo();
		ac.getDetails();
		ac.depositBal();
		ac.withdrawBal();
		ac.displayDetails();
	}
}