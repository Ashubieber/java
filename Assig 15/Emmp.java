class Emmp
{
	int emp_id;
	int emp_sal;
	char emp_grade;

	Emmp(int emp_id,int emp_sal, char emp_grade)
	{
		this.emp_id=emp_id;
		this.emp_sal=emp_sal;
		this.emp_grade=emp_grade;
	}
	public static void main(String[] args) 
	{
		Emmp e1 = new Emmp(13478,900000,'c');
		System.out.println(e1.emp_id);
		System.out.println(e1.emp_sal);
		System.out.println(e1.emp_grade);
	}
}