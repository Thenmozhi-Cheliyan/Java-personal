
public class PermanentEmployee extends Employee
{
	double hike=0.5;
	double incSal;
	double updatedHra,updatedPf;
	
	public void incrementedSalary()
	{
		incSal=(salary+(salary*hike));
	}
	// override
	public void calculateAllowances()
	{
		super.calculateAllowances();
		updatedHra=(2*incSal)/100;
		updatedPf=(3*incSal)/100;
	}
	// override
	public void print_Details()
	{
		super.print_Details();
		System.out.println("*********Permanent Employee*********");
		System.out.println("The incremented Salary of permanent Employee is "+incSal);
		System.out.println("New HRA = "+updatedHra);
		System.out.println("New PF = "+updatedPf);
	}
}
