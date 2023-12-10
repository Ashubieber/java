class Parallogram
{
	double para(){
		int h=3;
		int b=2;
		
		double result = h*b;
		return(result);
	}
	public static void main(String [] args)
	{
		Parallogram c1 = new Parallogram();
		 double x = c1.para();
		 System.out.println(x);
	}
}
