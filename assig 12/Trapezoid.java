class Trapezoid
{
	double tra(){
		int a=3;
		int b=2;
		int h=2;
		double result = 0.5*(a+b)*h;
		return(result);
	}
	public static void main(String [] args)
	{
		Trapezoid t1 = new Trapezoid();
		 double x = t1.tra();
		 System.out.println(x);
	}
}