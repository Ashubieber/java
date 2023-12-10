class flipcart 
{
	 static void homePage()
	{
		System.out.println("homePage");
	}
	static void logOut()
	{
		System.out.println("logout");
	}
	static void login()
	{
		System.out.println("login");
	}
	public static void main(String[] args)
	{
		  signup();
		  login();
		homePage();
	        cart();
		  logOut();

	}
	static void signup()
	{
		System.out.println("signup");
	}
	static void cart()
	{
		System.out.println("cart");
	}
}
