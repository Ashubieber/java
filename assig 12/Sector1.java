class Sector1
{
	void sec(int r,int ti){
	
		double result = 0.5*r*r*ti;
		System.out.println(result);
	}
	public static void main(String [] args)
	{
		Sector1 c1 = new Sector1();
		c1.sec(5,30);
	}
}