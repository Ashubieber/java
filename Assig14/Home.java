class Home 
{
	int home_cost;
	String home_color;
	String home_name;
	Home(int a, String b, String c)
	{
		home_cost=a;
		home_color=b;
		home_name=c;
	}

	public static void main(String[] args) 
	{
		Home home= new Home(150000,"white&colden","Golden Villa");
		System.out.println(home.home_cost);
		System.out.println(home.home_color);
		System.out.println(home.home_name);
	}
}
