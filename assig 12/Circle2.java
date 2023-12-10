class Circle2
{
	void area(){
		final double pi=3.142;
		int r = 13;
		double result = pi*r*r;
		System.out.println(result);
	}
	public static void main(String [] args)
	{
		Circle2 c1 = new Circle2();
		c1.area();
	}
}