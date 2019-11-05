import java.io.*;
class Capital
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
		//System.out.println(sb.length());
		ch=Character.toUpperCase(sb.charAt(0));
		sb.setCharAt(0,ch);
		for(int i=1;i<sb.length();i++)
		{
			if(sb.charAt(i)!=' '&&sb.charAt(i-1)==' ')
			{
				ch=Character.toUpperCase(sb.charAt(i));
				sb.setCharAt(i,ch);
			}
		}
		System.out.println("\n"+sb);
	}
}