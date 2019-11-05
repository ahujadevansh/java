class Marks
{
	public static void main(String args [])
	{
		int marks;
		marks=Integer.parseInt(args[0]);
		
		switch(marks/10)
		{
			case 1:
			case 2:
			case 3:System.out.println("failed");break;
			case 4:System.out.println("pass class");break;
			case 5:System.out.println("second class");break;
			case 6:System.out.println("First class");break;
			case 8:
			case 9:
			case 10:
			case 7:System.out.println("distinction");break;
		}
	}
}