class Laap 
{
	int laptop_cost;
	String laptop_name;
	String laptop_brand;
	Laap(int a, String b, String c)
	{
		laptop_cost=a;
		laptop_name=b;
		laptop_brand=c;
	}

	public static void main(String[] args) 
	{
		Laap laptop= new Laap(750000,"Mackbook Air 2","Apple");
		System.out.println(laptop.laptop_cost);
		System.out.println(laptop.laptop_name);
		System.out.println(laptop.laptop_brand);
	}
}
