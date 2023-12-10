class Circle 
{
	 final static double globalPi=3.142;
    static double area() 
	{
		final Double pi=3.142;
		int r =5;
		Double result=(pi * r* r);
	//	System.out.println(result);
          return result;

	}
     static double perimeter()
		 {
		 int r = 5;
		 Double result=(2 * globalPi * r); 
		 return result;
	 }
	public static void main(String[] args)
	{
		Double p= perimeter();
		Double r= area();
			System.out.println(r);
			System.out.println(p);
	}
}
