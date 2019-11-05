import java.io.*;
class Student
{
	String name,college;
	int roll_no,marks;
	long contact_no;
	BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
	
	Student()
	{
		name="student 1";
		roll_no=-1;
	}
	Student(String n,String c,int r)
	{
		name=n;
		college=c;
		roll_no=r;
	}
	
	void getDetails()throws IOException
	{
		System.out.print("\n Enter your name: ");
		name = br.readLine();
		 System.out.print("\n Enter your College");
		 college =br.readLine();
		 System.out.print("\n Enter your Roll no: ");
		 roll_no=Integer.parseInt(br.readLine());
		 System.out.print("\n Enter your contact no: ");
		 contact_no=Long.parseLong(br.readLine());
		 System.out.print("\n Enter your marks: ");
		 marks =Integer.parseInt(br.readLine());
	}
	
	void printDetails()
	{
		System.out.println("\n your name: "+name);
		System.out.println("\n your college: "+college);
		System.out.println("\n your Roll No: "+roll_no);
		System.out.println("\n your contact no: "+contact_no);
		System.out.println("\n your marks"+marks);
	}
	
}

class StudentDemo
{
	public static void main(String args[]) throws IOException
	{
		Student s1=new Student();
		Student s2=new Student("dev","xxx",03);
		Student s3=new Student();
		s3.getDetails();
		s1.printDetails();
		s2.printDetails();
		s3.printDetails();
	}
}