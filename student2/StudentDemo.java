import java.io.*;
class Student
{
	String name,college;
	int roll_no,marks;
	long contact;
	Student()
	{
		name="";
		roll_no=-1;
		college="";
		contact=0;
		marks=0;
	}
	Student(String n,String c)
	{
		name=n;
		college=c;
	}
	Student(String n,int m)
	{
		name=n;
		roll_no=m;
	}
	void getDetails() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter name: ");
		name=br.readLine();
		System.out.print("enter roll no: ");
		roll_no=Integer.parseInt(br.readLine());
		System.out.print("enter college name: ");
		college=br.readLine();
		System.out.print("enter contact number: ");
		contact=Long.parseLong(br.readLine());
		System.out.print("enter your marks: ");
		marks=Integer.parseInt(br.readLine());
	}
	
	void printDetails()
	{
		System.out.println("name: "+name);
		System.out.println("Roll no: "+roll_no);
		System.out.println("college : "+college);
		System.out.println("contact no: "+contact);
		System.out.println("marks : "+marks);
	}
}

class StudentDemo
{
	public static void main(String args[]) throws IOException
	{
		Student s1,s2,s3,s4;
		s1=new Student();
		s2=new Student("dev","vesit");
		s3=new Student("dev",03);
		s4=new Student();
		s4.getDetails();
		s1.printDetails();
		s2.printDetails();
		s3.printDetails();
		s4.printDetails();
	}
}
