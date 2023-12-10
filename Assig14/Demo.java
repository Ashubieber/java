class Demo 
{
	static int i=20;
	static void m1()
	{
		i = 100;
		System.out.println(i);

	}
	public static void main(String[] args)
	{
		System.out.println(i);
		m1();
		System.out.println(i);
	}
}
