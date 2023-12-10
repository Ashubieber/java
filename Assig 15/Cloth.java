class Cloth
{
	int cloth_cost;
	char cloth_size;
	String cloth_color;

	Cloth(int cloth_cost,char cloth_size, String cloth_color)
	{
		this.cloth_cost=cloth_cost;
		this.cloth_size=cloth_size;
		this.cloth_color=cloth_color;
	}
	public static void main(String[] args) 
	{
		Cloth c1 = new Cloth(100238,'L',"Black&white");
		System.out.println(c1.cloth_cost);
		System.out.println(c1.cloth_size);
		System.out.println(c1.cloth_color);
	}
}
