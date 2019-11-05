import java.util.Scanner;
class Operators
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int op1,op2,x,y;
		boolean b1,b2;
		
		System.out.println("1.Bitwise\t\t2.Logical\t\t3.Relational");
		op1=sc.nextInt();
		switch(op1)
		{
			case 1:{
					System.out.println("1.left shift\t\t2.right shift\t\t3.and\t\t4.or\n");
					System.out.print("Enter Your option:");
					op2=sc.nextInt();
					switch(op2)
					{
						case 1:	System.out.print("Enter number:");
								x=sc.nextInt();
								System.out.println("answer is "+(x<<1));
								break;
						case 2:	System.out.print("Enter number:");
								x=sc.nextInt();
								System.out.println("answer is "+(x>>1));
								break;
						case 3:	System.out.print("Enter numbers:");
								x=sc.nextInt();
								y=sc.nextInt();
								System.out.println("answer is "+(x&y));
								break;
						case 4:	System.out.print("Enter number:");
								x=sc.nextInt();
								y=sc.nextInt();
								System.out.println("answer is "+(x|y));	
								break;
					}
				   }break;
			case 2:{
					System.out.println("1.AND\t\t2.OR\t\t3.NOT");
					System.out.print("Enter Your option:");
					op2=sc.nextInt();
					switch(op2)
					{
						case 1:	System.out.print("Enter values:");
								b1=sc.nextBoolean();
								b2=sc.nextBoolean();
								System.out.println("answer is "+(b1&&b2));
								break;
						case 2:	System.out.print("Enter values");
								b1=sc.nextBoolean();
								b2=sc.nextBoolean();
								System.out.println("answer is "+(b1||b2));
								break;
						case 3:	System.out.print("Enter value");
								b1=sc.nextBoolean();
								System.out.println("answer is "+!b1);
								break;
				   }
				  }break;
			case 3:{
					System.out.print("Enter two number:");
							x=sc.nextInt();
							y=sc.nextInt();
							if(x>y)
								System.out.println(x+"is greater than "+y);	
								else if(x<y)
									System.out.println(x+"is less than "+y);	
									else
										System.out.println(x+","+y+" are equal");	
							
				   }break;
			default :System.out.println("invalid option");
		}
		
	}
}