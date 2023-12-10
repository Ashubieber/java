class Emmp 
{
	int emp_id;
	int emp_sal;
	char emp_grade;
	Emmp(int a, int b, char c)
	{
			emp_id=a;
		    emp_sal=b;
		    emp_grade=c;
	}

	public static void main(String[] args) 
	{
		Emmp emp= new Emmp(534853,500000,'A');
		System.out.println(emp.emp_id);
		System.out.println(emp.emp_sal);
		System.out.println(emp.emp_grade);
	}
}
