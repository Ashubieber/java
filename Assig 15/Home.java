class Home
{
	int home_cost;
	String home_name;
	String home_color;

	Home(int home_cost,String home_name, String home_color)
	{
		this.home_cost=home_cost;
		this.home_name=home_name;
		this.home_color=home_color;
	}
	public static void main(String[] args) 
	{
		Home h1 = new Home(5050500,"Golden Villa","Blue&white");
		System.out.println(h1.home_cost);
		System.out.println(h1.home_name);
		System.out.println(h1.home_color);
	}
}
