class Max3
{
	public static void main(String args[])
	{
		int x,y,z,maxx;
		x=Integer.parseInt(args[0]);
		y=Integer.parseInt(args[1]);
		z=Integer.parseInt(args[2]);
		
		maxx=(x>y&&x>z)?x:(y>z)?y:z;
		
		System.out.println("max of "+x+" "+y+" "+z+" is "+maxx);
		
	}
}