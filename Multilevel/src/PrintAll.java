
public class PrintAll extends Calculate 
{
	void print_personal_details()
	{
		System.out.println("NAME\t\t : "+name);
		System.out.println("ROLL NUMBER\t : "+rno);
		System.out.println("GENDER\t\t : "+gender);
		System.out.println("AGE\t\t : "+age);
		System.out.println("MOBILE NUMBER\t : "+mblno);
		System.out.println("ADDRESS\t\t : "+residence);
	}
	void print_academic_details()
	{
		System.out.println("DEPARTMENT\t : "+department);
		System.out.println("COURSE\t\t : "+course);
		System.out.println("TOTAL\t\t : "+total);
		System.out.println("AVERAGE\t\t : "+avg);
		System.out.println("GRADE\t\t : "+grade);
	}
}
