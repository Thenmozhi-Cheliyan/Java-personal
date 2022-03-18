package pojo;

public class Student 
{
	private String student_Name,standrad,grade;
	private int roll_no;
	private int age;
	
	public Student()
	{
		System.out.println("\t \t Student Details \n ");
	}
	public Student(String student_Name,int roll_no,int age,String standard,String grade)
	{
		this.student_Name=student_Name;
		this.roll_no=roll_no;
		this.age=age;
		this.standrad=standard;
		this.grade=grade;
	}

	public String getStudent_Name()
	{
		return student_Name;
	}

	public String getStandrad()
	{
		return standrad;
	}

	public int getRoll_no()
	{
		return roll_no;
	}

	public int getAge() 
	{
		return age;
	}

	public String getGrade() 
	{
		return grade;
	}	
}
