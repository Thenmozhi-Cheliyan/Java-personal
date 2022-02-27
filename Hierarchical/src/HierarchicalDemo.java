
public class HierarchicalDemo 
{

	public static void main(String[] args)
	{
		System.out.println("Enter Salary:");
		PermanentEmployee pe=new PermanentEmployee();
		
		
		pe.incrementedSalary();
		pe.calculateAllowances();
		pe.print_Details();
		
		TemproraryEmployee te=new TemproraryEmployee();
		System.out.println("*********Temproroay Employee*******");

		te.incrementedSalary();
		te.calculateAllowances();
		te.print_Details();

	}

}

/*	Output
 Enter Salary:
40000
*********Employee*********
Initial Salary = 40000.0
HRA = 800.0
PF = 1200.0
*********Permanent Employee*********
The incremented Salary of permanent Employee is 60000.0
New HRA = 1200.0
New PF = 1800.0
*********Temproroay Employee*******
The incremented Salary of Temprorary Employee is 54000.0
New HRA = 1080.0
New PF = 1620.0

*/