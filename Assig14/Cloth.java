class Cloth
{
	int cloth_cost;
	String cloth_color;
	char cloth_size;
	Cloth(int a, String b, char c)
	{
		cloth_cost=a;
		cloth_color=b;
		cloth_size=c;
	}

	public static void main(String[] args) 
	{
		Cloth cloth= new Cloth(15000,"black",'L');
		System.out.println(cloth.cloth_cost);
		System.out.println(cloth.cloth_color);
		System.out.println(cloth.cloth_size);
	}
}