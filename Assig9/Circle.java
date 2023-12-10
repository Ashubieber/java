class Circle 
{
     void circle() 
	{
		 int r = 20;
		 final Double pi = 3.142;
		 double result = ( pi * r * r);
		System.out.println(result);
	}
	public static void main(String[] args)
	{
		new Circle().circle();
	}
}
