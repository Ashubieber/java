class Caar 
{
	int car_cost;
	String car_color;
	String car_brand;
	Caar(int a, String b, String c)
	{
		car_cost=a;
		car_color=b;
		car_brand=c;
	}

	public static void main(String[] args) 
	{
		Caar car= new Caar(1500000,"Darkblack","BMW");
		System.out.println(car.car_cost);
		System.out.println(car.car_color);
		System.out.println(car.car_brand);
	}
}
