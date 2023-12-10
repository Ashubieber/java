class Tvv
{
	int tv_cost;
	String tv_brand;
	String tv_type;
	Tvv(int a, String b, String c)
	{
		tv_cost=a;
		tv_brand=b;
		tv_type=c;
	}

	public static void main(String[] args) 
	{
		Tvv tv= new Tvv(75000,"MI","LCD");
		System.out.println(tv.tv_cost);
		System.out.println(tv.tv_brand);
		System.out.println(tv.tv_type);
	}
}