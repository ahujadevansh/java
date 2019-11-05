class Student
{
	String name;
	int p,c,m,roll_no;
	double percentage;
	
	double percent()
	{
		return (p+c+m)/3.0;
	}
	void printDetail()
	{
		System.out.println("Name: "+name);
		System.out.println("Roll No: "+roll_no);
		System.out.println("physics : "+p);
		System.out.println("Chemistry : "+c);
		System.out.println("maths : "+m);
		System.out.printf("percentage : %.2f",percent());
	}
	Student(String nam,int rn,int pp,int cc,int mm)
	{
		name=nam;
		roll_no=rn;
		p=pp;
		c=cc;
		m=mm;
	}
}

class StudentDemo
{
	public static void main(String args[])
	{
		Student s=new Student("dev",3,55,88,95);
		s.printDetail();
	}
}