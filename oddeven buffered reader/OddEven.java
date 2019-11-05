import java.io.*;
class OddEven
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		double n;
		System.out.println("enter a number: ");
		n=Integer.parseInt(br.readLine());
		if(n%2==0)
			System.out.println(n+" is even");
		else
			System.out.println(n+" is odd");
	}
}