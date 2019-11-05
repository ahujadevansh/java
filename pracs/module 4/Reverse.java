import java.io.*;
class Reverse
{
	public static void main(String args[]) throws IOException
	{
		String str;
		StringBuffer sb;
		char ch;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter string: ");
		str=br.readLine();
		sb=new StringBuffer(str);
		for(int i=0;i<str.length()/2;i++)
		{
				ch=str.charAt(i);
				sb.setCharAt(i,str.charAt(str.length()-1-i));
				sb.setCharAt(str.length()-1-i,ch);
		}
		System.out.println("\n"+sb);
		String s=new String(sb);
		if(str.equals(s))
			System.out.println("true\n");
	}
}