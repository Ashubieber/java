class Bikk 
{
	int bike_cost;
	String bike_brand;
	String bike_color;

	Bikk(int bike_cost,String bike_brand, String bike_color)
	{
		this.bike_cost=bike_cost;
		this.bike_brand=bike_brand;
		this.bike_color=bike_color;
	}
	public static void main(String[] args) 
	{
		Bikk b1 = new Bikk(9538238,"BMW","Blue&white");
		System.out.println(b1.bike_cost);
		System.out.println(b1.bike_brand);
		System.out.println(b1.bike_color);
	}
}