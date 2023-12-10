class Caar 
{
	int car_cost;
	String car_brand;
	String car_color;

	Caar(int car_cost,String car_brand, String car_color)
	{
		this.car_cost=car_cost;
		this.car_brand=car_brand;
		this.car_color=car_color;
	}
	public static void main(String[] args) 
	{
		Caar c1 = new Caar(10538238,"BMW","Blue&white");
		System.out.println(c1.car_cost);
		System.out.println(c1.car_brand);
		System.out.println(c1.car_color);
	}
}