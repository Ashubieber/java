class Rectangle
{
	double rec(){
		int h=3;
		int w=2;
		
		double result = w*h;
		return(result);
	}
	public static void main(String [] args)
	{
		Rectangle c1 = new Rectangle();
		 double x = c1.rec();
		 System.out.println(x);
	}
}
