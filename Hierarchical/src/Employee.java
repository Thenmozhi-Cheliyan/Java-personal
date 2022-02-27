import java.util.*;
public class Employee
{
	float hra,pf;
	public static Scanner sc=new Scanner(System.in);
	public static float salary=sc.nextFloat();
	// method to be override
	public void calculateAllowances()
	{
		hra=2*salary/100;
		pf=3*salary/100;
	}
	//method to be override
	public void print_Details()
	{
		System.out.println("*********Employee*********");
		System.out.println("Initial Salary = "+salary);
		System.out.println("HRA = "+hra);
		System.out.println("PF = "+pf);
	}	
}
