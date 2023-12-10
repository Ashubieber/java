class Laap
{
	int laptop_cost;
	String laptop_name;
	String laptop_brand;

	Laap(int laptop_cost,String laptop_name, String laptop_brand)
	{
		this.laptop_cost=laptop_cost;
		this.laptop_name=laptop_name;
		this.laptop_brand=laptop_brand;
	}
	public static void main(String[] args) 
	{
		Laap l1 = new Laap(500000,"Nitro5","ACER");
		System.out.println(l1.laptop_cost);
		System.out.println(l1.laptop_name);
		System.out.println(l1.laptop_brand);
	}
}