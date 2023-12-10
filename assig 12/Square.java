class Square
{
	double sqr(){
		int a=3;
		
		
		double result = a*a;
		return(result);
	}
	public static void main(String [] args)
	{
		Square c1 = new Square();
		 double x = c1.sqr();
		 System.out.println(x);
	}
}

