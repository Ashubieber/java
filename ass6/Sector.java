class Sector 
{
	 static void sector(int r, int ti) 
	{
		 double result=(0.5 * r * r * ti);
		System.out.println(result);
	}
	public static void main(String[] args)
	{
		sector(12,23);
		sector(11,22);
	}
}
