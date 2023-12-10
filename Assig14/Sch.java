class Sch
{
	String school_name;
	char school_grade;
	String school_strength;
	Sch(String a, char b, String c)
	{
		school_name=a;
		school_grade=b;
		school_strength=c;
	}

	public static void main(String[] args) 
	{
		Sch school= new Sch("H.M.H.S",'A',"Eductation");
		System.out.println(school.school_name);
		System.out.println(school.school_grade);
		System.out.println(school.school_strength);
	}
}
