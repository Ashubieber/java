class Circle1
{
	void area(int r){
	final double pi = 3.142;
		double result = pi*r*r;
		System.out.println(result);
	}
	public static void main(String [] args)
	{
		Circle1 c1 = new Circle1();
		c1.area(5);
	}
}