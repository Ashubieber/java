class Trapezoid1
{
	void tra(int a,int b,int h){
	
		double result = 0.5*(a+b)*h;
		System.out.println(result);
	}
	public static void main(String [] args)
	{
		Trapezoid1 c1 = new Trapezoid1();
		c1.tra(5,6,8);
	}
}
