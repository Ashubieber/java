class Coor 
{
	int course_cost;
	String course_name;
	String univ_name;

	Coor(int course_cost,String course_name, String univ_name)
	{
		this.course_cost=course_cost;
		this.course_name=course_name;
		this.univ_name=univ_name;
	}
	public static void main(String[] args) 
	{
		Coor c1 = new Coor(358238,"Fullstack","Q-spider");
		System.out.println(c1.course_cost);
		System.out.println(c1.course_name);
		System.out.println(c1.univ_name);
	}
}