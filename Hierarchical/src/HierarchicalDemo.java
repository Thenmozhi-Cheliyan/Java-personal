
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
