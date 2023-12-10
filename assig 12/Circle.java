class Circle
{
	double area(){
		int r=3;
		final double pi = 3.142;
		double result = pi*r*r;
		return(result);
	}
	public static void main(String [] args)
	{
		Circle c1 = new Circle();
		 double x = c1.area();
		 System.out.println(x);
	}
}